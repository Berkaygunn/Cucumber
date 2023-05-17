package Pages;

import Utulities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveInput;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath="//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;

    @FindBy(xpath="//ms-integer-field[@formcontrolname='priority']/input")
    public WebElement priorityCode;

    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;

    @FindBy(xpath="//mat-select//span[text()='Academic Period']")
    public WebElement period;

    @FindBy(xpath="(//mat-option/span)[1]")
    public WebElement period2;

    @FindBy(xpath="//span[text()='Grade Level'][1]")
    public WebElement grade;

    @FindBy(xpath="(//mat-option//span)[2]")
    public WebElement grade2;

    @FindBy(xpath="//*[@id='container-2']/toolbar/mat-toolbar/div/div[1]/div[2]/button/span[1]/fa-icon")
    public WebElement back;

    @FindBy(xpath="//tr[contains(@class, 'mat-row')]/td[2]")
    public List<WebElement> nameList;




    public void deleteItem(String searchText){
        sendKeysFunction(searchInput,searchText);
        clickFunction(searchButton);  //fuse-progress-bar/*  gözüküyor

        //fuse-progress-bar/*    bu 0 olana kadar beklet
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*") , 0));

        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);
    }

    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "addButton" : return addButton;
            case "saveInput" : return saveInput;
            case "nameInput" : return nameInput;
            case "codeInput" : return codeInput;
            case "integrationCode" : return integrationCode;
            case "priorityCode" : return priorityCode;
            case "toggleBar" : return toggleBar;
            case "period" : return period;
            case "period2" : return period2;
            case "grade" : return grade;
            case "grade2" : return grade2;
            case "back" : return back;
        }

        return null;
    }

}
