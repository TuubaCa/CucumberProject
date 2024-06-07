@Validation
Feature: Form Test Feature

  Background: User goes to homepage
    Given user goes to url "https://testpages.eviltester.com/styled/validation/input-validation.html"

  @PositiveTests
  Scenario Outline: Form Validation Test
    When user enters form firstname "<firstname>"
    And user enters form lastname "<lastname>"
    And user enters form age "<age>"
    And user selects form country "<country>"
    And user enters form notes "<notes>"
    And user clicks on form gonder
    And user closes the browser
    Examples:
      | firstname | lastname   | age | country | notes          |
      | john      | doedoedoee | 25  | Mali    | umarim calisir |

  @Negative
  Scenario Outline: Not Select Country Tests
    When user enters form firstname "<firstname>"
    And user enters form lastname "<lastname>"
    And user not enters form age "<age>"
    And user selects form country "<country>"
    And user enters form notes "<notes>"
    And user clicks on form gonder
    And user validates error message about age
    And user closes the browser
    Examples:
      | firstname | lastname   | age | country | notes          |
      | john      | doedoedoee |     | Mali    | umarim calisir |

  @Negative
  Scenario Outline: Wrong Lastname Tests
    When user enters form firstname "<firstname>"
    And user enters form wrong lastname "<lastname>"
    And user enters form age "<age>"
    And user selects form country "<country>"
    And user enters form notes "<notes>"
    And user validates error message about lastname
    And user closes the browser
    Examples:
      | firstname | lastname | age | country | notes          |
      | john      | d        | 25  | Mali    | umarim calisir |