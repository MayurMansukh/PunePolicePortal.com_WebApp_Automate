/**
 * Description : add punePolicPortal.com epass form
 * Author      : Mayur Mansukh
 * Date        : 11/6/21
 */
package com.bridgelabz.pages;

import com.bridgelabz.listener.CustomListener;
import com.bridgelabz.utils.DataDrivenMethod;
import com.bridgelabz.utils.FileUploadWithAutoItScript;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import java.io.IOException;

@Listeners(CustomListener.class)
public class PunePolicePortalPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"post-5890\"]/div/table[10]/tbody/tr[2]/td[2]/a")
    WebElement portal;

    @FindBy(xpath = "/html/body/div[2]/form/div/div/div[3]/div/select")
    WebElement department;

    @FindBy(id = "FullName")
    WebElement name;

    @FindBy(id = "Hospital_Name")
    WebElement officeId;

    @FindBy(id = "Sex")
    WebElement gender;

    @FindBy(id = "DOB")
    WebElement DateOfBirth;

    @FindBy(id = "MobileNo")
    WebElement phone;

    @FindBy(id = "AirPort_FlightNo")
    WebElement adharNo;

    @FindBy(id = "FromDateTime")
    WebElement fromDate;

    @FindBy(id = "ToDateTime")
    WebElement toDate;

    @FindBy(id = "Other_FromLocation")
    WebElement fromLocation;

    @FindBy(id = "Other_ToLocation")
    WebElement toLocation;

    @FindBy(id = "Hospital_Aliment")
    WebElement remark;

    @FindBy(id = "Hospital_SufferingOrAssist")
    WebElement terms_condition;

    DataDrivenMethod drivenMethod = new DataDrivenMethod();

    public PunePolicePortalPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void PunePortalSwitchTo(){
        driver.get("https://www.punepolice.in/");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"\t");
    }


    public void select_department(){
        department.click();
        department.sendKeys(Keys.ARROW_DOWN);
        department.sendKeys(Keys.ENTER);
    }

    public void enterName() throws IOException {
        name.sendKeys(drivenMethod.userName());
    }

    public void enterOfficeId() throws IOException {
        officeId.sendKeys(drivenMethod.officeId());
    }

    public void uploadDocument1(){
        officeId.sendKeys(Keys.TAB,Keys.ENTER);
        FileUploadWithAutoItScript upload = new FileUploadWithAutoItScript();
        upload.fileUpload();
    }

    public void uploadDocument2(){
        officeId.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
        FileUploadWithAutoItScript upload = new FileUploadWithAutoItScript();
        upload.fileUpload();
    }

    public void uploadDocument3(){
        officeId.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        FileUploadWithAutoItScript upload = new FileUploadWithAutoItScript();
        upload.fileUpload();
    }

    public void selectGender(){
        gender.click();
        gender.sendKeys(Keys.ARROW_DOWN);
        gender.sendKeys(Keys.ENTER);
    }

    public void selectBithDate() throws IOException {
        DateOfBirth.click();
        DateOfBirth.sendKeys(drivenMethod.birthDate());
        DateOfBirth.sendKeys(Keys.ENTER);
    }

    public void enterPhone() throws IOException {
        phone.sendKeys(drivenMethod.phone());
    }

    public void enterAdhar() throws IOException {
        adharNo.sendKeys(drivenMethod.adhar());
    }

    public void selectFromDate() throws IOException {
        fromDate.click();
        fromDate.sendKeys(drivenMethod.selectFromDate());
        fromDate.sendKeys(Keys.ENTER);
    }

    public void selectToDate() throws IOException {
        toDate.click();
        toDate.sendKeys(drivenMethod.selectToDate());
        toDate.sendKeys(Keys.ENTER);
    }

    public void selectFromLocation(){
        fromLocation.click();
        fromLocation.sendKeys(Keys.ARROW_DOWN);
        fromLocation.sendKeys(Keys.ENTER);

    }

    public void selectToLocation(){
        toLocation.click();
        toLocation.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        toLocation.sendKeys(Keys.ENTER);

    }

    public void enterRemark() throws IOException {
        remark.click();
        remark.sendKeys(drivenMethod.enterRemark());
    }

    public void covidReport(){
        remark.sendKeys(Keys.TAB,Keys.ENTER);
        FileUploadWithAutoItScript upload = new FileUploadWithAutoItScript();
        upload.fileUpload();
    }

    public void selectTerms_And_Condition(){
        terms_condition.click();
    }





}
