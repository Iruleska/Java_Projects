package com.it;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector;
import org.hamcrest.CoreMatchers;
import org.junit.*;

import java.util.Arrays;

public class TestMy1 {
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
        Assert.assertEquals("Error of failure","texa","text");
    }
    @Test
    public void test2() {
      Assert.assertThat("sfergsedrg", CoreMatchers.both(CoreMatchers.containsString("ad"))
              .and(CoreMatchers.containsString("bb")));
    }
    @Test
    public void test3() {
        Assert.assertThat(Arrays.asList("one", "two", "three"), CoreMatchers.hasItems("one","three"));
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

