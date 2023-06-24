import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// this class holds the page objects of the Main page

public class MainPage {

    public static WebElement element;

    // the open gear dropdown menu
    public static WebElement openGearDropdown (WebDriver driver){
        element=driver.findElement(By.linkText ("Gear"));
        return element;
    }
    // the bags option from the dropdown menu
    public static WebElement Bags (WebDriver driver){
        element=driver.findElement(By.id ("ui-id-25"));
        return element;
    }

}
