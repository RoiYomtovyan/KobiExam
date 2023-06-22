import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ReviewAndPayPage {

    public static WebElement element;

    public static WebElement placeOrder (WebDriver driver) {
        element = driver.findElement(By.cssSelector ("button.action.primary.checkout"));
        return element;
    }

    public static void printOrderIDtoFile(WebDriver driver) {
        WebElement orderKey= driver.findElement(By.cssSelector("html body.checkout-onepage-success.page-layout-1column div.page-wrapper main#maincontent.page-main div.columns div.column.main div.checkout-success p span"));
        String value = orderKey.getAttribute("textContent");
        System.out.println("the value is " + value);
        try {
            // Create a FileWriter with the file path
            FileWriter fileWriter = new FileWriter("C:\\Users\\avivit\\Documents\\GitHub\\KobiExam\\orderValue.txt");

            // Create a BufferedWriter to write the data
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write the value to the file
            bufferedWriter.write("the tests orderID is " + value);

            // Close the resources
            bufferedWriter.close();
            fileWriter.close();

            System.out.println("Value written to file successfully. you can find the file in the project folder");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
