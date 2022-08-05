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


        //Infinite Scroll
        driver.findElement(By.linkText("Infinite Scroll")).click();
/*        //Thread.sleep(1000);
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
*/        //Inputs
        driver.findElement(By.linkText("Inputs")).click();
        // for increment upto 10
                for(int i = 0; i < 10; i++)
                driver.findElement(By.cssSelector("input[type='number']")).sendKeys(Keys.ARROW_UP);
                //for decrement
                driver.findElement(By.cssSelector("input[type='number']")).sendKeys(Keys.ARROW_DOWN);

        //JQuery UI Menus
        driver.findElement(By.linkText("JQuery UI Menus")).click();
        WebElement h1=driver.findElement(By.id("ui-id-2"));
        Actions hover=new Actions(driver);
        hover.moveToElement(h1).click();

        WebElement h2= driver.findElement(By.id("ui-id-4"));
        hover.moveToElement(h1).click();
        hover.moveToElement(h2).perform();

        WebElement h3=driver.findElement(By.id("ui-id-6"));
        hover.moveToElement(h1).click();
        hover.moveToElement(h2).click();
        hover.moveToElement(h3).click().perform();

        //hyperlink
        driver.findElement(By.linkText("JQuery UI Menus")).click();
        driver.findElement(By.linkText("JQuery UI Menus")).click();
        driver.findElement(By.linkText("blur")).click();

        //JavaScript Alerts
        driver.findElement(By.linkText("JavaScript Alerts")).click();

        driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
                //To accept
        driver.switchTo().alert().accept();

        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
                // to accept
                driver.switchTo().alert().accept();
                //To cancel
                driver.switchTo().alert().dismiss();

        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        //to enter text
        driver.switchTo().alert().sendKeys("Hello JS");
        //To accept
                driver.switchTo().alert().accept();
                //To cancel
                driver.switchTo().alert().dismiss();

        //JavaScript onload event error
        driver.findElement(By.linkText("JavaScript onload event error")).click();
        System.out.println(driver.findElement(By.cssSelector("body[onload='loadError()']")).getText());


        //Key Presses
        driver.findElement(By.linkText("Key Presses")).click();
        driver.findElement(By.id("target")).sendKeys(Keys.TAB);
        driver.findElement(By.id("target")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.id("target")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("target")).sendKeys(Keys.SUBTRACT);

        //Large & Deep DOM
        driver.findElement(By.linkText("Large & Deep DOM")).click();
        System.out.println(driver.getCurrentUrl());

  }

}
