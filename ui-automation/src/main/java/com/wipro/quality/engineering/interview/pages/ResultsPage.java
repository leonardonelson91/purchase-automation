package com.wipro.quality.engineering.interview.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends AbstractPage {

    By firstItem = By.xpath("//*[contains(text(),'Fragmentadora Papel Preta Cesto Cd Cartão Grande Multilaser')]");
    public ResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickFirst() {
        webDriver.findElement(firstItem).click();
    }
}
