import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// this class is the object repository of the Gift selection page

public class ShippingPage {

    public static WebElement element;

    // business selection
    public static WebElement email (WebDriver driver){
//        driver.switchTo().frame(driver.findElement(By.cssSelector("form.form.form-login[data-role=email-with-possible-login]")));
//        element = driver.findElement(By.cssSelector("input#customer-email.input-text[type=email][name=username][aria-required=true]"));
        element=driver.findElement(By.xpath("//form[@data-role=\"email-with-possible-login\"]//div//div//input[@id=\"customer-email\"]"));
        return element;
    }

    public static WebElement firstName (WebDriver driver){
        element=driver.findElement(By.xpath("//form[@id=\"co-shipping-form\"]//div//div//div[@class=\"control\"]//input[@name=\"firstname\"]"));
        return element;
    }





}
