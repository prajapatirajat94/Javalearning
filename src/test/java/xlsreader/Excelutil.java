package xlsreader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	
	public static void main(String[] args ) {
		String path = "./Mybook.xlsx";
		String sname ="Sheet1";
		Excelutil ex = new Excelutil(path,sname);
		System.out.println(ex.getCellData(2, 2));
		System.out.println(ex.getRowcount());
		
	}
	
	
	/**
	 * 
	 * @param path
	 * @param sheetName
	 */
	public Excelutil(String path,String sheetName) {
		File file = new File(path);
		try {
			 workbook = new XSSFWorkbook(file);
		 sheet=	workbook.getSheet(sheetName);
		
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @return
	 */
	public  int getRowcount() {	
		return sheet.getLastRowNum();
	
	}
	/**
	 * 
	 * @param rownum
	 * @param cellnum
	 * @return
	 */
	public Object getCellData(int rownum,int cellnum) {
		
		DataFormatter format = new DataFormatter();
		Object value=format.formatCellValue(sheet.getRow(rownum).getCell(cellnum));
		
		return value;
	}
	
	
	
	
}
