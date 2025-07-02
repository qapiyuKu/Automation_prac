package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

class parent{
    static String a ;
    public static void method_p(){
        a= "it is parent variable";;
    }
}
public class TesttInheritnce  extends parent {
    TesttInheritnce obj ;
    String a;
    public TesttInheritnce() {
    parent.method_p();
    this.a = parent.a;
    ;

}

    @Test
    public void method_p1(){

        System.out.println(a);
    }
    }