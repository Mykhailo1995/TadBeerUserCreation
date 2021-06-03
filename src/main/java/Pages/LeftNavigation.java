package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftNavigation {
    protected WebDriver driver;
    private By usersButton;
    private By sidebarDiv;

    public LeftNavigation(WebDriver driver) {
        this.driver = driver;
        this.usersButton = By.cssSelector("li:nth-child(19) > a");
        this.sidebarDiv = By.cssSelector("#root > div.app > div > div > div");
}
    public WebElement findUsersButton() { return driver.findElement(usersButton); }
    public WebElement findSidebarDiv() {return driver.findElement(sidebarDiv);}



    public void clickButtonUsers() {
        if(findUsersButton().isDisplayed()) {
            findUsersButton().click();
        }
        else {
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollTo(0, document.body.scrollHeight);", findSidebarDiv());
            findUsersButton().click();
        }
        }


}
