import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\aerdely.TE-SURFACE10\\IdeaProjects\\demo123\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://amazon.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement searchBar = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("twotabsearchtextbox"))));
        searchBar.sendKeys("watch");


    }
}
