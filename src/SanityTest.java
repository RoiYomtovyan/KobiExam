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
    Actions builder = new Actions(driver);
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
// this test is verifying the registration of new user and report the result in the report
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

       // MainPage.openGearDropdown(driver).click();
//    RegistrationPage.notRegisteredYet(driver).click();
//    RegistrationPage.userName(driver).sendKeys("Roi");
//    // this function is calling the "generateString" method from "RandomStringGenerator" to generate unique email address
//    RegistrationPage.mailField(driver).sendKeys(RandomStringGenerator.generateString()+"@Roi.com" );
//    RegistrationPage.passwordField(driver).sendKeys("1234.Com");
//    RegistrationPage.passwordValidation(driver).sendKeys("1234.Com");
//    RegistrationPage.iAgreeRadioButton(driver).click();
//    boolean pressed = false;
//    try {
//    RegistrationPage.Submit(driver).click();
//        pressed = true;
//    } catch (Exception e) {
//        e.printStackTrace();
//        test.log(Status.FAIL, "Submit button of regestration form was not clicked " + e.getMessage());
//        pressed = false;
//    } finally {
//        if (pressed) {
//            test.log(Status.PASS, "the user was registers successfully");
//
//        }
//    }
}





    @AfterClass
    public static void after (){
//        driver.quit();

    }



}


