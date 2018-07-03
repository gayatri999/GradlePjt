package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	public static void main(String[] args) {
		//https://www.irctc.co.in/eticketing/loginHome.jsf
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElementByXPath("//*[text()='AGENT LOGIN']").click();
		
		
		driver.findElementByLinkText("Sign up").click();
	}
}
