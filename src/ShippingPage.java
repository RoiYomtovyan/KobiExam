import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

// this class is the object repository of the Gift selection page

public class ShippingPage {

    public static WebElement element;
    public static WebElement scrollToElement;

    public static WebElement email (WebDriver driver){
//        driver.switchTo().frame(driver.findElement(By.cssSelector("form.form.form-login[data-role=email-with-possible-login]")));
//        element = driver.findElement(By.cssSelector("input#customer-email.input-text[type=email][name=username][aria-required=true]"));
        element=driver.findElement(By.xpath("//form[@data-role=\"email-with-possible-login\"]//div//div//input[@id=\"customer-email\"]"));
        return element;
    }

    public static WebElement firstName (WebDriver driver){
        element = driver.findElement(By.xpath("//form[@id=\"co-shipping-form\"]//div//div//div[@class=\"control\"]//input[@name=\"firstname\"]"));
        return element;
    }

    public static WebElement lastName (WebDriver driver){
        element = driver.findElement(By.xpath("//form[@id=\"co-shipping-form\"]//div//div//div[@class=\"control\"]//input[@name=\"lastname\"]"));
        return element;
    }

    public static WebElement company (WebDriver driver){
//        String js_code = "arguments[0].scrollIntoView();";
        element = driver.findElement(By.xpath("//form[@id=\"co-shipping-form\"]//div//div//div[@class=\"control\"]//input[@name=\"company\"]"));
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        scrollToElement = (WebElement) jse.executeScript("arguments[0].scrollIntoView();", element);
        scrollToElement(element,driver);
        return element;
    }

    public static WebElement streetAddress  (WebDriver driver){
        element = driver.findElement(By.xpath("//form[@id=\"co-shipping-form\"]//div//div//div[@class=\"control\"]//input[@name=\"street[0]\"]"));
        scrollToElement(element,driver);
        return element;
    }

    public static WebElement city (WebDriver driver){
        element = driver.findElement(By.xpath("//form[@id=\"co-shipping-form\"]//div//div//div[@class=\"control\"]//input[@name=\"city\"]"));
        scrollToElement(element,driver);
        return element;
    }

    public static WebElement postCode (WebDriver driver){
        element = driver.findElement(By.xpath("//form[@id=\"co-shipping-form\"]//div//div//div[@class=\"control\"]//input[@name=\"postcode\"]"));
        scrollToElement(element,driver);
        return element;
    }

    public static WebElement phoneNumber (WebDriver driver){
        element = driver.findElement(By.xpath(" //form[@id=\"co-shipping-form\"]//div//div//div[@class=\"control _with-tooltip\"]//input[@name=\"telephone\"]"));
        scrollToElement(element,driver);
        return element;
    }

    public static void scrollToElement (WebElement element ,WebDriver driver){
        String js_code = "arguments[0].scrollIntoView();";
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        scrollToElement = (WebElement) jse.executeScript("arguments[0].scrollIntoView();", element);

    }






}
