package com.example.selenium;

import com.example.selenium.steps.UserSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;
    protected String loginURL = "https://the-internet.herokuapp.com/login";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(loginURL);
        driver.manage().window().maximize();

        userSteps = new UserSteps(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
