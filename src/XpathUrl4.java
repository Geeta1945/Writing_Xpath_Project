import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathUrl4 {

    /*

     */

    public static WebDriver driver;

    @Test
    public void openBrowser() {
        String baseUrl = "https://demo.nopcommerce.com/gift-cards";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // Launch the URL.
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element1 =driver.findElement(By.xpath("//select[@id='products-orderby']"));
        WebElement element2 =driver.findElement(By.xpath("//select[@name='products-orderby']")); // Position next to sort by
        WebElement element3 =driver.findElement(By.xpath("//h1[text()='Gift Cards']")); //gift cards heading on page
        WebElement element4 = driver.findElement(By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/43/1/1\"),!1']"));

        element4.click();
        WebElement element5= driver.findElement(By.xpath("//input[@class='recipient-name']"));
        element5.sendKeys("YourName");
        WebElement element6 = driver.findElement(By.xpath("//input[@id='giftcard_43_RecipientEmail']"));
        element6.sendKeys("geeta1234@gmail.com");
        WebElement element7 = driver.findElement(By.xpath("//input[@name='giftcard_43.SenderName']"));
        element7.sendKeys("MyName");
        //
        WebElement element8 = driver.findElement(By.xpath("//input[@class='sender-email']"));
        element8.sendKeys("Youremail@gmail.com");

        WebElement element9 =driver.findElement(By.xpath("//button[@id='add-to-cart-button-43']"));
        element9.click();
        WebElement element10= driver.findElement(By.xpath("//span[@class='cart-label']"));
        // checking item has been added to cart or not

        element10.click();

        WebElement element11 =driver.findElement(By.xpath("//button[@name='checkout']"));
        element11.click();
        WebElement element12 = driver.findElement(By.xpath("//div[@id='terms-of-service-warning-box']"));
        element12.click();


        driver.quit();

    }
}
