import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// this class holds the page objects of the review and pay page
public class ReviewAndPayPage {

    public static WebElement element;

    // the place order control
    public static WebElement placeOrder (WebDriver driver) {
        element = driver.findElement(By.cssSelector ("button.action.primary.checkout"));
        return element;
    }

    // this method locating the orderID and export it to a file
    public static void printOrderIDtoFile(WebDriver driver , String filePath) {
        WebElement orderKey= driver.findElement(By.cssSelector("html body.checkout-onepage-success.page-layout-1column div.page-wrapper main#maincontent.page-main div.columns div.column.main div.checkout-success p span"));
        String value = orderKey.getAttribute("textContent");
        System.out.println("the value is " + value);
        try {
            // Create a FileWriter with the file path
            FileWriter fileWriter = new FileWriter(filePath);

            // Create a BufferedWriter to write the data
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write the value to the file
            bufferedWriter.write("the tests orderID is " + value);

            // Close the resources
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
