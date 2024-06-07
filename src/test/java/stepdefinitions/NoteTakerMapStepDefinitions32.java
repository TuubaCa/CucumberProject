package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import pages.NoteTakerPage;

import java.util.Map;

public class NoteTakerMapStepDefinitions32 {
    NoteTakerPage noteTakerPage = new NoteTakerPage();

    @When("user enters titles and notes and clicks on add")
    public void user_enters_titles_and_notes_and_clicks_on_add(DataTable dataTable) throws InterruptedException {

        Map<String, String> titleNotes= dataTable.asMap();
        for (Map.Entry<String, String> w : titleNotes.entrySet()) {
            String title = w.getKey();
            String notes = w.getValue();

            noteTakerPage.title.sendKeys(title);
            noteTakerPage.notes.sendKeys(notes);
            noteTakerPage.add.click();
        }

    }



}
