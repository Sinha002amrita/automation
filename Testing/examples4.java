package Testing;

import org.openqa.selenium.By;

public class examples4 extends ProjectSetup {

    public static void main(String[] args) {
        ProjectSetup p = new ProjectSetup();
        driver = p.openBrowser();

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
