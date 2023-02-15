package doingscreenshotProject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DoingScreenShotProject {
private static	 WebDriver driver ;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		driver.get("https://crossbrowsertesting.github.io/");
	
           driver.manage().window().maximize();
           Date date=new Date( );
           SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
           String string_Date=dateformat.format(date);
         
           File screenshotpage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           
           
    // came doubt so we have to create folder with own name like oreyyedava1screesnshots we can have single forward slash or backward slash  /...//
 File path=new File(System.getProperty("user.dir")+"//oreyyedava9screesnshots//homepage"+string_Date+".png");
           
          FileUtils.copyFile(screenshotpage,path);
          
         driver.close();
          
	}
}

         