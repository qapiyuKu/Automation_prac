import baselib.BaseLib;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testclass extends BaseLib {
    @Test
    public static void test() {
        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]")).click();

    }
}
