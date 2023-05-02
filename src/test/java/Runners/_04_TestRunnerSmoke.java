package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        tags = "@SmokeTest", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin ={"html:target/generated-test-sources.html"}
        // plugin normalde yok, jenkins için ekleniyor
)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {

}
