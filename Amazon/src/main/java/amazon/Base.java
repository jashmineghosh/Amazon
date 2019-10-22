package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public Properties prop;
    public WebDriver initializeDriver() throws IOException
    {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("I:\\Data\\Selenium\\Amazon\\src\\main\\resources\\data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.println("browserName");
        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "I:\\Data\\Selenium\\Amazon\\src\\main\\resources\\chromedriver.exe");
            driver = new ChromeDriver();

        }
//        else if(browserName.equals("firefox"))
//        {
//            System.setProperty("webdriver.gecko.driver", "C:\\jas-hadoop\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//            driver = new FirefoxDriver();
//
//        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }


}
