package garena;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Garenamax {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	Thread.sleep(3000);
	driver.navigate().to("https://instagram.com");
	Thread.sleep(3000);
	driver.navigate().to("https://pubg.com");
	Thread.sleep(3000);
    driver.navigate().to("https://manabadi.com");
	Thread.sleep(3000);
	driver.navigate().to("https://techlearn.in");
	Thread.sleep(3000);
    driver.navigate().back();
    Thread.sleep(3000);
    driver.navigate().forward();
    Thread.sleep(2000);
    driver.navigate().refresh();
    driver.quit();
		
		


	
	

	}

}
