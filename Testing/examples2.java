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


  }

}
