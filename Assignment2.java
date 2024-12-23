import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//fill name, email, psw
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("zivan");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("zivan@test.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("heslo111");
		//check the checkbox
		driver.findElement(By.id("exampleCheck1")).click();
		//select any option from dropdown
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		//radiobutton "Student"
		driver.findElement(By.id("inlineRadio1")).click();
		//enter birthday by sendKeys
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("01/11/2011");
		//submit button
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		//print message
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
