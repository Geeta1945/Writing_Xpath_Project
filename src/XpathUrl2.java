import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathUrl2 {
    public static WebDriver driver;

    @Test
    public void openBrowser() {
        String baseUrl = " https://demostore.x-cart.com/shipping";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Launch the URL.
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element1 =driver.findElement(By.xpath("//a[@title='Fashion']"));
        WebElement element2 =driver.findElement(By.xpath("//a[@href='beauty-and-health/']"));
        WebElement element3 =driver.findElement(By.xpath("//a[@title='Electronics']"));
        WebElement element4 = driver.findElement(By.xpath("//a[@href='shipping']"));
        WebElement element5= driver.findElement(By.xpath("//a[@title='Clothing']"));
        WebElement element6 = driver.findElement(By.xpath("//a[@href='fashion/shoes/']"));
        WebElement element7 = driver.findElement(By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed empty']"));
        WebElement element8 = driver.findElement(By.xpath("//a[@title='Please add another product to comparison']"));
        WebElement element9 = driver.findElement(By.xpath("//span[@class='country-indicator']"));
        WebElement element10 = driver.findElement(By.xpath("//img[@src='//demostore.x-cart.com/var/images/logo/221.40/skins/crisp_white/customer/images/logo.png']"));


        driver.quit();

    }
}


