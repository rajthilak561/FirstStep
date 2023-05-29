package com.loginTest;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintestcls extends baseTest {

    @Test
    public void loginpagetest(){
        Assert.assertEquals(driver.getTitle(),"account/login");
    }

    @Test
    public void Loginpagelogo(){
        Assert.assertEquals((driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")).isDisplayed()),true);
    }

}
