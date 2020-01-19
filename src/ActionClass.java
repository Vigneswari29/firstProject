import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshwari\\eclipse-workspace\\SeleniumLaunch\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http:facebook.com");
		//driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("email"));
		Actions a=new Actions(driver);
		a.keyDown(e,Keys.SHIFT).sendKeys("viki").keyUp(e,Keys.SHIFT).perform();
		
		a.doubleClick(e).perform();
		a.contextClick(e).perform();
		
		System.out.println("selenium class");
		System.out.println("greens");
		System.out.println("chennai");
		
	}
}
