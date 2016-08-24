package practise;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test6 {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdiver.ie.driver", "E:\\")
    WebDriver driver=new FirefoxDriver();
    driver.get("http://google.com");
    driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
    driver.findElement(By.xpath("//button[@class='lsb']")).click();
    Thread.sleep(2000);
    List<WebElement> holder=driver.findElements(By.xpath("//cite[@class='_Rm']"));
    int counter=0;
    for (WebElement loop:holder){
    	String text=loop.getText();
    	
    	if (text.startsWith("www.seleniumhq.org")){
    		counter++;
    	}
    	//Runtime.getRuntime().exec("C:\\Downloads\\autoit-v3-setup.exe");
    }
    System.out.println("The urls count is "+counter);
    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(source, new File("C:\\Users\\vishal_naik\\Desktop\\New Folder\\hell.png"));
	}
	ProfilesIni prof=new ProfilesIni();
	FirefoxProfile FP=prof.getProfile("Test");
	
 //WebDriverWait wait=wait.until(ExpectedConditions.visibilityOf(element))
  
}
 //java -jar selenium_2.42_server.jar role -hub http://localhost:8080/register
	 