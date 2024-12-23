import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopingCard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait:
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// explicit wait:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		// expected array - nákupní košík:
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Beans", "Potato" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		// utility:
		addItems(driver, itemsNeeded);
		// object for the main class, neni potřeba, pokud je to static metoda:
		// ShopingCard b=new ShopingCard();
		// ShopingCard.addItems(driver, itemsNeeded);

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		// explicit wait:
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		// explicit wait:
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			// format text to only vegetable name (without "kg"...),
			// e.g.: Cucumber - 1 Kg -> Cucumber, 1 kg:
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// convert array into array list for easy search (saving memory also):
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			// check if name extracted is present in array list:
			if (itemsNeededList.contains(formattedName))

			{
				j++;
				// click on Add to card
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// no "break" possible, but we need only to fill the basket and then stop
				if (j == itemsNeeded.length) {
					break;
				}
			}

		}
	}
}
