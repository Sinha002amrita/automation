package Testing;

import org.openqa.selenium.By;

public class examples2 extends ProjectSetup{

        public static void main(String[] args) {
                ProjectSetup p = new ProjectSetup();
                driver = p.openBrowser();

        //Infinite Scroll
        driver.findElement(By.linkText("Infinite Scroll")).click();
        //Inputs
        driver.findElement(By.linkText("Inputs")).click();
        //JQuery UI Menus
        driver.findElement(By.linkText("JQuery UI Menus")).click();
        //JavaScript Alerts
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        //JavaScript onload event error
        driver.findElement(By.linkText("JavaScript onload event error")).click();
        //Key Presses
        driver.findElement(By.linkText("Key Presses")).click();
        //Large & Deep DOM
        driver.findElement(By.linkText("Large & Deep DOM")).click();
        //Multiple Windows
        driver.findElement(By.linkText("Multiple Windows")).click();
        //Nested Frames
        driver.findElement(By.linkText("Nested Frames")).click();
        //Notification Messages
        driver.findElement(By.linkText("Notification Messages")).click();
        //Redirect Link
        driver.findElement(By.linkText("Redirect Link")).click();
        //Secure File Download
        driver.findElement(By.linkText("Secure File Download")).click();
        //Shadow DOM
        driver.findElement(By.linkText("Shadow DOM")).click();
        //Shifting Content
        driver.findElement(By.linkText("Shifting Content")).click();
        //Slow Resources
        driver.findElement(By.linkText("Slow Resources")).click();
        //Sortable Data Tables
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        //Status Codes
        driver.findElement(By.linkText("Status Codes")).click();
        //Typos
        driver.findElement(By.linkText("Typos")).click();
        //WYSIWYG Editor
        driver.findElement(By.linkText("WYSIWYG Editor")).click();

  }

}
