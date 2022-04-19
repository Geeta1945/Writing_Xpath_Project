import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathUrl1 {
    public static WebDriver driver;

    @Test
    public void openBrowser() {
        String baseUrl = " https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Launch the URL.
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element1 = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        WebElement element2 = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement element3 = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement element4 = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        WebElement element5 = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement element6 = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        WebElement element7 = driver.findElement(By.xpath("//input[@name='Submit']"));
        WebElement element8 = driver.findElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']"));

        WebElement element9 = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
        WebElement element10 = driver.findElement(By.xpath("//img[@src='/webres_625d2f943855e9.85984833/themes/default/images/login/logo.png']"));

       /*

       WebElement element5 =driver.findElement(By.xpath(""));
        WebElement element6 =driver.findElement(By.xpath(""));
        WebElement element7 =driver.findElement(By.xpath(""));
        WebElement element8 =driver.findElement(By.xpath(""));
        WebElement element9 =driver.findElement(By.xpath(""));
        WebElement element10 =driver.findElement(By.xpath(""));
*/

        driver.quit();

    }
}



