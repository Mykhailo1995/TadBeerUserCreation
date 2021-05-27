package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
    protected WebDriver driver;
    private By mailInput;
    private By passwordInput;
    private By signInButton;

    public SignIn(WebDriver driver) {
        this.driver = driver;
        this.mailInput = By.cssSelector("#Username");
        this.passwordInput = By.cssSelector("#Password");
        this.signInButton = By.cssSelector("div.form-group.text-center.mb0 > button");
    }
    public WebElement findMailInput() { return driver.findElement(mailInput); }
    public WebElement findPasswordInput() { return driver.findElement(passwordInput); }
    public WebElement findSignInButton() { return driver.findElement(signInButton); }

    public void signIn(String mail, String password){
        findMailInput().sendKeys(mail);
        findPasswordInput().sendKeys(password);
        findSignInButton().click();
    }
}
