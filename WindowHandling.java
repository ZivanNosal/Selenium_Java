import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#"); //parent window
		driver.findElement(By.cssSelector(".blinkingText")).click(); //link to child window
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildid]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		//switch to child window:
		driver.switchTo().window(childId);
		//extract text and print it:
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		//extract, split, trim white spaces and extract email:
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		//switch back to parent window:
		driver.switchTo().window(parentId);
		//enter extracted email as username:
		driver.findElement(By.id("username")).sendKeys(emailId);

	}

}
