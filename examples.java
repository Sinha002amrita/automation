
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class examples {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vk sinha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/");
        System.out.println(driver.findElement(By.cssSelector(".heading")).getText());
        driver.findElement(By.linkText("A/B Testing")).click();
        System.out.println(driver.findElement(By.tagName("p")).getText());

        driver.navigate().back();
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();
        driver.findElement(By.cssSelector(".added-manually")).click();

        driver.navigate().back();
        driver.findElement(By.linkText("Basic Auth")).click();

        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().back();

        driver.findElement(By.linkText("Broken Images")).click();

        driver.navigate().back();

        driver.findElement(By.partialLinkText("Check")).click();
        // to select
        driver.findElement(By.xpath("//input[@type='checkbox'] [1]")).click();
        //to deselect
        driver.findElement(By.xpath("//input[@type='checkbox'] [2]")).click();

        driver.navigate().back();

        driver.findElement(By.linkText("Context Menu")).click();
        Actions act = new Actions(driver);
        act.contextClick(driver.findElement(By.id("hot-spot"))).perform();
        driver.switchTo().alert().accept();

        driver.navigate().back();

        driver.findElement(By.partialLinkText("Digest")).click();
        driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");

        driver.navigate().back();
        driver.navigate().back();

        driver.findElement(By.linkText("Disappearing Elements")).click();

        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
        //refesh page
        driver.navigate().refresh();
        System.out.println("After refreshing/reloading page");
        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

        driver.navigate().back();

        driver.findElement(By.linkText("Drag and Drop")).click();
        // before drag and drop
       /* System.out.println(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/header")).getText());

        WebElement source= driver.findElement(By.id("column-a"));
        WebElement target= driver.findElement(By.id("column-b"));
        Actions a=new Actions(driver);
        Action dragAndDrop = a.clickAndHold(source).moveToElement(target).release(target).build();
        dragAndDrop.perform();
        //a.dragAndDrop(driver.findElement(By.id("column-a")),driver.findElement(By.id("column-b"))).build().perform();

        //after drag and drop
        System.out.println(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/header")).getText());
       // System.out.println(driver.findElement(By.id("column-a")).getText());
*/
        driver.navigate().back();

        driver.findElement(By.linkText("Dropdown")).click();
        driver.findElement(By.cssSelector("select#dropdown")).click();
        driver.findElement(By.xpath("//option[@value='2']")).click();
        driver.findElement(By.xpath("//option[@value='1']")).click();

        driver.navigate().back();

        driver.findElement(By.linkText("Dynamic Content")).click();
        System.out.println(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).getText());
        driver.navigate().refresh();
        System.out.println(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).getText());
        driver.findElement(By.linkText("click here")).click();
        System.out.println(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).getText());
        driver.findElement(By.linkText("click here")).click();
        System.out.println(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).getText());




    }
}


