package selenium.tuHoc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {


    @Parameters({"webPoly"})
    @Test
    public void openBrowser(String urlWeb) {
        System.out.println(urlWeb);

    }

    @Parameters({"userName", "PassWord"})
    @Test
    public void openBrowser(String userName, String passWord) {
        System.out.println("UserName" + userName);
        System.out.println("PassWord" + passWord);

    }
}

