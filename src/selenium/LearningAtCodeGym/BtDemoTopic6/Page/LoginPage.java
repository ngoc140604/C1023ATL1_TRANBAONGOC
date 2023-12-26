package selenium.LearningAtCodeGym.BtDemoTopic6.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage{
    private WebDriver driver;
    private WebDriverWait wait;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,20);

    }
    //element at Login page
    @FindBy(xpath ="//a[text()='here'][1]" )
    private WebElement moveSendEmailScreen;
    @FindBy(name ="uid" )
    private WebElement userID;
    @FindBy(name ="password")
    private WebElement passWord;
    @FindBy(name ="btnLogin")
    private WebElement btnLogin;


    String exTitle = "GTPL Bank Home Page";

    public String getPageTitle(){
        return driver.getTitle();
    }
    public boolean verifyPageTittle(String expectedTitle){
        return getPageTitle().contains(exTitle);

    }

    public SendEmailPage clickVisit(){
        System.out.println("Step 1: Check Title");
        System.out.println(getPageTitle());
        Assert.assertTrue(verifyPageTittle(exTitle),"Không phải trang Login");
        wait.until(ExpectedConditions.elementToBeClickable(moveSendEmailScreen));
        moveSendEmailScreen.click();
        System.out.println("Step 2: Click Visit to navigate Send EmailPage");
       return new SendEmailPage(driver);
    }
    public void Login(String userName,String passWord1){
        userID.sendKeys(userName);
        passWord.sendKeys(passWord1);
        btnLogin.click();


    }






}
