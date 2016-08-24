package practise;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import au.com.bytecode.opencsv.CSVReader;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class test7 {

	
	public static void main(String[] args) throws BiffException, IOException {
		
		String path="C:\\Users\\vishal_naik\\Desktop\\dataxls.xls";
		Workbook wb=Workbook.getWorkbook(new File(path));
		Sheet sh=wb.getSheet("Sheet1");
		  String cl=sh.getCell(0, 1).getContents();
		  System.out.println(cl);
		
		  String path1="C:\\Users\\vishal_naik\\Desktop\\Reading.csv";
		  CSVReader csv=new CSVReader(new FileReader(path1));
		  String[] holder=null;
		  while((holder=csv.readNext())!=null){
			  System.out.println(holder[0]);
			  
		  }
		  

	}

}
