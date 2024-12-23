import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //pokud se vynecha tenhle radek, tak v minimalizovanem okne je static dropdown
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //element not interactable exception 
		//musel jsem to zmenit oproti skoleni:
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); //bez indexu "2" vraci dva elementy
		//bez pouziti indexu:
		//parent-child relatioship xpath (note: mezera mezi parent xpath a child xpath):
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//calendar
		//current date:ui-state-default ui-state-highlight
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		

	}

}

