import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// explicit wait:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		// enter username, psw:
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		// radiobutton User; span class="checkmark" - 2 same elements
		// SelectorsHub: label:nth-child(2) span:nth-child(1)
		// Instructor example:
		/* driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click(); */
		driver.findElement(By.cssSelector("label:nth-child(2)")).click();
		// OK on popup:
		driver.findElement(By.id("okayBtn")).click();
		// dropdown - select Consultant:
		WebElement staticDropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("consult");
		// check the checkbox:
		driver.findElement(By.id("terms")).click();
		// signIn button:
		driver.findElement(By.id("signInBtn")).click();

		// explicit wait till new page is displayed
		// note: Checkout button is not visible if browser window is not bigger then some value,
		// there is span class="navbar-toggler-icon" instead when window is smaller
		// and only after the span is clicked, there are both elements visible.
		// solution: use span element or maximize window
		// locators for span and Add button:
		/* cssSelector("span[class='navbar-toggler-icon']"))); */
		/* cssSelector("button[class='btn btn-info']"))); */
		// Instructor example (with Checkout button):
		/*
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(
		 * "Checkout")));
		 */
		// my code (Add button text):
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add')]")));

		// add all products to shopping card
		// 1. list of products
		// 2. loop
		// my code:
		List<WebElement> products = driver.findElements(By.xpath("//*[contains(text(),'Add')]"));
		/* cssSelector("div[class='card-footer']")); */
		/* xpath("button[@class='btn btn-info']")); */
		// Instructor example:
		/*
		 * List <WebElement> products =
		 * driver.findElements(By.cssSelector(".card-footer .btn-info"));
		 */
		for (int i = 0; i < products.size(); i++) {

			products.get(i).click();

		}

		driver.findElement(By.cssSelector("span[class='navbar-toggler-icon']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Checkout')]")).click();

	}
}
