package Pratcs;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TimeDateWorld {
    public static <XSSF> void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.timeanddate.com/weather/");
        String singledata="";
        String path="C:\\Users\\Nitin\\Desktop\\Piyush_CV\\Practc_excel\\Weatherwrite.xlsx";
        List<WebElement>alldata=driver.findElements(By.xpath("//td"));
       FileOutputStream fos=new FileOutputStream(path);
       XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet();
        int rownbr=0;
        int column=0;
        XSSFRow Row = null;
         for(int i=0;i<alldata.size();i++)
         {
             if(i%4==0)
             {
                 Row = ws.createRow(rownbr);
                 rownbr++;
                 column=0;
             }
             if(i%4==2)
             {
                 continue;
             }
             Row.createCell(column).setCellValue(alldata.get(i).getText());
             column++;
         }
         wb.write(fos);

    }
}
