import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshwari\\eclipse-workspace\\SeleniumLaunch\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http:facebook.com");
	//driver.manage().window().maximize();
	WebElement down=driver.findElement(By.xpath("//div[@class='mvl copyright']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("argument[0].scrollIntoView(true)",down);
	Thread.sleep(5000);
	
	WebElement up=driver.findElement(By.xpath("//input[@type='submit']"));
	js.executeScript("argument[0].scrollIntoView(false)",up);
	
	
}
}
