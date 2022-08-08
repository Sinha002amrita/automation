package Testing;

import org.openqa.selenium.By;

public class examples4 extends ProjectSetup {

    public static void main(String[] args) {
        ProjectSetup p = new ProjectSetup();
        driver = p.openBrowser();

        //Shifting Content
        driver.findElement(By.linkText("Shifting Content")).click();

        //menu element
        driver.findElement(By.linkText("Example 1: Menu Element")).click();
        System.out.println(driver.findElement(By.xpath("//body/div[2]/div/div/p[2]//a")).getText());
        driver.findElement(By.xpath("//body/div[2]/div/div/p[2]//a")).click();
        driver.findElement(By.xpath("//body/div[2]/div/div/p[3]//a")).click();
        driver.findElement(By.xpath("//body/div[2]/div/div/p[4]//a")).click();

        //Image
        driver.findElement(By.linkText("Example 2: An image")).click();
        driver.findElement(By.xpath("//body/div[2]/div/div/p[2]//a")).click();
        driver.findElement(By.xpath("//body/div[2]/div/div/p[3]//a")).click();
        driver.findElement(By.xpath("//body/div[2]/div/div/p[4]//a")).click();
        driver.findElement(By.xpath("//body/div[2]/div/div/p[5]//a")).click();

        //By appending text in url
        String Url= driver.getCurrentUrl();
        String newUrl= Url + "?image_type=simple";
        driver.get(newUrl);

        //Slow Resources
        driver.findElement(By.linkText("Slow Resources")).click();

        //Sortable Data Tables
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        System.out.println(driver.findElement(By.id("table1")).getText());
        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]/a[1]")).getText());
        driver.findElement(By.xpath("//table/tbody/tr[3]/td[6]/a[1]")).click();

        //2nd table with class signified
        System.out.println(driver.findElement(By.id("table2")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tbody//tr[2]")).getText());
        System.out.println(driver.findElement(By.className("dues")).getText());

        //Status Codes- Duplicate of Redirect link)
        driver.findElement(By.linkText("Status Codes")).click();

        //Typos
        driver.findElement(By.linkText("Typos")).click();
        //WYSIWYG Editor
        driver.findElement(By.linkText("WYSIWYG Editor")).click();

    }
}
