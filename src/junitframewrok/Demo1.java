package junitframewrok;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demo1 {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	
	void google(){
		driver.get("https://google.com");
	}
	
	void hcl() {
		driver.get("https://hcl.com");
	
	}

}
