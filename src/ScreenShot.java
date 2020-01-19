

  import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ScreenShot {
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vigneshwari\\eclipse-workspace\\SeleniumLaunch\\driver\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("http:facebook.com");
			driver.manage().window().maximize();
			TakesScreenshot tk=(TakesScreenshot)driver;
			File src=tk.getScreenshotAs(OutputType.FILE);
			File des=new File("E:\\facebook.jpeg");
			FileUtils.copyFile(src,des);
			driver.quit();
			
			}

		
		}


