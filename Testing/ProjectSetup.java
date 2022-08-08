package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectSetup {
   static WebDriver driver;

   public WebDriver openBrowser() {

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\vk sinha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("http://the-internet.herokuapp.com/");
       return(driver);

   }
     public static void main(String[] args) throws InterruptedException {
       ProjectSetup p =new ProjectSetup();
       driver=p.openBrowser();

    }

}
