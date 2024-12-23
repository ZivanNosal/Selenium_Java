import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//implicit wait - 2s time out
		
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("zivan");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//řešení exception ("no such element: Unable to locate element:..."), kterou ja ale nedostavam:
		//Thread.sleep(1000);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("zivan");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("zivan@test.com");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("zivan@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("777888999");
		
		//řešení ElementClickInterceptedException (sliding page)
		//("openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <button class="reset-pwd-btn">...</button> is not clickable at point (423, 549). Other element would receive the click: <div class="overlay-panel overlay-left">...</div>")
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//řešení ElementClickInterceptedException:
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //pozor: ten preklep "conainer" se musi pouzit
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("zivan");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		//řešení ElementClickInterceptedException:
		Thread.sleep(1000);
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		
		
		
	}

}
