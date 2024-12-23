import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; //TestNG package

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); //*-regular expression
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); 
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Count the number of all checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//validating elements are disabled/enabled with attributes
		//radio button: ctl00_mainContent_rbtnl_Trip_1 + calendar(return date): ctl00_mainContent_view_date2
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled() 
		//- to nefunguje spravne, protoze element NENI disabled pro click - automaticky se tim clickem zmeni one way to return trip radio button
		//+ style value se zmeni z "...0.5" na "...1"
		//<div id="Div1" class="picker-second" style="display: block; opacity: 0.5;" xpath="1">
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("it is enabled");
				Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
