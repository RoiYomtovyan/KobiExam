import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)

public class SanityTest {
   public static WebDriver driver ;
    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 30);

    @BeforeClass
    public static void start () throws Exception {

        String userAgent = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_3_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.3 Mobile/15E148 Safari/604.1";

        // Configure Firefox options
        FirefoxOptions options = new FirefoxOptions();

        // Create a Firefox profile
        FirefoxProfile profile = new FirefoxProfile();

        // Set the user agent in the profile
        profile.setPreference("general.useragent.override", userAgent);

        // Reject third-party cookies
        profile.setPreference("network.cookie.cookieBehavior", 1);

        // Set the profile in Firefox options
        options.setProfile(profile);

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\avivit\\Documents\\GitHub\\Kobi'sExam\\geckodriver.exe");

        // Create a new Firefox WebDriver instance
        driver = new FirefoxDriver(options);

        // Example usage: Open a webpage
        driver.get("https://magento.softwaretestingboard.com/");


    }

@Test
public void SanityTest01_Registration_Page_Verification() throws InterruptedException {
       wait.until(ExpectedConditions.elementToBeClickable(MainPage.openGearDropdown(driver)));
       action.moveToElement(MainPage.openGearDropdown(driver)).build().perform();
       MainPage.Bags(driver).click();
       BagsPage.pushItMessengerBag(driver).click();
       wait.until(ExpectedConditions.elementToBeClickable(BagsPage.addToCart(driver))).click();
       wait.until(ExpectedConditions.textToBePresentInElement(BagsPage.counterNumber(driver),"1"));
       BagsPage.counterNumber(driver).click();
       BagsPage.checkoutControl(driver).click();
       Thread.sleep(4000);
       action.moveToElement(ShippingPage.email(driver)).build().perform();
       ShippingPage.email(driver).click();
       ShippingPage.email(driver).sendKeys("roi@roi.com");
       action.moveToElement(ShippingPage.firstName(driver)).build().perform();
       ShippingPage.firstName(driver).click();
       ShippingPage.firstName(driver).sendKeys("Roi");
       action.moveToElement(ShippingPage.lastName(driver)).build().perform();
       ShippingPage.lastName(driver).click();
       ShippingPage.lastName(driver).sendKeys("Yomtovyan");
       ShippingPage.company(driver).click();
       ShippingPage.company(driver).sendKeys("Roi LTD");
       ShippingPage.streetAddress(driver).click();
       ShippingPage.streetAddress(driver).sendKeys("the best street in town!");
       ShippingPage.city(driver).click();
       ShippingPage.city(driver).sendKeys("the best city in the world!");
       ShippingPage.postCode(driver).click();
       ShippingPage.postCode(driver).sendKeys("12345-6789");
       ShippingPage.phoneNumber(driver).click();
       ShippingPage.phoneNumber(driver).sendKeys("054-6036683");
}





    @AfterClass
    public static void after (){
//        driver.quit();

    }



}


