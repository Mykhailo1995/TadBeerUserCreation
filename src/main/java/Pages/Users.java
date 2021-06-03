package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Users {
    protected WebDriver driver;
    private By createButton;
    private By deleteButton;
    private By okButton;
    private By notificationWindow;

    public Users(WebDriver driver) {
        this.driver = driver;
        this.createButton = By.cssSelector("a > button > span");
        this.deleteButton = By.cssSelector("main > div > div > div > div.User-list-page__body.card-body > div.ant-table-wrapper > div > div > div > div > div > table > tbody > tr:nth-child(2) > td:nth-child(1) > ul > li:nth-child(2) > span > svg");
        this.okButton = By.cssSelector("body > div:nth-child(11) > div > div.ant-modal-wrap.ant-modal-confirm-centered.ant-modal-centered > div > div.ant-modal-content > div > div > div.ant-modal-confirm-btns > button.ant-btn.ant-btn-primary");
        this.notificationWindow = By.cssSelector("div > div > div > span:nth-child(2)");
}
    public WebElement findCreateButton() { return driver.findElement(createButton); }
    public WebElement findDeleteButton() { return driver.findElement(deleteButton); }
    public WebElement findOkButton() { return driver.findElement(okButton); }
    public WebElement findNotificationWindow() { return driver.findElement(notificationWindow); }

    public void clickButtonCreate() { findCreateButton().click(); }
    public void clickDeleteButton() { findDeleteButton().click(); }
    public void clickOkButton() { findOkButton().click(); }
}

