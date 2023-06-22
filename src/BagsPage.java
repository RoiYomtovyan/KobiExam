import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class BagsPage {

    public static WebElement element;

    // the amount drop down list
    public  static WebElement pushItMessengerBag (WebDriver driver){
        element = driver.findElement(By.xpath("//span//img[@alt=\"Push It Messenger Bag\"]"));
        return element;
    }

    public  static WebElement addToCart (WebDriver driver){
        element = driver.findElement(By.xpath("//button[@title=\"Add to Cart\"]"));
        return element;
    }

    public  static WebElement counterNumber (WebDriver driver){
        element = driver.findElement(By.cssSelector("span.counter-number"));
        return element;
    }

    public  static WebElement checkoutControl (WebDriver driver){
        element = driver.findElement(By.id("top-cart-btn-checkout"));
        return element;
    }



}
