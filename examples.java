import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class examples  {
    static WebDriver driver;

    static void test() {

    //public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\vk sinha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //driver.get("http://the-internet.herokuapp.com/");
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

  /*      driver.navigate().back();

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
        //refresh page
        driver.navigate().refresh();
        System.out.println("After refreshing/reloading page");
        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());

        driver.navigate().back();

        driver.findElement(By.linkText("Drag and Drop")).click();
        // before drag and drop
       System.out.println(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/header")).getText());

        WebElement source= driver.findElement(By.id("column-a"));
        WebElement target= driver.findElement(By.id("column-b"));

        String xto=Integer.toString(source.getLocation().x);
        String yto=Integer.toString(target.getLocation().y);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("function createEvent(typeOfEvent) {" +"var event =document.createEvent(\"CustomEvent\"); " +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n" +"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" +"getData: function (key) {\n" +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" +"\n" +"function dispatchEvent(element, event,transferData) {\n" +"if (transferData !== undefined) {\n" +"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" + event.type, event);\n" +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) {\n" +"var dragStartEvent =createEvent('dragstart');\n" +"dispatchEvent(element, dragStartEvent);\n" +"var dropEvent = createEvent('drop');\n" +"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n" +"var dragEndEvent = createEvent('dragend');\n" +"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" +"}\n" +"\n" +"var source = arguments[0];\n" +"var destination = arguments[1];\n" +"simulateHTML5DragAndDrop(source,destination);",source, target);
        Thread.sleep(1500);

        //Actions a=new Actions(driver);
       // Action dragAndDrop = a.clickAndHold(source).moveToElement(target).release(target).build();
       // dragAndDrop.perform();
        //a.dragAndDrop(driver.findElement(By.id("column-a")),driver.findElement(By.id("column-b"))).build().perform();

        //after drag and drop
        System.out.println(driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/header")).getText());
       // System.out.println(driver.findElement(By.id("column-a")).getText());

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

        driver.navigate().back();
        driver.navigate().back();


        driver.findElement(By.linkText("Dynamic Controls")).click();
        driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();
        String btn=  driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).getText();
        System.out.println(btn);

        WebDriverWait wait=new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("button[onclick='swapCheckbox()']"),"Add"));

        System.out.println(driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).getText());
        driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();

        driver.findElement(By.linkText("Dynamic Controls")).click();
        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();

//      issue in sending text in text box
        //  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");

        String btn1=  driver.findElement(By.cssSelector("button[onclick='swapInput()']")).getText();
        System.out.println(btn1);

        WebDriverWait wait=new WebDriverWait(driver,200);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("button[onclick='swapInput()']"),"Disable"));

        System.out.println(driver.findElement(By.cssSelector("button[onclick='swapInput()']")).getText());
        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();

        driver.navigate().back();

        driver.findElement(By.linkText("Entry Ad")).click();
        //driver.findElement(By.id("restart-ad")).click();

        driver.getWindowHandle();

        WebElement modal = driver.findElement(By.xpath("//p[contains(text(),'Close')]"));
        WebElement modalClose = modal.findElement(By.xpath("//p[contains(text(),'Close')]"));

        WebDriverWait t = new WebDriverWait(driver, 30);
        t.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'Close')]"))));
        t.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//p[contains(text(),'Close')]"))));

        modalClose.click();

        driver.navigate().back();

        driver.findElement(By.linkText("Exit Intent")).click();

*/

    }
}


