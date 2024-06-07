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
                "rerun:target/failedScenarios.txt",//Fail olan testleri bu text dosyasına yazar ve tekara çalıştırılmalarına yardımcı olur.
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//Spark Report için
                "pretty"//Konsola daha güzel renkli yazdırma yapar.
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Failed",
        dryRun =false//'dryRun = true' testi çalıştırmaz, eksik step deinitionları bulur.
)

public class Runner {
}

/*
        Feature File (Özellik Dosyası): Kullanıcı hikayeleri veya senaryolarını Gherkin dilinde tanımlar.
        Bir proje için ne yapılması gerektiğini belirten test senaryolarını içerir.

        Scenario (Senaryo): Belirli bir testi temsil eder. Her senaryo, belirli bir işlevin nasıl çalışması
        gerektiğini gösterir.

        Step (Adım): Senaryolardaki bireysel test adımlarıdır. "Given", "When", "Then", "And", "But" gibi anahtar kelimelerle başlar.

        Given (Ön Koşul): Testin başlangıç durumunu tanımlar.
        When (Durum): Bir eylemi veya olayı tanımlar.
        Then (Sonuç): Eylemin sonucunu veya beklenen durumu tanımlar.
        And (Ve): Birden fazla adımı bağlamak için kullanılır.
        But (Fakat): Bir istisnai durumu tanımlar.
        Step Definitions (Adım Tanımlamaları): Senaryo adımlarının nasıl yürütüleceğini belirten kod parçalarıdır.
        Adımların arka planda nasıl işleneceğini tanımlar.

        Background (Arka Plan): Her senaryodan önce çalıştırılan ortak adımları içerir. Tekrarlanan hazırlık adımlarını tanımlar.

        Tags (Etiketler): Senaryoları kategorize etmeye yarar. Testlerin belirli bir alt kümesini çalıştırmak için kullanılır.

        Örnek: @SmokeTest, @RegressionTest.
        Hooks (Kancalar): Testler öncesi ve sonrasında çalıştırılması gereken kod parçalarını tanımlar.
        @Before ve @After anotasyonları ile kullanılır.

        @Before: Testlerden önce çalıştırılır.
        @After: Testlerden sonra çalıştırılır.
        Gherkin: Cucumber'da kullanılan iş kurallarını tanımlamak için kullanılan dil. Kolay anlaşılır,
        doğal dilde yazılmıştır. Feature, Scenario, Given, When, Then gibi anahtar kelimelerle yapısını oluşturur.
 */