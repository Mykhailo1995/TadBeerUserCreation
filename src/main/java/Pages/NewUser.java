package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class NewUser {
    protected WebDriver driver;
    private By userTypeDropdown;
    private By localAdminType;
    private By serviceCentersDropdown;
    private By serviceCentersTestButton;
    private By firstNameInput;
    private By lastNameInput;
    private By firstNameArabicInput;
    private By lastNameArabicInput;
    private By genderDropdown;
    private By genderMaleButton;
    private By mobileNumberInput;
    private By emailInput;
    private By passwordInput;
    private By confirmPasswordInput;
    private By createButton;
    private By allertWindow;

    public NewUser(WebDriver driver) {
        this.driver = driver;
        this.userTypeDropdown = By.cssSelector("#userType");
        this.localAdminType = By.cssSelector("div.rc-virtual-list > div.rc-virtual-list-holder > div > div > div:nth-child(3)");
        this.serviceCentersDropdown = By.cssSelector("#serviceCenterId");
        this.serviceCentersTestButton = By.cssSelector(" div:nth-child(9) > div > div > div > div.rc-virtual-list > div.rc-virtual-list-holder > div > div > div:nth-child(2)");
        this.firstNameInput = By.cssSelector("#firstName_en");
        this.lastNameInput = By.cssSelector("#lastName_en");
        this.firstNameArabicInput = By.cssSelector("#firstName_ar");
        this.lastNameArabicInput = By.cssSelector("#lastName_ar");
        this.genderDropdown = By.cssSelector("#gender");
        this.genderMaleButton = By.cssSelector("body > div:nth-child(10) > div > div > div > div.rc-virtual-list > div.rc-virtual-list-holder > div > div > div.ant-select-item.ant-select-item-option.ant-select-item-option-active");
        this.mobileNumberInput = By.cssSelector("#mobileNumber");
        this.emailInput = By.cssSelector("#email");
        this.passwordInput = By.cssSelector("#password");
        this.confirmPasswordInput = By.cssSelector("#confirmPassword");
        this.createButton = By.cssSelector("div > form > button");
        this.allertWindow = By.cssSelector("body > div:nth-child(8) > div > div");

    }
    public WebElement findUserTypeDropdown() { return driver.findElement(userTypeDropdown); }
    public WebElement findLocalAdminButton() { return driver.findElement(localAdminType); }
    public WebElement findServiceCenterDropdown() { return driver.findElement(serviceCentersDropdown); }
    public WebElement findServiceCentersTestButton() { return driver.findElement(serviceCentersTestButton); }
    public WebElement findFirstNameInput() { return driver.findElement(firstNameInput); }
    public WebElement findLastNameInput() { return driver.findElement(lastNameInput); }
    public WebElement findFirstArabicNameInput() { return driver.findElement(firstNameArabicInput); }
    public WebElement findLastArabicNameInput() { return driver.findElement(lastNameArabicInput); }
    public WebElement findGenderDropdown() { return driver.findElement(genderDropdown); }
    public WebElement findGenderMaleButton() { return driver.findElement(genderMaleButton); }
    public WebElement findMobileNumberInput() { return driver.findElement(mobileNumberInput); }
    public WebElement findEmailInput() { return driver.findElement(emailInput); }
    public WebElement findPasswordInput() { return driver.findElement(passwordInput); }
    public WebElement findConfirmPasswordInput() { return driver.findElement(confirmPasswordInput); }
    public WebElement findCreateButton() { return driver.findElement(createButton); }
    public WebElement findAllertWindow() { return driver.findElement(allertWindow); }

    public void fillInfo(String firstN, String lastN, String firstAN, String lastAN,  String mobile, String mail, String password, String confirm){
        findUserTypeDropdown().click();
        findLocalAdminButton().click();
        findServiceCenterDropdown().click();
        findServiceCentersTestButton().click();
        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);

        findGenderDropdown().click();
        findGenderMaleButton().click();
        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);

        findFirstNameInput().sendKeys(firstN);
        findLastNameInput().sendKeys(lastN);
        findFirstArabicNameInput().sendKeys(firstAN);
        findLastArabicNameInput().sendKeys(lastAN);

        findMobileNumberInput().sendKeys(mobile);
        findEmailInput().sendKeys(mail);
        findPasswordInput().sendKeys(password);
        findConfirmPasswordInput().sendKeys(confirm);
        findCreateButton().click();
    }
    public void dropDowns(){
        Select drpSC = new Select(driver.findElement(By.cssSelector("#userType")));
        drpSC.selectByVisibleText("Trainer");
    }
}
