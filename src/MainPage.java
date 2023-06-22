import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MainPage {

    public static WebElement element;

    public static WebElement openGearDropdown (WebDriver driver){
        element=driver.findElement(By.linkText ("Gear"));
        return element;
    }

    public static WebElement Bags (WebDriver driver){
        element=driver.findElement(By.id ("ui-id-25"));
        return element;
    }

}
