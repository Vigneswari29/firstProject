import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshwari\\eclipse-workspace\\SeleniumLaunch\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http:facebook.com");
	driver.manage().window().maximize();
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	String title=driver.getTitle();
	System.out.println(title);
	//Thread.sleep(5000);
	
	WebElement e=driver.findElement(By.xpath("(//input[@name='email'])"));
	e.sendKeys("hello");
	
	WebElement f=driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]"));
	f.sendKeys("world");
	
	WebElement btn=driver.findElement(By.xpath("//input[@type='submit']"));
	btn.click();
}
}
