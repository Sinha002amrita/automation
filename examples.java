import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class examples {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vk sinha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/");
        System.out.println(driver.findElement(By.cssSelector(".heading")).getText());
        driver.findElement(By.linkText("A/B Testing")).click();
        System.out.println(driver.findElement(By.tagName("p")).getText());

        driver.navigate().back();
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        driver.findElement(By.cssSelector(".added-manually")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Basic Auth")).click();

        //driver.switchTo().alert().sendKeys("admin");

        driver.navigate().back();

    }
}
