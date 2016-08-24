package practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test10 {


	public static void main(String[] args) throws IOException {

      WebDriver driver=new FirefoxDriver();
      driver.get("http://www.thesitewizard.com/archive/navigation.shtml");
     // WebElement a1=driver.findElement(By.id("dummymenu"));
      Select sl=new Select(driver.findElement(By.id("dummymenu")));
      sl.selectByVisibleText("Home");
      
     File fl=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(fl, new File("C:\\Users\\vishal_naik\\Desktop\\New Bitmap Image.png"));
      
      

	}

}
