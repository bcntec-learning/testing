package houseware.learn.testing.selenium.drivers;

import houseware.learn.testing.selenium.AbstractSeleniumTest;
import houseware.learn.testing.selenium.simple.GoogleTest;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ITestChromeDriver extends AbstractSeleniumTest {

    private static WebDriver webDriver;


    public WebDriver getWebDriver() {
        return webDriver;
    }

    @BeforeClass
    public static void createAndStartDriver() throws IOException {
        ChromeTestUtils.configureDriver();
        webDriver = new ChromeDriver();
    }


    @After
    public void quitDriver() {
        webDriver.quit();
    }

    @Test
    public void testGoogleSearchShowcase() {
        GoogleTest.google_search_showcase(webDriver);
    }


}