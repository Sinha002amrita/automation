package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class examples1 extends ProjectSetup {


    public static void main(String[] args)  {
        ProjectSetup p = new ProjectSetup();
        driver = p.openBrowser();

        //File Download
        driver.findElement(By.linkText("File Download")).click();
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

        //Form Authentication- with correct data
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        driver.findElement(By.xpath("//i[contains(text(),'Logout')]")).click();

        // with incorrect data
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tosmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        System.out.println(driver.findElement(By.id("flash")).getText());

        // Frames - iFrame
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("iFrame")).click();
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame("mce_0_ifr");

        System.out.println(driver.findElement(By.tagName("p")).getText());

        WebDriverWait w=new WebDriverWait(driver,30);
        w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("tinymce"))));

        driver.findElement(By.id("tinymce")).sendKeys("This is just for testing purpose to check whether the text gets relected in editor or not");

        //Nested Frames
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("Nested Frames")).click();
        System.out.println(driver.findElements(By.tagName("frame")).size());
        //bottom frame
        driver.switchTo().frame("frame-bottom");
        System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());

        driver.switchTo().defaultContent();

        //top frame
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText());

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        System.out.println(driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText());

    }
}
