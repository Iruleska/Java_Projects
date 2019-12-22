package com.it;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMy {
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("@BeforeClass");
            }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("AfterClass()");

    }

    @Test
    public void test1() {
        System.out.println(" test1()");
    }
    @Test
    public void test2() {
        System.out.println(" test2()");
    }
    @Test
    public void test3() {
        System.out.println(" test3()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }
    /*public void test1() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com");
        Assert.assertEquals("https://mvnrepository.com/",driver.getCurrentUrl());
        driver.quit();

    }*/
    }

