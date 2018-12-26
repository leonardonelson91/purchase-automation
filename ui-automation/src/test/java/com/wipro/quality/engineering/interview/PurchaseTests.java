package com.wipro.quality.engineering.interview;

import com.wipro.quality.engineering.interview.pages.ProductPage;
import com.wipro.quality.engineering.interview.pages.ResultsPage;
import com.wipro.quality.engineering.interview.pages.ShoppingPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.ResultSet;

public class PurchaseTests {

    private static ChromeDriverService service;
    private WebDriver driver;
    private ShoppingPage objShop;
    private ResultsPage objResults;
    private ProductPage objProduct;

    @BeforeClass
    public static void createAndStartService() throws IOException, URISyntaxException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(PurchaseTests.class.getResource("/drivers/chromedriver.exe").toURI()))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    @AfterClass
    public static void createAndStopService() {
        service.stop();
    }

    @Before
    public void createDriver() {
        driver = new ChromeDriver(service,
                DesiredCapabilities.chrome());

        driver.get("https://mercadolivre.com.br");

        objShop = new ShoppingPage(driver);
        objResults = new ResultsPage(driver);
        objProduct = new ProductPage(driver);
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void testPurchaseProducts() {
        objShop.searchStuff("fragmentadora");
        objShop.clickSearch();

        objResults.clickFirst();

        objProduct.addShoppingCart();
    }

}
