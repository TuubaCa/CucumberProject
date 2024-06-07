package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
 
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/reports/html-reports/default-cucumber-reports.html",//html formatında rapor için
                "json:target/reports/json-reports/cucumber1.json",//json formatında rapor için
                "junit:target/reports/xml-reports/cucumber1.xml",//xml formatında rapor için
                "rerun:target/failedScenarios.txt",//fail olan testleri bu text dosyasına yazar ve tekrara calişmasina yardımcı our
                "pretty",//pretty formatında(renkli) rapor için
        },
        features = "@target/failedScenarios.txt",// Fail olmus testleri failedScenarios.txt dosyasından bulur ve tekrar çaliştirir
        glue = "stepdefinitions"// Çalışacak Java kodlarının (step definitions) yeri
)

public class FailedScenarioRunner {
}

