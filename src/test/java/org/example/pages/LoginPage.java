package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebElement enterEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement enterPassword(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement clickOnLoginButton(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"buttons\"]//button[@class=\"button-1 login-button\"]"));
    }

    public Boolean checkMyAccountLinkDisplayed(){
        return Hooks.driver.findElement(By.xpath("//div[@class='header-links']//ul//li//a[@href=\"/customer/info\"]")).isDisplayed();
    }
    public String checkLoginSuccessfullyByCurrentUrl(){
        return Hooks.driver.getCurrentUrl();
    }

    public WebElement checkUnsuccessfulLogin(){
        return Hooks.driver.findElement(By.xpath("//form[@method='post']//div[@class='message-error validation-summary-errors']"));
    }
}
