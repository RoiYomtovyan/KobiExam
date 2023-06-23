import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;


@FixMethodOrder (MethodSorters.NAME_ASCENDING)

public class SanityTest {
   public static WebDriver driver ;
    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 30);

    // this will allow us to read the test configuration from a file
    static Object file;

    static {
        try {
            file = new JSONParser().parse(new FileReader("config.json"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static JSONObject config = (JSONObject) file;

//    public SanityTest() throws IOException, ParseException {
//    }

    @BeforeClass
    public static void start () throws Exception {

        String userAgent = config.get("userAgent").toString();

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

        System.setProperty(config.get("driverType").toString(), config.get("driverLocation").toString());

        // Create a new Firefox WebDriver instance
        driver = new FirefoxDriver(options);

        // Open the Magento webpage
        driver.get(config.get("url").toString());


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
       ShippingPage.region(driver).click();
       ShippingPage.region(driver).sendKeys("California");
       ShippingPage.region(driver).click();
       Thread.sleep(5000);
       wait.until(ExpectedConditions.elementToBeClickable(ShippingPage.selectFlatRateShippingMethod(driver))).click();
       ShippingPage.nextButton(driver).click();
       Thread.sleep(5000);
       wait.until(ExpectedConditions.elementToBeClickable(ReviewAndPayPage.placeOrder(driver))).click();
       Thread.sleep(5000);
       ReviewAndPayPage.printOrderIDtoFile(driver);

}

    @AfterClass
    public static void after (){
        driver.quit();

    }



}


