package practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.jna.Platform;

public class test4 {

	public static void main(String[] args) throws MalformedURLException {
	
		
		DOMConfigurator dom=new DOMConfigurator();
		dom.configure("Log4j.xml");
		Logger log=Logger.getLogger(Log.class.getName());
        log.info("Hello");
        DesiredCapabilities dc=DesiredCapabilities.firefox();
        dc.setBrowserName("firefox");
        dc.setPlatform(org.openqa.selenium.Platform.WINDOWS);
        WebDriver driver=new RemoteWebDriver(new URL("http://localhost:8080"),dc);
      
	}

}
