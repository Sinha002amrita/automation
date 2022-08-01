package Testing;

import org.openqa.selenium.By;

public class examples3 extends ProjectSetup {

        public static void main(String[] args) {
                ProjectSetup p = new ProjectSetup();
                driver = p.openBrowser();

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
        }
}
