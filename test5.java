package practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test5 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		test5 t=new test5();
		t.connectiontest();
	}
		
		public void connectiontest() throws ClassNotFoundException, SQLException{
		Connection cn=null;
		Statement st=null;
		ResultSet rs=null;
		
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/test002"; 
		String u="root";
		String p="Abcd1234*";
		cn=DriverManager.getConnection(url, u, p);
	
		st=cn.createStatement();
		String query="Select * from hello1";
		 rs=st.executeQuery(query);
		 while (rs.next()){
			 System.out.println(rs.getString("name").toString());
			 
		 }
		
		

	}

}
