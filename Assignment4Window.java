
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// expected result: 1. printed text "New Window" (child window text) 2. printed text "Opening a new window" (parent window text)

		driver.get("https://the-internet.herokuapp.com");
		// click on "Multiple Windows" link (link to next page https://the-internet.herokuapp.com/windows, we are still in parent window):
		driver.findElement(By.linkText("Multiple Windows")).click();
		// click on "Click here" (link to child window, link is located on parent window (second page):
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildid]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		// switch to child window:
		driver.switchTo().window(childId);
		// print text "New Window":
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		// switch back to parent window:
		driver.switchTo().window(parentId);
		// print text "Opening a new window":
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}

}
