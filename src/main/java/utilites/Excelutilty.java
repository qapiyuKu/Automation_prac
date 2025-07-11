package utilites;

import io.opentelemetry.api.common.Value;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excelutilty {

     static String  excelvalue = " ";
    static String Cellvalue=" ";

    public static String ExcelutiltyValue() throws IOException {
        String path = "C:\\Users\\Nitin\\IdeaProjects\\Automation_prac\\src\\main\\resources\\Excel.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet("Testvalue");
        int lastrow = ws.getLastRowNum();
        for (int i = 0; i < lastrow; i++) {
            XSSFRow Row = ws.getRow(i);
            for (int j = 0; j < 2; j++) {
                XSSFCell x = Row.getCell(j);
                excelvalue = x.getStringCellValue();
                System.out.println(excelvalue);
            }
        }
        wb.close();
        return excelvalue;
    }
public static String ExcelvalueAccoringPassAurmnt(String sheetname,int row,int column) throws IOException {
        String path = "C:\\Users\\Nitin\\IdeaProjects\\Automation_prac\\src\\main\\resources\\Excel.xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet(sheetname);
        XSSFRow ROWValue = ws.getRow(row);
       Cellvalue = ROWValue.getCell(column).toString();
    System.out.println(Cellvalue);
       wb.close();
       return Cellvalue;
    }
    public static void main(String[] args) throws IOException {
       // Excelutilty.ExcelutiltyValue();
        Excelutilty.ExcelvalueAccoringPassAurmnt("Testvalue",0,1);
    }
}