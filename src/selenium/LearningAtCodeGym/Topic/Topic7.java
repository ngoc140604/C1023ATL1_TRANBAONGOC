package selenium.LearningAtCodeGym.Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Topic7 extends BeforeRun {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "fff")
    WebElement element;

    @BeforeTest
    public void before(){
        driver = getDriver();

    }

    @Test
    public void explicitwait(){
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));




    }
    @Test
    public void JavaScript() throws InterruptedException {
        String button = "//button[contains(text(),'Start')]";
        String text = "//div[@id='finish']//h4";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // Cho bang Implicit wait

        //Khai bao javascript
        JavascriptExecutor javascript = (JavascriptExecutor) driver;

        //Click bang javascript
        WebElement eButton = driver.findElement(By.xpath(button));

        Thread.sleep(3);
        //Draw border for element
        javascript.executeScript("arguments[0].style.border='3px solid red'", eButton);
        Thread.sleep(5000);
        javascript.executeScript("arguments[0].click()", eButton);
//		driver.findElement(By.xpath(button)).click();
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(text)));
    }



}
