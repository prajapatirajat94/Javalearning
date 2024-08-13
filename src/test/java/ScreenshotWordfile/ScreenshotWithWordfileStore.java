package ScreenshotWordfile;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;

public class ScreenshotWithWordfileStore {
public static WebDriver driver;
	public static void main(String[] args) throws InvalidFormatException, InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
 driver = new ChromeDriver();
driver.get("https://www.google.com/");
fnCaptureScreen(true,"TEST_PASS",driver);

	}
	
	public static void fnCaptureScreen(boolean takePict,String stepDecs,WebDriver driver) throws InterruptedException, IOException, InvalidFormatException {
		
		Thread.sleep(250);
		//taking screenshot in specific folder
		String strImageFolderPath="./Screenshot/";
		
		File folder=new File(strImageFolderPath+"/");
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		String sFileName="";
		String sFullImageFileName="";
		
		if(takePict) {
			String timestamp= new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
			sFileName = "ScrShot-"+ timestamp;
			sFullImageFileName=strImageFolderPath+"/"+sFileName+".png";
			BufferedImage scrShot = new AShot().takeScreenshot(driver).getImage();
			ImageIO.write(scrShot, "PNG", new File(sFullImageFileName));
						
		}
		
		//Writing Decription and screenshot in word file
		fnWriteInDocxFile(sFullImageFileName,stepDecs,takePict);
		
		
	}
	
	
public static void fnWriteInDocxFile(String imgFullFileName, String message, boolean isPictureTaken) throws IOException, InvalidFormatException{
		//Checking folder exist
		String timestamp = new SimpleDateFormat("yyyy_MM_dd").format(new Date());
		
		String strImagefolderpath="./Screenshot/";
		
		String setgTestFilePath = strImagefolderpath+timestamp+"/";	
		//creating folder if not exist
		File folder = new File(setgTestFilePath);
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		XWPFParagraph para;
		XWPFParagraph para1;
		XWPFRun run;
		XWPFRun run1;
		
		String setFullFileName = setgTestFilePath+"SS"+".docx";
		System.out.println(setFullFileName);
		File file = new File(setFullFileName);
		System.out.println(file.exists());
		if(!file.exists()) {
		//creating new docx file
		try(XWPFDocument doc = new XWPFDocument();
			FileOutputStream out = new FileOutputStream(new File(setFullFileName))){	
			para = doc.createParagraph();
			para.setSpacingBefore(0);
			para.setSpacingAfter(0);
			para.setSpacingBetween(1);
			
			run = para.createRun();
			run.setFontFamily("Consolas");
			run.setFontSize(10);
			run.setText("Test Run Date: "+timestamp);
			run.addBreak();
			run.setText("Test Case Id :");
			run.addBreak();
			run.setText("Test Name: ");
			run.addBreak();
		
			
			if(message.trim().length() != 0) {
				run.addBreak();
				run.setText("***---->" + message);
			}
			
			if(isPictureTaken) {
				para1 = doc.createParagraph();
				para1.setSpacingBefore(0);
				para1.setSpacingAfter(0);
				para1.setSpacingBetween(1);
				run1 = para1.createRun();
				
				para1.setBorderTop(Borders.THREE_D_EMBOSS);
				para1.setBorderLeft(Borders.THREE_D_EMBOSS);
				para1.setBorderRight(Borders.THREE_D_EMBOSS);
				para1.setBorderBottom(Borders.THREE_D_EMBOSS);
				
				InputStream pic = new FileInputStream(imgFullFileName);
				
				run1.addPicture(pic, 6, imgFullFileName, Units.toEMU(465), Units.toEMU(250));
				pic.close();
				
			}
			doc.write(out);
		}
		}
		else {
			try(FileInputStream fis = new FileInputStream(file);
				XWPFDocument doc = new XWPFDocument(fis);		
				FileOutputStream out = new FileOutputStream(file)){	
				
//Opening Existing file
				para = doc.createParagraph();
				para.setSpacingBefore(0);
				para.setSpacingAfter(0);
				para.setSpacingBetween(1);
				
				run = para.createRun();
				run.setFontFamily("Consolas");
				run.setFontSize(10);
			
				if(message.trim().length() != 0) {
					run.addBreak();
					run.setText("***---->" + message);
				}
				if(isPictureTaken) {
					para1 = doc.createParagraph();
					para1.setSpacingBefore(0);
					para1.setSpacingAfter(0);
					para1.setSpacingBetween(1);
					run1 = para1.createRun();
					
					para1.setBorderTop(Borders.THREE_D_EMBOSS);
					para1.setBorderLeft(Borders.THREE_D_EMBOSS);
					para1.setBorderRight(Borders.THREE_D_EMBOSS);
					para1.setBorderBottom(Borders.THREE_D_EMBOSS);
					
					InputStream pic = new FileInputStream(imgFullFileName);
					
					run1.addPicture(pic, 6, imgFullFileName, Units.toEMU(465), Units.toEMU(250));
					pic.close();
					
				}
				doc.write(out);						
		}		
	}
}
}
		

