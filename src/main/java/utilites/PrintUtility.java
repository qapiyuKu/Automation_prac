package utilites;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class PrintUtility {
    private static Logger logger= LogManager.getLogger(PrintUtility.class);

    // private static final org.apache.logging.log4j.Logger logger= org.apache.logging.log4j.LogManager.getLogger(Print_Utility.class);
public static void getPrint(String s)
{
    logger.info("get print is called");
    System.out.println(s);
    System.out.println(">>>>Print STRING<<<<<<<<<<");
}
    public static void getPrint(int s)
    {
        System.out.println(s);
        System.out.println(">>>>Print INTEGER<<<<<<<<<<");
    }
    public static void getPrint(Object s)
    {
        System.out.println(s);
        System.out.println(">>>>Print OBJECT<<<<<<<<<<");
    }
    public static void getPrint(List<Object> s)
    {
        System.out.println(s);
        System.out.println(">>>>Print STRING<<<<<<<<<<");
    }
    public static void printspecfic(Logger logger,Object o,StackTraceElement t)
    {
        String s = o.getClass().getEnclosingMethod().getName() + "<<>>" + t.getLineNumber();
        System.out.println(s);
    }

    public static void main(String[] args) {
        getPrint("pop");
    }

}

