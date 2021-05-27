package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Users {
    protected WebDriver driver;
    private By createButton;

    public Users(WebDriver driver) {
        this.driver = driver;
        this.createButton = By.cssSelector("a > button > span");
    }
    public WebElement findCreateButton() { return driver.findElement(createButton); }

    public void clickButtonCreate() { findCreateButton().click(); }
}

