package junitframewrok;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demo2 {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
		
	}

	@BeforeEach
	void setUp() throws Exception {
		driver.navigate().back();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.navigate().refresh();
	}

	@Test
	void google() {
		driver.get("https://www.google.com");
		
	}
		
	@Test
	void hcl () {
		driver.get("https://wwww.hcl.com");
		
	}
}
