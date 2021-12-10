package xlsreader;

import java.io.IOException;

public class Readfile {

	public static void main(String[] args) throws IOException  {
String path = "C:\\Users\\praja\\eclipse-workspace\\FreeCRM\\src\\test\\java\\testdatafreecrm\\Details.xlsx";
		String p =ReadExcelSheetData.GetExcelData(path, "Sheet1", "Kajol");
		String q =ReadExcelSheetData.GetExcelData(path, "Sheet2", "Rajat");
		System.out.println(p);
	System.out.println(q);
	
	}

}
