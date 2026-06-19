package garena;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Garenamax2 {

	public static void main(String[] args) throws InterruptedException {
   
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://meta.com");
		Thread.sleep(1000);
		driver.navigate().to("https://twitter.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
