import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ShippingPage {

    public static WebElement element;
    public static WebElement scrollToElement;

    public static WebElement email (WebDriver driver){
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
        element = driver.findElement(By.xpath("//form[@id=\"co-shipping-form\"]//div//div//div[@class=\"control\"]//input[@name=\"company\"]"));
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

    public static WebElement region (WebDriver driver){
        element = driver.findElement(By.xpath("//form//div//div//div//select[@name=\"region_id\"]"));
        scrollToElement(element,driver);
        return element;
    }

    public static WebElement selectFlatRateShippingMethod (WebDriver driver){
       element = driver.findElement(By.xpath("//li[@id=\"opc-shipping_method\"]//div[@class=\"checkout-shipping-method\"]//div[@id=\"checkout-step-shipping_method\"]//form[@id=\"co-shipping-method-form\"]//div[@id=\"checkout-shipping-method-load\"]//table[@class=\"table-checkout-shipping-method\"]//tbody//tr[@data-bind=\"click: element.selectShippingMethod\"]//td[@class=\"col col-method\"]//input[@name=\"ko_unique_3\"]"));
        scrollToElement(element,driver);
        return element;
    }

    public static WebElement nextButton (WebDriver driver){
        element = driver.findElement(By.cssSelector("button.button.action.continue.primary"));
        scrollToElement(element,driver);
        return element;
    }

    public static void scrollToElement (WebElement element , WebDriver driver){
        String js_code = "arguments[0].scrollIntoView();";
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        scrollToElement = (WebElement) jse.executeScript("arguments[0].scrollIntoView();", element);

    }

}
