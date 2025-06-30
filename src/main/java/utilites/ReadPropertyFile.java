package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {



    public static String getPropertyvalue(String s) throws IOException {
        String path="C:\\Users\\Nitin\\IdeaProjects\\Automation_prac\\src\\main\\resources\\config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        String br = prop.getProperty(s);
        System.out.println(br);
        return br;
    }



    public static void main(String[] args) throws IOException {
        ReadPropertyFile.getPropertyvalue("browser");

    }
}
