import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		// zjistime kolik framu je na strance
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		// driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		// prvni frame - index=0
		driver.switchTo().frame(0);
		// driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		// dragAndDrop(source, target)
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		// switch back
		driver.switchTo().defaultContent();

	}

}
