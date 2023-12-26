package selenium.LearningAtCodeGym.BtTopic9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //element at SignInPage
    @FindBy(id ="email")
    WebElement txbEmail;
    @FindBy(id ="password")
        WebElement txbPassWord;
    @FindBy(xpath = "//button[contains(@class,'btn-lg')]")
    WebElement btnSubmit;


    public DashBoardPage signIn(String emailvalue, String passWordvalue){
        txbEmail.clear();
        txbEmail.sendKeys(emailvalue);
        txbPassWord.clear();
        txbPassWord.sendKeys(passWordvalue);
        btnSubmit.click();
        return new DashBoardPage(driver);
    }


}
