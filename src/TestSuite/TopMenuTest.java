package TestSuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest  extends BaseTest {

    public static String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUP() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        String expectM="Computers";
       clickOnElement(By.linkText("Computers"));
     Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a[contains(text(),'Computers')]")));
    }
    @Test
    public void userShouldNavigateToElectronicPageSuccessfully(){
        String expectM="Electronics";
        clickOnElement(By.linkText("Electronics"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a[contains(text(),'Electronics')]")));
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        String expectM="Apparel";
        clickOnElement(By.linkText("Apparel"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a[contains(text(),'Apparel')]")));
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        String expectM="Books";
        clickOnElement(By.linkText("Books"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a[contains(text(),'Books')] ")));
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        String expectM="Digital downloads";
        clickOnElement(By.linkText("Digital downloads"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[4]/a[contains(text(),'Digital downloads')]")));
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        String expectM="Gift Cards";
        clickOnElement(By.linkText("Gift Cards"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')])")));
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        String expectM="Jewelry";
        clickOnElement(By.linkText("Jewelry"));
        Assert.assertEquals(expectM,getTextFromElement(By.xpath(" //ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")));

    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
