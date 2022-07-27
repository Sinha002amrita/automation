package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class examples1 extends ProjectSetup {


    public static void main(String[] args) throws InterruptedException {
        ProjectSetup p = new ProjectSetup();
        driver = p.openBrowser();

        //File Download
      /*  driver.findElement(By.linkText("File Download")).click();
       driver.findElement(By.linkText("Ocean.jpeg")).click();
        driver.findElement(By.linkText("upload.txt")).click();

        //File Upload
        driver.findElement(By.linkText("File Upload")).click();
       WebElement chooseFile= driver.findElement(By.id("file-upload"));
       chooseFile.sendKeys("C:\\Users\\vk sinha\\Downloads\\Ocean.jpeg");
       driver.findElement(By.id("file-submit")).click();

      //Floating Menu
       driver.findElement(By.linkText("Floating Menu")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
       System.out.println(driver.findElement(By.xpath("//div[@id='menu']")).getText());

        //Forgot Password
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.id("email")).sendKeys("jen@yopmail.com");
        driver.findElement(By.id("form_submit")).click();

        //Form Authentication
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.xpath("//i[contains(text(),'Logout')]")).click();
  */
        // with incorrect data
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tosmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        System.out.println(driver.findElement(By.id("flash")).getText());

    }
}
