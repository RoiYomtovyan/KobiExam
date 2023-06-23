import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BonusSubTask {

    /*
    first I created chrome profile with "block third party cookies" option enabled
    I used this guide to export it: https://smallbusiness.chron.com/export-chrome-profile-79321.html
    And also this documentation : https://chromedriver.chromium.org/capabilities#TOC-Use-custom-profile-also-called-user-data-directory-
    that explain how to configure the user-data-dir With the path to the exported chrome profile in the ChromeOptions object
     */

    public static WebDriver createChromeDriverWithCustomUserData() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\avivit\\Documents\\GitHub\\KobiExam\\chromedriver.exe");

        // Create ChromeOptions that loads the configurations of chrome from Default folder
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir = C:\\Users\\avivit\\Documents\\GitHub\\KobiExam\\Default");

        // Create an instance of ChromeDriver with the configured options
        WebDriver driver = new ChromeDriver(options);

        return driver;
    }


}
