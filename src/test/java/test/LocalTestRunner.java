package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;


public class LocalTestRunner {
    private String url = "https://test.portal.tadbeeradmin.com/";
    private static WebDriver driver;
    protected WebDriver launch() throws InterruptedException {
        WebDriver driver = getDriver();
        driver.get(url);
       // driver.manage().window().maximize();
        Dimension d = new Dimension(2048,500);
       driver.manage().window().setSize(d);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        return driver;
    }
    protected WebDriver getDriver() throws InterruptedException {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            driver = new ChromeDriver(chromeOptions);
            launch();
            Thread.sleep(2000);
        }

        return driver;
    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
        driver = null;
    }
}

