import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshwari\\eclipse-workspace\\SeleniumLaunch\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/");
		Actions a=new Actions(driver);
		
		WebElement cou=driver.findElement(By.xpath("//strong[text()='Courses']"));
		WebElement st=driver.findElement(By.xpath("//strong[text()='Software Testing Tools Training']"));
		a.moveToElement(cou).perform();
		a.moveToElement(st).perform();
		st.click();
		
		
		
		
	
	
	}
	

}
