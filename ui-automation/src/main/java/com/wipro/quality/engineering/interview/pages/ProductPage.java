package com.wipro.quality.engineering.interview.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage extends AbstractPage {

    By addToCart = By.xpath("//*[@id=\"productInfo\"]/div[4]/div/div/input[3]");
    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void addShoppingCart() {
        webDriver.findElement(addToCart).click();
    }
}
