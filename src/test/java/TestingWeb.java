import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Set;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class TestingWeb {
    public void testing(){
        System.setProperty("webdriver.chrome.driver",
                "resources/windows/chromedriver.exe");
     WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
     driver.get("https://formy-project.herokuapp.com/form");
        //wait = WebDriverWait(driver, 10);
     driver.findElement(By.cssSelector("#first-name")).sendKeys("Amir");
     driver.findElement(By.cssSelector("#last-name")).sendKeys("Mamdouh");
     driver.findElement(By.cssSelector("#jobtitle")).sendKeys("Engineer");
     driver.findElement(By.cssSelector("#radio-button-1")).click();
     driver.findElement(By.cssSelector("#checkbox-1")).click();
     driver.findElement(By.cssSelector("#select-menu > option:nthchild(2)")).click();
     driver.findElement(By.cssSelector("body > div > form > div > div:nthchild(15) > a")).click();
     driver.quit();
    }
}
