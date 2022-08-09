package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;

public class testdemo extends ProjectSetup {

    public static void main(String[] args)  {
        ProjectSetup p = new ProjectSetup();
        driver = p.openBrowser();

        //print no.of links present in page
       System.out.println(driver.findElements(By.xpath("//body/div[2]/div/ul/li")).size());
        //alternate way to print no.of links present in page
        System.out.println(driver.findElements(By.tagName("li")).size());

        //to open links of same page in different tab
        List<WebElement> linkCollection = driver.findElements(By.tagName("a"));
         System.out.println(driver.findElement(By.tagName("ul")).getText());

        for (int i = 1; i < linkCollection.size(); i++)
        {
            String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            linkCollection.get(i).sendKeys(clickOnLink);

        }
    }

}
