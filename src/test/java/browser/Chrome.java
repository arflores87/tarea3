package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * @autor : eynar.pari
 * @date : 02/10/2020.
 **/
public class Chrome implements  IBrowser {
    @Override
    public WebDriver create() {
        String driverPath="C:\\Users\\Aldo Flores\\Documents\\GITHUB\\vulnerabilityjava\\src\\test\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
