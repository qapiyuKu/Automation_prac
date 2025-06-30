package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Nitin\\IdeaProjects\\Automation_prac\\src\\main\\resources\\config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        String br = prop.getProperty("browser");
        System.out.println(br);
    }
}
