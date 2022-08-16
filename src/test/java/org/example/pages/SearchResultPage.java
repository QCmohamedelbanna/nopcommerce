package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultPage {

    public WebElement clickOnProduct(){
        return Hooks.driver.findElement(By.className("item-box"));
    }
    public String getTextValue(){
        return Hooks.driver.findElement(By.xpath("//div[@class='basic-search']//div//input[1]")).getAttribute("value");
    }
}
