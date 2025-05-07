import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features"
        ,glue = {"StepDefinitions"}
        ,monochrome = true  // this for correct format in command line ...... optional
//      , tags = "@SmokeTest"            // Tags
//        ,plugin =
//        {
//        "pretty", "html:target/test-output/report.html"
//        ,"json:target/test-output/report.json"
//        ,"junit:target/test-output/report.junit"
//        }
        ,plugin = {"json:target/cucumber.json"}
        )

public class TestRunner {
}
