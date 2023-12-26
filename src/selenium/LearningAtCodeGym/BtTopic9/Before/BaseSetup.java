package selenium.LearningAtCodeGym.BtTopic9.Before;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseSetup {
    public WebDriver driver;
    static String driverPath = "resourses\\drivers\\";

    //Khởi tạo hàm này để các lớp khác có thể gọi driver đã khởi tạo
    public WebDriver getDriver() {
        return driver;
    }

    private void setDriver(String browserType, String appUrl) {
        switch (browserType) {
            case "chrome":
                driver = initChromeDriver(appUrl);
                break;
            case "firefox":
                driver = initFireFoxDriver(appUrl);
                break;
            default:
                System.out.println(browserType + "invalid...");
                driver = initChromeDriver(appUrl);

        }
    }

    private WebDriver initChromeDriver(String appUrl) {
        System.out.println("Launching Chrome Browser");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ngoc\\DataSelenium\\b1\\browserdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appUrl);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    private WebDriver initFireFoxDriver(String appUrl) {
        System.out.println("Launching FireFox Browser");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appUrl);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }


    //initializeTestBaseSetup
    @Parameters({"browserType", "appUrl"})
    @BeforeClass
    public void initializeTestBaseSetup(String browserType, String appUrl) {
        try {
            setDriver(browserType, appUrl);
        } catch (Exception e) {
            System.out.println("Error...." + e.getStackTrace());
        }

    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        driver.quit();

    }


}
