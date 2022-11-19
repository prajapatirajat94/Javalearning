package xlsreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcel {
public static FileInputStream file;
public static Workbook book;
public static Sheet sheet;
	public static void main(String[] args) {
		String path = "C:\\Users\\praja\\eclipse-workspace\\Javalearning\\Mybook.xlsx";
		HashMap<String, String>data1 =ReadingData(path,"Sheet1","Kamal");
		//data1.forEach((k,v) -> System.out.println(k+"  "+v));
		String p=data1.get("address");
		System.out.println(p);
		

	}
	
	public static  HashMap <String,String> ReadingData(String path, String SheetName,String TC) {
		HashMap<String, String>data = new HashMap<String, String>();
		try {
			file= new FileInputStream(path);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	  	try {
			book =new XSSFWorkbook(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		sheet = book.getSheet(SheetName);
		String TEMP;
		int RowNum = sheet.getLastRowNum();
		for(int i =0;i<=RowNum;i++) {
			Row row = sheet.getRow(i);
			TEMP =row.getCell(0).getStringCellValue().trim();
			
			if(TEMP.equalsIgnoreCase(TC)) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Row baserow= sheet.getRow(0);
				data.put(baserow.getCell(j).getStringCellValue().trim(),
				         row.getCell(j).getStringCellValue().trim());
					
					
				}
				break;
			}
			
		}
		return data;
		
		
		
		
		
		
		
		
		
		
		
	}

}
