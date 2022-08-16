package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    public WebElement clickOnRegisterLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
    }
    public WebElement clickOnLoginLink(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }
    public WebElement clickOnCurrency(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public WebElement selectCurrency(){
        return Hooks.driver.findElement(By.xpath("//select[@id='customerCurrency']//option[2]"));
    }
    public String checkSelectedCurrency() {
        List<WebElement> elements= Hooks.driver.findElements(By.className("prices"));
        String text = null;
        for (int i = 0; i < elements.size(); i++) {

            text = elements.get(i).getText();
        }
        return text;
    }
    public WebElement searchForProduct(){
        return Hooks.driver.findElement(By.xpath("//form[@action='/search']//input"));
    }

    public WebElement clickOnSearch(){
        return Hooks.driver.findElement(By.xpath("//form[@action='/search']//button"));
    }
    public String checkTheNewUrl(){
        return Hooks.driver.getCurrentUrl();
    }
    public String checkCountNumberOfSearchResults(){
        List<WebElement> elements = Hooks.driver.findElements(By.className("product-title"));
        String text = null;
        for (int i=0; i < elements.size(); i++){
           text = elements.get(i).getText();
        }
        return text;
    }
    public WebElement firstSlider(){
        return Hooks.driver.findElement(By.cssSelector("div[class='nivo-controlNav'] a[class='nivo-control active']"));
    }
    public WebElement secondSlider(){
        return Hooks.driver.findElement(By.cssSelector("div[class='nivo-controlNav'] a[class='nivo-control']"));
    }
    public WebElement faceBook(){
        return Hooks.driver.findElement(By.cssSelector("ul[class='networks'] li a[href='http://www.facebook.com/nopCommerce']"));
    }
    public WebElement twitter(){
        return Hooks.driver.findElement(By.cssSelector("ul[class='networks'] li a[href='https://twitter.com/nopCommerce']"));
    }
    public WebElement rss(){
        return Hooks.driver.findElement(By.cssSelector("ul[class='networks'] li a[href='/news/rss/1']"));
    }
    public WebElement youTube(){
        return Hooks.driver.findElement(By.cssSelector("ul[class='networks'] li a[href='http://www.youtube.com/user/nopCommerce']"));
    }
    public WebElement addToWishlistBtn(){
        return Hooks.driver.findElement(By.cssSelector("div[class='item-grid'] div div[data-productid='18'] div[class='details'] div[class='add-info'] div[class='buttons'] button[title='Add to wishlist']"));
    }
    public WebElement backGroundColor(){
        return Hooks.driver.findElement(By.cssSelector("div[id='bar-notification'] div"));
    }
    public WebElement successfulMessageText(){
        return Hooks.driver.findElement(By.cssSelector("div[id='bar-notification'] div p"));
    }
    public WebElement wishListLink(){
        return Hooks.driver.findElement(By.cssSelector("div[class='header-links'] ul li a[href='/wishlist']"));
    }

}
