import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshwari\\eclipse-workspace\\SeleniumLaunch\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	WebElement n = driver.findElement(By.id("selenium_commands"));
	
	Select s=new Select(n);
	List<WebElement> opt=s.getOptions();
	for(WebElement x:opt)
	{
		String t=x.getText();
		System.out.println(t);
	}
	
	
}
}
