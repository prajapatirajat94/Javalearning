package xlsreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class ExcelReader {
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static FileInputStream file;
public static void main (String[]s) {
	String path = "C:\\Users\\praja\\eclipse-workspace\\Javalearning\\Mybook.xlsx";
	HashMap<String, String>data =Readfile(path,"Sheet1","Rajat");
	data.forEach((k,v) -> System.out.println(k+"  "+v));
	
	
	
}

public static HashMap<String, String> Readfile(String path,String SheetName,String TestName) {
	// path = "C:\\Users\\praja\\eclipse-workspace\\Javalearning\\Mybook.xlsx";
	HashMap<String,String> enterdata = new HashMap<String,String>();
	try {
		 file= new FileInputStream(path);	
		book = new XSSFWorkbook(file);
	} 
	catch (IOException e) {		
		e.printStackTrace();
	}
	 sheet= book.getSheet(SheetName);
	String TEMPTC;
	
	int Rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	//System.out.println(Rowcount);
	for(int i=0;i<Rowcount;i++) {
		Row row = sheet.getRow(i+1);
		TEMPTC =row.getCell(0).getStringCellValue().trim(); 
		//System.out.println(TEMPTC);
		if(TEMPTC.equalsIgnoreCase(TestName)) {
		for(int j=0;j<row.getLastCellNum();j++) {
			Row BaseRow = sheet.getRow(0);
						
			enterdata.put(BaseRow.getCell(j).getStringCellValue().trim(),row.getCell(j).getStringCellValue().trim());
			//enterdata.forEach((k,v) -> System.out.println(k+"  "+v));
		}
		break;
		}
		}
	if(file !=null) {
		try {
			file.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	return enterdata;
}
	
	
	
}
