package test;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        newUser.fillInfo("Trainer", "Some", "Misha", "Stefan", "ميشا","ستيفان", "male", "0666341950", "m.stefaniuk.1995@gmail.com", "Password123!", "Password123!");
        Thread.sleep(2000);
    }
}
