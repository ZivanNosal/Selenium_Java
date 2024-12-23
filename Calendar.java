import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		// jine elementy nez ve skoleni
		// select August 30:
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		// negativni podminka (while loop bezi, az se podminka naplni):
		while (!driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("August")) 
		{
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
		}
		//exception: element not interactable:
		/*
		driver.findElement(By.cssSelector("span[aria-label='August 15, 2023']")).click(); 
		*/
		//nedojde ke click, debug: 30.7. selected (je tam i predchozi mesic videt - posledni tyden):
		List<WebElement> dates = driver.findElements(By.cssSelector("span[class*='flatpickr-day']"));
		// Grab common attribute, put into a list and iterate:
		int count = driver.findElements(By.cssSelector("span[class*='flatpickr-day']")).size();
		for (int i = 0; i < count; i++) 
			{
			String text = driver.findElements(By.cssSelector("span[class*='flatpickr-day']")).get(i).getText();
			if (text.equalsIgnoreCase("30")) {
				driver.findElements(By.cssSelector("span[class*='flatpickr-day']")).get(i).click(); 
				break;
			}
		}
	}
}
