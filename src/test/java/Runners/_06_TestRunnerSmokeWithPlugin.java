package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin ={"html:target/generated-test-sources.html"}  // basit rapor
)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
