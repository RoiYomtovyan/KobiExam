import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ReviewAndPayPage {

    public static WebElement element;

    public static WebElement placeOrder (WebDriver driver) {
        element = driver.findElement(By.cssSelector ("button.action.primary.checkout"));
        return element;
    }


}
