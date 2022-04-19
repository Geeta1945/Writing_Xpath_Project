import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathUrl3 {


    //

    public static WebDriver driver;

    @Test
    public void openBrowser() {
        String baseUrl = "https://learn.letskodeit.com/p/practice";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Launch the URL.
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element1 =driver.findElement(By.xpath("//a[@class='fedora-navbar-link navbar-link']")); // Practice tab on right hand corner
        WebElement element2 =driver.findElement(By.xpath("//a[@href='/sign_in']")); // login element
        element2.click();
        WebElement element3 =driver.findElement(By.xpath("//input[@id='email']"));// email address
        WebElement element4 =driver.findElement(By.xpath("//input[@name='email']"));//email address
        WebElement element5= driver.findElement(By.xpath("//a[@class='bodySmall form-footer']")); //forgot password
        WebElement element6 = driver.findElement(By.xpath("//input[@name='commit']")); // login button
        WebElement element7 = driver.findElement(By.xpath("//h3[@class='heading3 text-center-xs'and text()='Login']")); // login heading
        WebElement element8 = driver.findElement(By.xpath("//img[@src='https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=height:60/https://www.filepicker.io/api/file/WSundQ6BT6u2OZe2kcNA']"));
        element5.click();
        WebElement element9 = driver.findElement(By.xpath("//input[@id='email']"));// ResetPassword - email field
        WebElement element10 = driver.findElement(By.xpath("//h3[@class='heading4 text-left-xs m-b-1-xs']")); // reset password heading

        driver.quit();

    }

}
