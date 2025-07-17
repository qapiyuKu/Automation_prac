package utilites;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class tttttt {

    public static void main(String[] args) throws IOException {
      String path="C:\\Users\\Nitin\\Desktop\\Piyush_CV\\Practc_excel\\exel.xlsx";
        FileInputStream fis= new FileInputStream(path);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet ws=wb.getSheet("TestData");
       int rowlength=ws.getLastRowNum();
        XSSFRow Row;
       for(int i=0;i<rowlength;i++)
       {
           Row = ws.getRow(i);
           int columun=Row.getLastCellNum();
           for(int j=0;j<columun;j++)
           {
               String excelvalue = Row.getCell(j).toString();
               j++;
               String emailvalue=Row.getCell(j).toString();
               System.out.println("Name : "+excelvalue+" : Email" +
                       "id: "+emailvalue);

           }
       }
        System.out.println("%%%%%%%%%End%%%%%%%%%%%%%%");
    }
}
