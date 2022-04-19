import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathUrl5 {


    public static WebDriver driver;

    @Test
    public void openBrowser() {
        String baseUrl = "http://automationpractice.com/index.php?id_category=8&controller=category";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Launch the URL.
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //WebElement element1 =driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=5&amp;controller=category']"));

        WebElement element2 =driver.findElement(By.xpath("//input[@id='search_query_top']"));
        element2.sendKeys("casual");
        WebElement element3 =driver.findElement(By.xpath("//button[@name='submit_search']"));
        element3.click();
        WebElement element4 = driver.findElement(By.xpath("//link[@href='http://schema.org/InStock']"));
        WebElement element5 = driver.findElement(By.xpath("//i[@class='icon-th-large']"));// grid icon

        WebElement element6 = driver.findElement(By.xpath("//i[@class='icon-th-list']")); // list icon
        WebElement element7 = driver.findElement(By.xpath("//form[@action='http://automationpractice.com/index.php?controller=products-comparison']"));
        // compare - green button
        WebElement element8 = driver.findElement(By.xpath("//img[@title='Printed Summer Dress']"));
        WebElement element9 = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/modules/blockbanner/img/sale70.png']"));// Sale 70% off all products
        WebElement element10 = driver.findElement(By.xpath("//span[@class='heading-counter']")); //There are 2 products message

       driver.quit();
    }

}
