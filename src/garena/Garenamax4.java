package garena;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Garenamax4 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://instagram.com");
Thread.sleep(3000);
driver.navigate().to("https://wipro.com");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(300);
driver.navigate().forward();
driver.quit();

	}

}
