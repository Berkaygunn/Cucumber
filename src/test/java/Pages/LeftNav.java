package Pages;

import Utulities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    public WebElement entranceExams;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    public WebElement entranceSetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement  entranceExams2;

    @FindBy(xpath="//span[text()='States']")
    public WebElement states;



    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "setup" : return setup;
            case "parameters" : return parameters;
            case "countries" : return countries;
            case "citizenShip" : return citizenShip;
            case "nationalities" : return nationalities;
            case "fees" : return fees;
            case "entranceExams" : return entranceExams;
            case "entranceSetup" : return entranceSetup;
            case "entranceExams2" : return entranceExams2;
            case "states" : return states;
        }

        return null;
    }





}
