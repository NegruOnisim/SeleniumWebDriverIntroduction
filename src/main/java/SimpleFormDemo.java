import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleFormDemo {
    private WebDriver driver;

    @BeforeClass
    public void setup () {
        System.setProperty ("web-driver.chrome.driver", "/Users/roxananegru/Desktop/Oni IT/Automation program/Chrome Driver/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void singleInputField() {
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("user-message")).sendKeys("test");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(true,yourMessage.isDisplayed());
    }

    @Test(priority = 2)

    public void checkThatTheInputFieldisEmpty(){
        driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
        driver.findElement(By.id("showInput")).click();
        WebElement yourMessage = driver.findElement(By.id("message"));
        Assert.assertEquals(false,yourMessage.isDisplayed());

    }


}





