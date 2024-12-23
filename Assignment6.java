import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		// 1. check any checkbox
		// 2. grab its label - put to variable
		String a;
		a = driver.findElement(By.cssSelector("div[id='checkbox-example'] fieldset label")).getText();
		driver.findElement(By.cssSelector("input[id*='" + a + "']")).click();
		// 3. select option from dropdown related to the checkbox from previous steps
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(a);
		// 4. enter the label from step 2 to alert search field
		driver.findElement(By.id("name")).sendKeys(a);
		// 5. click on "Alert" button
		driver.findElement(By.id("alertbtn")).click();
		// 6. verify if text from step 2 is present in the popup message
		if (driver.switchTo().alert().getText().contains(a)) {
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);
		}

	}
}
