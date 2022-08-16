package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DesktopsPage {
    public String getPageTitle(){
        return Hooks.driver.getTitle();
    }

    public WebElement titleText(){
        return Hooks.driver.findElement(By.cssSelector("div[class='page-title'] h1"));
    }
}
