package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class test1 {

	public static void main(String[] args) throws BiffException, IOException {
		
		String path="C:\\Users\\vishal_naik\\Desktop\\dataxls.xls";
		Workbook wb=Workbook.getWorkbook(new File(path));
		 Sheet st= wb.getSheet("Sheet1");
		 String value=st.getCell(0,2).getContents();
		 System.out.println(value);
		 int count=st.getRows()+st.getColumns();
	     System.out.println("Count is "+count);
	     try{
	     for (int counter1=0; counter1<=2 ; counter1++){
	    	 int county=0;
	    	
	    	for (int counter=0; counter<=3 ; counter++){
	    	 Cell cell=st.getCell(county, counter);
	    	 String values=cell.getContents();
	    	System.out.println(values);
	    	 }
	    	 county++;
	     }
	     }
	     catch (Exception e){
	    	 System.out.println("Error");
	     }
		 String path1="C:\\Users\\vishal_naik\\Desktop\\Reading.csv";
		 CSVReader csv=new CSVReader(new FileReader(path1));
		 String[] array_holder=null;
		 
		 while((array_holder=csv.readNext())!=null)
		 {
			 String field1=array_holder[0];
			 String field2=array_holder[1];
			 System.out.println(field1+""+field2);
		 }
			 
	}

}
