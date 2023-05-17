package StepDefinitions;

import Utulities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void after(Scenario senaryo){
        System.out.println("Senaryo bitti");


        if (senaryo.isFailed()){
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            final byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png","screenshot");
        }


        GWD.quitDriver();

    }
}
