package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", // Directorio de nuestros archivos .feature
                glue = "steps", // Paquete donde tenemos nuestras clases definiendo los steps
                plugin = { "pretty", "html:target/cucumber-reports" }, tags = "@Courses")

public class TestRunner {
        @AfterClass
        public static void cleanDriver() {
                BasePage.closeBrowser();
        }

}
