package xlsreader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheetData {
public static Workbook book;
public static Sheet sheet;
/**
 * 
 * @param path
 * @param Sheetname
 * @param key
 * @return
 * @throws IOException
 */
public static String GetExcelData(String path,String Sheetname,String key) throws IOException {
      
	  
	  FileInputStream file = new FileInputStream(path);

	  book = WorkbookFactory.create(file);
	
	   sheet =book.getSheet(Sheetname);
	  
	  int lastRow = sheet.getLastRowNum();
	  
	  Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String,String>>();
	  
	  Map<String, String> dataMap = new HashMap<String, String>();
	  
	  //Looping over entire row
	  for(int i=0; i<=lastRow; i++){
		  Row row = sheet.getRow(i);
	  
	  //1st Cell as Value
	  Cell valueCell = row.getCell(1);
		  
	  //0th Cell as Key
	  Cell keyCell = row.getCell(0);
		  
	  String value = valueCell.getStringCellValue().trim();
	  String keys = keyCell.getStringCellValue().trim();
		  
	  //Putting key & value in dataMap
	  dataMap.put(keys, value);
		  
	  //Putting dataMap to excelFileMap
	  excelFileMap.put("DataSheet", dataMap);
  }
	  // here we took key of excelfilemap so it would give HAshmap
	  Map<String, String> m = excelFileMap.get("DataSheet");
		String value = m.get(key);
		return value;
 
}
}
