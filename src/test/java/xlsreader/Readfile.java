package xlsreader;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Readfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
String path = "C:\\Users\\praja\\eclipse-workspace\\FreeCRM\\src\\test\\java\\testdatafreecrm\\Details.xlsx";
		String p =ReadExcelSheetData.GetExcelData(path, "Sheet1", "Kajol");
		System.out.println(p);

	}

}
