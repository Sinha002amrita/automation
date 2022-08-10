package Testing;

import org.openqa.selenium.By;
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
     /*  while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("Dec"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }
*/

        while (!driver.findElement(By.xpath("//div/div[3]/table/thead/tr/th[3]")).getText().contains("2023"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).click();
            driver.findElement(By.cssSelector("[class='datepicker-months'] th[class='next']")).click();
        }

            List<WebElement> allmonths = driver.findElements(By.className("month"));
      //  System.out.println(driver.findElement(By.className("month")).getText());
            for (int i = 0; i < allmonths.size(); i++)
            {
                System.out.println(allmonths.get(i).getText());
                String selectedMonth = allmonths.get(i).getText();
                if (selectedMonth.equalsIgnoreCase("Mar")) {
                    allmonths.get(i).click();
                    break;
                }
            }
 /*           List<WebElement> alldates = driver.findElements(By.className("day"));
            for (int i = 0; i < alldates.size(); i++) {
                String selectedDate = alldates.get(i).getText();
                if (selectedDate.equalsIgnoreCase("19")) {
                    alldates.get(i).click();
                    break;
                }
            }
*/

        }
    }

