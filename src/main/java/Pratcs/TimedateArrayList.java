package Pratcs;

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

public class TimedateArrayList {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.timeanddate.com/weather/");
        String singlestringvalue="";
       List<WebElement>alldata= driver.findElements(By.xpath("//td"));
       List<String>allstringdata=new ArrayList<>();
       for(WebElement singleWeBlement:alldata)
       {
           singlestringvalue=singleWeBlement.getText();
           allstringdata.add(singlestringvalue);
       }
       String path="C:\\Users\\Nitin\\Desktop\\Piyush_CV\\Practc_excel\\Wtr15.xlsx";
      FileOutputStream fos=new FileOutputStream(path);
      XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet("tsetdata");
        XSSFRow Row;
        int j=0;
        for(int i=0;i<allstringdata.size();)
        {
            Row=ws.createRow(j);
            j++;
            Row.createCell(0).setCellValue(allstringdata.get(i));
            i++;
            Row.createCell(1).setCellValue(allstringdata.get(i));
            i=i+2;
            Row.createCell(2).setCellValue(allstringdata.get(i));
            i++;
        }
        wb.write(fos);
        wb.close();
    }
}
