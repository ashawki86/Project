package com.qacart.todo.Testcases;

import com.qacart.todo.Base.BaseTest;
import com.qacart.todo.Factory.DriverFactory;
import com.qacart.todo.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Base64;

public class LoginTest extends BaseTest {

    @Test
    public void LoginWithValidEmailAndValidPassword(){

        driver.get("https://qacart-todo.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("ashawki86@gmail.com","Aa123456#");
        boolean WelcomeMessage = driver.findElement(By.cssSelector("[data-testid=\"welcome\"]")).isDisplayed();

        Assert.assertTrue(WelcomeMessage);



    }
}
