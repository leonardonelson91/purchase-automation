package com.wipro.quality.engineering.interview;

import com.wipro.quality.engineering.interview.pages.MercadoLivrePage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class PurchaseTests {

    private static ChromeDriverService service;
    private WebDriver driver;
    private MercadoLivrePage home;

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
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void testPurchaseProducts() {
        MercadoLivrePage home = new MercadoLivrePage(driver);
        home.visit();
        home.findProduct("Pebolim");
        home.submitSearch();



    }
}
