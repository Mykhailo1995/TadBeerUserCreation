package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftNavigation {
    protected WebDriver driver;
    private By usersButton;

    public LeftNavigation(WebDriver driver) {
        this.driver = driver;
        this.usersButton = By.cssSelector("li:nth-child(19) > a");
}
    public WebElement findUsersButton() { return driver.findElement(usersButton); }

    public void clickButtonUsers() { findUsersButton().click(); }
}
