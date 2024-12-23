import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntro {

	public static void main(String[] args) {
		
		
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods close get
		//Webdriver close get
		//Webdriver methods + class methods
		
		//chromedriver.exe ->Chrome browser
		System.setProperty("webdriver.chrome.driver", "/Users/HP/chromedriver.exe");  //C:\Users\HP
		
		//webdriver.chrome.driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://cs.wikipedia.org/wiki/GNOME");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close(); - zavre okno (tab)
		driver.quit(); //zavre vsechna okna (taby) otevrene behem testu
		
	}

}
