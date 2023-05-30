package com.loginTest;

//import com.beust.jcommander.IDefaultProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class baseTest {

    protected WebDriver driver;

    @Parameters({"browser"})
    @BeforeTest
    public void setUp(String BrowserName) throws MalformedURLException {

        switch (BrowserName) {
            case "chrome":

                ChromeOptions options =new ChromeOptions();
                //options.addArguments("start-maximized");
                //options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
                //options.setExperimentalOption("useAutomationExtension", false);
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName", "chrome");
                capabilities.setCapability("enableVNC", true);
                capabilities.setCapability("enableVideo", false);
                 driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);

                //driver = new ChromeDriver(options);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("please pass the browser");
                break;
        }


        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        }

    @AfterTest
    public void teardown(){
        driver.quit();
    }


}
