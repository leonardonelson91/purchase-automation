package com.wipro.quality.engineering.interview.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

public class ShoppingPage extends AbstractPage {

    By searchBar = By.name("as_word");
    By searchButon = By.className("nav-search-btn");

    public ShoppingPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void searchStuff(String strSearch) {
        webDriver.findElement(searchBar).sendKeys(strSearch);
    }

    public void clickSearch() {
        webDriver.findElement(searchButon).click();
    }
}
