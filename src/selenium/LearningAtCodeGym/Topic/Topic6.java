package selenium.LearningAtCodeGym.Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Topic6 extends BeforeRun {

    //element
    By eImgAvatar = By.xpath("//input[@id='age']");
    By eToolTip = By.xpath("//div[@role='tooltip']");
    By iframe = By.xpath("//iframe");

    @Test
    public void TC01_CheckHover() throws InterruptedException {
        //Chuyển hướng tới iframe
        driver= getDriver();
        driver.switchTo().frame(driver.findElement(iframe));
        Actions actions = new Actions(driver);
        WebElement eImgAvatar1 =driver.findElement(eImgAvatar);
        actions.moveToElement(eImgAvatar1).build().perform();
        Thread.sleep(2000);
        WebElement eToolTip1 =driver.findElement(eToolTip);
        System.out.println(eToolTip1);

    }

}
