package selenium.LearningAtCodeGym.BtTopic7;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ValidateHelper {

    private WebDriver driver;

    private WebDriverWait wait;
    private Actions actions;

    public ValidateHelper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,5000);
        actions = new Actions(driver);
    }

    public String getPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public boolean verifyPageTitle(String pageTitle) {
        return getPageTitle().contains(pageTitle);
    }


    public void setText(WebElement element, String valueText) {
        // wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(valueText);
    }

    public void clickElement(WebElement element) {
        // wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    public void selectDropDown(WebElement element, String value) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

        try {
            Select select = new Select(element);
            select.selectByValue(value);
        } catch (Exception e) {
            // Handle any exceptions (e.g., NoSuchElementException, StaleElementReferenceException)
            e.printStackTrace();
        }
    }
    public boolean verifyUrl(String url1){
        return driver.getCurrentUrl().contains(url1); //True or false

    }
    public void handleDropdown(WebElement element,String value){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(value);
        actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();

    }

}
