package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;

public class NewFile extends ProjectSetup {

    public static void main(String[] args) throws InterruptedException {
        ProjectSetup p = new ProjectSetup();
        driver = p.openBrowser();

        driver.get("https://www.path2usa.com/travel-companions");
        Thread.sleep(3000);
        driver.findElement(By.id("travel_date")).click();

        //  select date- Dec19,2022
        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("Dec"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }

       // select date -07th Apr,2024
        driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).click();
        driver.findElement(By.cssSelector("[class='datepicker-months'] th[class='next']")).click();
        driver.findElement(By.cssSelector("[class='datepicker-months'] th[class='next']")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Apr')]")).click();

        List<WebElement> alldates = driver.findElements(By.className("day"));
        for (int i = 0; i < alldates.size(); i++)
        {
            String selectedDate = alldates.get(i).getText();
            if (selectedDate.equalsIgnoreCase("7"))
            {
                alldates.get(i).click();
                break;
            }
        }


    }
}

