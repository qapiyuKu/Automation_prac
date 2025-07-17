package utilites;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//list me name aur mailid strore krke print karwana hai
public class PrctsExcelRead {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Nitin\\Desktop\\Piyush_CV\\Practc_excel\\exel.xlsx";
        String name="";
        String gmail="";
        List<String>Name=new ArrayList<>();
        List<String>Gmail=new ArrayList<>();
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet("TestData");
        int rowcount=ws.getLastRowNum();
        for(int i=0;i<=rowcount;i++)
        {
            XSSFRow Row = ws.getRow(i);
            int columncount=Row.getLastCellNum();
            for(int j=0;j<columncount;j++)
            {
                 name = Row.getCell(j).toString();
                               j++;
                gmail=Row.getCell(j).toString();
            }
            Name.add(name);
            Gmail.add(gmail);
        }

        for(int k=0;k<Name.size();k++)
        {
            System.out.println("Name : "+ Name.get(k)+" EmailId ; "+Gmail.get(k));
        }
    }
    
   
}
