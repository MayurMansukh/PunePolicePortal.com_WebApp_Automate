package com.bridgelabz.base;

import com.bridgelabz.utils.ExtentReport;
import com.bridgelabz.utils.checkInternerConnection;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Base {

    public static WebDriver driver;
    public static Logger logger = Logger.getLogger(String.valueOf(Base.class));
    checkInternerConnection connection = new checkInternerConnection();
    //ExcelReport report = new ExcelReport();
    ExtentReport extentReport = new ExtentReport();
    @BeforeTest
    public void setup()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://blog.savaari.com/covid-travel-pass/ ");
        connection.check_internet_connectivity(); // check internet connection
        extentReport.startTest();

    }

    @AfterTest
    public void teardown() throws Exception {
        extentReport.endTest();
        //report.ExcelReport();
        driver.close();
    }
}
