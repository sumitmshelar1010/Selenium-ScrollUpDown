package MainPackage.SeleniumChromeDriver.locators.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownXYaxis {//SCROLL DOWN WITH X-Y AXIS
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://courses.letskodeit.com/practice");
        WebElement we = wd.findElement(By.id("mousehover"));
        JavascriptExecutor je = (JavascriptExecutor) wd;

        //je.executeScript("arguments[0].scrollIntoView();",we);
        je.executeScript("window.scrollBy(0,700)");
        Thread.sleep(3000);
        je.executeScript("window.scrollBy(0,-250)");
        Thread.sleep(3000);
        wd.close();
    }
}
