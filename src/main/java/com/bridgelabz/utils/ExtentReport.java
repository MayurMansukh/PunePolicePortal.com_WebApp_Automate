/**
 * Description : add extent report method
 * Author      : Mayur Mansukh
 * Date        : 11/6/21
 */
package com.bridgelabz.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ExtentReport  {
    WebDriver driver;
    static ExtentTest test;
    static ExtentReports report;

    @BeforeClass
    public void startTest()
    {
        System.setProperty("org.freemarker.loggerLibrary", "none");
        report = new ExtentReports(System.getProperty("C:\\Users\\admin\\IdeaProjects\\PunePolicePortal")+"ExtentReportResults.html");
        test = report.startTest("Test_object_properties_method");
        System.out.println(System.getProperty("user.dir"));
    }

    @AfterClass
    public void endTest() {
        report.endTest(test);
        report.flush();
    }

}
