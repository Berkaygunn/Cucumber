package StepDefinitions;

import Utulities.GWD;
import Utulities.GWD_old;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After
    public void after(Scenario senaryo){
        System.out.println("Senaryo bitti");

//        ExcelUtility.writeExcel("src/test/java/ApachePOI/resource/ScenarioStatus.xlsx",
//                senaryo, GWD.threadBrowserGet());


        if (senaryo.isFailed()){
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            final byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png","screenshot");
        }


        GWD.quitDriver();

    }
}
