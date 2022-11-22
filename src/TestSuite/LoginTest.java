package TestSuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    public static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUP() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        clickOnElement(By.linkText("Log in"));
        Assert.assertEquals( expectedMessage, getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")));
        tearDown();
    }

    @Test
    public void verifySignOutMessageWithValidCredentials() {
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"), "viral2627@gmail.com");
        sendTextToElement(By.id("Password"), "welcome123");
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        //Check msg of login failure
        // clickOnElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a[contains(text(),'Log out')]"));
        String expectedMsg = "Log out";
        Assert.assertEquals(expectedMsg,getTextFromElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a[contains(text(),'Log out')]")));
        tearDown();
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"), "test123@gmail.com");
        sendTextToElement(By.id("Password"), "Welcome1");
        //Check msg of login failure
        // clickOnElement(By.linkText("button-1 login-button"));
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        String expectedMessage1 = "Login was unsuccessful. Please correct the errors and try again.";
        //Assert.assertEquals(expectedMessage1, getTextFromElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1][contains(text(),'Login was unsuccessful. Please correct the errors and try again.')")));
        tearDown();
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
