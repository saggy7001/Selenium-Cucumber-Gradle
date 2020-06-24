package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by SagarGa on 17/05/18.
 */
public class BaseSpec {
    private static WebDriver driver = null;
    private static BaseSpec baseSpecObj = null;
    private BaseSpec(){
        getDriver();
    }

    public WebDriver before(){
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public void after(){
        driver.close();
        driver.quit();
        driver = null;
    }

    public WebDriver getDriver(){
        if (driver == null){
            System.setProperty(
                    "webdriver.chrome.driver",
                    "D:\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static BaseSpec getBaseSpecInstance(){
        if (baseSpecObj==null){
            return new BaseSpec();
        }
        return baseSpecObj;
    }
}
