package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class examples2 extends ProjectSetup{

        public static void main(String[] args) throws InterruptedException {
                ProjectSetup p = new ProjectSetup();
                driver = p.openBrowser();


 /*       //Infinite Scroll
        driver.findElement(By.linkText("Infinite Scroll")).click();
        //Thread.sleep(1000);
-----------------------Issue-----------------------------------------------------------------------
        JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,250)", "");
                Thread.sleep(2000);
                System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div/div/a")).getText());
                driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div/div/a")).click();
        Thread.sleep(1000);

       jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
              //  WebElement  footer= driver.findElement(By.xpath("//*[@id='page-footer']/div/div/a"));
                //while(footer.isDisplayed()){
                      //  JavascriptExecutor jse1 = (JavascriptExecutor) driver;
                       // jse1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
             //   }
       driver.findElement(By.xpath("//*[@id='page-footer']/div/div/a")).click();

-----------------------------------------------------------------------------------------------------------------------------
        //Inputs
        driver.findElement(By.linkText("Inputs")).click();
        // for increment upto 10
                for(int i = 0; i < 10; i++)
                driver.findElement(By.cssSelector("input[type='number']")).sendKeys(Keys.ARROW_UP);
                //for decrement
                driver.findElement(By.cssSelector("input[type='number']")).sendKeys(Keys.ARROW_DOWN);
*/
        //JQuery UI Menus
        driver.findElement(By.linkText("JQuery UI Menus")).click();
        WebElement h1=driver.findElement(By.id("ui-id-2"));
        Actions hover=new Actions(driver);
        hover.moveToElement(h1).build().perform();

        WebElement h2= driver.findElement(By.id("ui-id-4"));
        hover.moveToElement(h2).build().perform();

        WebElement h3=driver.findElement(By.id("ui-id-6"));
        hover.moveToElement(h3).click();

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
