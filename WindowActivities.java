import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com"); //ceka na full load of page
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); //neceka
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
