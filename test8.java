package practise;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test8 {


	public static void main(String[] args) throws InvalidFormatException, IOException {
		String path="C:\\Users\\vishal_naik\\Desktop\\Data.xlsx";
		
		File fl=new File(path);
		Workbook wb=new XSSFWorkbook(fl);
		Sheet sh=wb.getSheet("Sheet1");
         int count=sh.getLastRowNum()-sh.getFirstRowNum();
         for (int i=0;i<count; i++){
        	  Row row=sh.getRow(i);
        	 Cell value= row.getCell(0);
        	 System.out.println(value);
         }
	}

}
