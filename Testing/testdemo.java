package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class testdemo extends ProjectSetup {

    public static void main(String[] args) throws InterruptedException {
        ProjectSetup p = new ProjectSetup();
        driver = p.openBrowser();

        //print no.of links present in page
 /*       System.out.println(driver.findElements(By.xpath("//body/div[2]/div/ul/li")).size());
        //alternate way to print no.of links present in page
        System.out.println(driver.findElements(By.tagName("li")).size());
*/
        //to open links of same page in different tab

        for(int i=1; i<driver.findElements(By.tagName("li")).size(); i++);
        {
            String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            driver.findElements(By.tagName("li")).get(i).sendKeys(clickOnLink);
        }

    }
}