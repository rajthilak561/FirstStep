package com.loginTest;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintests extends baseTest {

    @Test
    public void loginpagetest(){
        Assert.assertEquals(driver.getTitle(),"Account Login");
    }

    @Test
    public void Loginpagelogo(){
        Assert.assertEquals((driver.findElement(By.xpath("//a[text()='Continue']")).isDisplayed()),true);
    }

}
