package com.it;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMy {
    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com");
        Assert.assertEquals("https://mvnrepository.com/",driver.getCurrentUrl());
        driver.quit();
    }


}
