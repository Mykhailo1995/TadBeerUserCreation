package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopPart {
    protected WebDriver driver;
    private By navbarButton;
    private By userName;
    private By logoutButton;

    public TopPart(WebDriver driver) {
        this.driver = driver;
        this.userName = By.cssSelector("div.profile-dropdown__name");
        this.navbarButton = By.cssSelector("button.d-md-down-none.navbar-toggler");
        this.logoutButton = By.cssSelector("li:nth-child(4) > div");
    }
    public WebElement findUserName() { return driver.findElement(userName); }

    public void clickButtonCreate() { findUserName().click(); }
}



