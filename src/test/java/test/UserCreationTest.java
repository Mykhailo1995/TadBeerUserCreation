package test;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class UserCreationTest extends LocalTestRunner{
    @Test(priority=1)
    public void testAuthorisation() throws InterruptedException {
        launch();
        SignIn signIn = new SignIn(getDriver());

        signIn.signIn("superadmin", "Ut0n0m0s-2020-Sup3r4dm1n");
        TopPart topPart = new TopPart(getDriver());
        Assert.assertTrue(topPart.findUserName().isDisplayed());
    }
    @Test(priority = 2)
    public void creationUser() throws InterruptedException {
        LeftNavigation leftNavigation = new LeftNavigation(getDriver());
        Users users = new Users(getDriver());
        leftNavigation.clickButtonUsers();

        users.clickButtonCreate();

    }
    @Test(priority = 3)
    public void fillInfo() throws InterruptedException {
        NewUser newUser = new NewUser(getDriver());
        newUser.fillInfo( "Misha", "Stefan", "ميشا","ستيفان",  "0666341950", "m.stefaniuk.1995@gmail.com", "Password123!", "Password123!");

        Assert.assertEquals(newUser.findAllertWindow().getText(),"User has been created successfully");
    }
    @Test(priority = 4)
    public void loginLocalAdmin() throws InterruptedException {
        TopPart topPart= new TopPart(getDriver());
        topPart.logoutUser();

        SignIn signIn = new SignIn(getDriver());
        signIn.signIn("m.stefaniuk.1995@gmail.com", "Password123!");
        Thread.sleep(8000);
        Assert.assertEquals(topPart.findUserName().getText(),"Misha Stefan");
        topPart.logoutUser();
    }
    @Test(priority = 5)
    public void deleteTestUser() throws InterruptedException {
        SignIn signIn = new SignIn(getDriver());
        signIn.signIn("superadmin", "Ut0n0m0s-2020-Sup3r4dm1n");
        LeftNavigation leftNavigation = new LeftNavigation(getDriver());
        Users users = new Users(getDriver());
        leftNavigation.clickButtonUsers();
        users.clickDeleteButton();
        users.clickOkButton();
        Assert.assertEquals(users.findNotificationWindow().getText(),"The user has been deleted");
    }

}
