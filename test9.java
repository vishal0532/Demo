package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.mysql.jdbc.log.Log;

public class test9 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		String u="";
		String p="";
		String url="jdbc:mysql://localhost:3306/hello1";
		cn=DriverManager.getConnection(url, u, p);
		DOMConfigurator dom=new DOMConfigurator();
		dom.configure("log4j.xml");
		Logger log=Logger.getLogger(Log.class.getName());
		log.info("Hello");
		
		((TakesScreenshot)driver,

	}

}
