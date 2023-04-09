package MainPackage.SeleniumChromeDriver.locators.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {//TO SCROLL DOWN AND UP BY ELEMENT ARGUMENT

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://courses.letskodeit.com/practice");
        WebElement we = wd.findElement(By.id("mousehover"));
        WebElement we1 = wd.findElement(By.id("bmwradio"));

        JavascriptExecutor je = (JavascriptExecutor)wd; //downCasting
        /** JavascriptExecutor is Interface
         * we cannot create the instance of interface**/
        je.executeScript("arguments[0].scrollIntoView();",we);

        Thread.sleep(3000);
        je.executeScript("arguments[0].scrollIntoView();",we1);
        Thread.sleep(3000);
          wd.close();
    }/**JavaScriptExecutor is a interface and executeScript is a method  */
}
