package ScreenshotWordfile;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotStoreWordFile2 {
    public static WebDriver driver;
    public static void main(String[] args) throws InvalidFormatException, InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        fnCaptureScreen("TEST_PASS1",driver);
        fnCaptureScreen("TEST_PASS2",driver);

    }



    public static void fnCaptureScreen(String message, WebDriver driver) throws IOException, InvalidFormatException{
       File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path =  System.getProperty("user.dir") + "/FailedScreenshotFile/" + System.currentTimeMillis() + ".png";
        FileUtils.copyFile(file,new File(path));
        Path Screenshot = Paths.get("./FailedScreenshotFile/");
        //creating folder if not exist

        if(!Files.exists(Screenshot)) {
            new File(String.valueOf(Screenshot)).mkdirs();
        }

        XWPFParagraph para;
        XWPFParagraph para1;
        XWPFRun run;
        XWPFRun run1;

//checking dox file exist or not  if not it will create one
        if(!Files.exists(Paths.get("./FailedScreenshotFile/Screenshot.docx"))) {
            //creating new docx file
            try(XWPFDocument doc = new XWPFDocument();
                FileOutputStream out = new FileOutputStream(new File("./FailedScreenshotFile/Screenshot.docx"))){
                para = doc.createParagraph();
                para.setSpacingBefore(0);
                para.setSpacingAfter(0);
                para.setSpacingBetween(1);

                run = para.createRun();
                run.setFontFamily("Consolas");
                run.setFontSize(10);
                run.setText("Test Run Date: ");
                run.addBreak();
                run.setText("Test Case Id :");
                run.addBreak();
                run.setText("Test Name: ");
                run.addBreak();


                if(message.trim().length() != 0) {
                    run.addBreak();
                    run.setText("***---->" + message);
                }


                    para1 = doc.createParagraph();
                    para1.setSpacingBefore(0);
                    para1.setSpacingAfter(0);
                    para1.setSpacingBetween(1);
                    run1 = para1.createRun();

                    para1.setBorderTop(Borders.THREE_D_EMBOSS);
                    para1.setBorderLeft(Borders.THREE_D_EMBOSS);
                    para1.setBorderRight(Borders.THREE_D_EMBOSS);
                    para1.setBorderBottom(Borders.THREE_D_EMBOSS);

                    InputStream pic = new FileInputStream(path);

                    run1.addPicture(pic, 6, path, Units.toEMU(465), Units.toEMU(250));
                    pic.close();


                doc.write(out);
            }
        }
        else {
            try(FileInputStream fis = new FileInputStream("./FailedScreenshotFile/Screenshot.docx");
                XWPFDocument doc = new XWPFDocument(fis);
                FileOutputStream out = new FileOutputStream("./FailedScreenshotFile/Screenshot.docx")){

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

                    para1 = doc.createParagraph();
                    para1.setSpacingBefore(0);
                    para1.setSpacingAfter(0);
                    para1.setSpacingBetween(1);
                    run1 = para1.createRun();

                    para1.setBorderTop(Borders.THREE_D_EMBOSS);
                    para1.setBorderLeft(Borders.THREE_D_EMBOSS);
                    para1.setBorderRight(Borders.THREE_D_EMBOSS);
                    para1.setBorderBottom(Borders.THREE_D_EMBOSS);

                    InputStream pic = new FileInputStream(path);

                    run1.addPicture(pic, 6, path, Units.toEMU(465), Units.toEMU(250));
                    pic.close();


                doc.write(out);
            }
        }
    }






}
