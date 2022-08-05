package Testing;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class examples3 extends ProjectSetup {

        public static void main(String[] args) {
                ProjectSetup p = new ProjectSetup();
                driver = p.openBrowser();

                //Multiple Windows
                driver.findElement(By.linkText("Multiple Windows")).click();
                driver.findElement(By.linkText("Click Here")).click();
                Set<String> currentWindows= driver.getWindowHandles();
                Iterator<String> it= currentWindows.iterator();
                String parent= it.next();
                String child= it.next();
                driver.switchTo().window(child);
                System.out.println(driver.getTitle());
                driver.switchTo().window(parent);
                System.out.println(driver.getTitle());
                System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

                //Nested Frames
                driver.findElement(By.linkText("Nested Frames")).click();
                driver.switchTo().frame("frame-top");
                driver.switchTo().frame("frame-middle");
                System.out.println(driver.findElement(By.xpath("//div[contains(text(), 'MIDDLE')]")).getText());

                //Notification Messages
                driver.findElement(By.linkText("Notification Messages")).click();
                System.out.println(driver.findElement(By.id("flash")).getText());
                driver.findElement(By.linkText("Click here")).click();
                System.out.println(driver.findElement(By.id("flash")).getText());

                //Redirect Link
                driver.findElement(By.linkText("Redirect Link")).click();
                driver.findElement(By.id("redirect")).click();

                driver.findElement(By.linkText("200")).click();
                driver.findElement(By.linkText("here")).click();

                driver.findElement(By.linkText("301")).click();
                driver.findElement(By.linkText("here")).click();

                driver.findElement(By.linkText("404")).click();
                driver.findElement(By.linkText("here")).click();

                driver.findElement(By.linkText("500")).click();
                driver.findElement(By.linkText("here")).click();

                //Secure File Download
                driver.findElement(By.linkText("Secure File Download")).click();
                driver.get("http://admin:admin@the-internet.herokuapp.com/download_secure");
                driver.findElement(By.linkText("WhatsappImage.jpeg")).click();

                //Shadow DOM
                driver.findElement(By.linkText("Shadow DOM")).click();
                System.out.println(driver.findElement(By.xpath("//span[@slot='my-text']")).getText());
                System.out.println(driver.findElement(By.xpath("//ul/li")).getText());
                System.out.println(driver.findElement(By.xpath("//ul/li[2]")).getText());
        }
}
