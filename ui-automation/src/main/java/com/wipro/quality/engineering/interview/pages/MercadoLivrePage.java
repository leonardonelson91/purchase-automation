package com.wipro.quality.engineering.interview.pages;

import com.wipro.quality.engineering.interview.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercadoLivrePage extends AbstractPage {

    WebDriver webDriver;

    WebElement fieldFindProducts = webDriver.findElement(By.name("as_word"));
    WebElement btnSearch = webDriver.findElement(By.className("nav-icon-search"));

    public MercadoLivrePage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }

    public void visit(){
        webDriver.get("https://www.mercadolivre.com.br/");
    }

    public void findProduct(String productName) {
        fieldFindProducts.sendKeys(productName);
    }

    public void submitSearch(){
        btnSearch.click();
    }



}
