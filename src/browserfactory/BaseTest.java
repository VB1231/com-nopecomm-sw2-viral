package browserfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver=new ChromeDriver();
        //launch the browser
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //set delay time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public String  getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
    public void sendTextToElement(By by,String text){
        //Find the element email field
        driver.findElement(by).sendKeys(text);

    }
    public  void sendTextToElement1(By by){
        //Find the element email field
      driver.findElement(by).click();

    }
    public void closeBrowser(){
        driver.quit();
    }
}
