package practise;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test2 {

	
	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\vishal_naik\\Desktop\\Data.xlsx";
		Workbook wb=new XSSFWorkbook(path);
		Sheet st= wb.getSheet("Sheet1");
		 Row value=st.getRow(1);
		 Cell value1=value.getCell(2);
		 System.out.println(value1);
		 int count=st.getLastRowNum()-st.getFirstRowNum();
		 for (int counter=0; counter<=count; counter++){
			 value=st.getRow(counter);
			  value1=value.getCell(0);
			  System.out.println(value1);
		 }
 
	}

}
