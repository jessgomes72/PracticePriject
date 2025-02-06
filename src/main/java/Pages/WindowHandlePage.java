package Pages;

import Base.PracticeBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Set;

public class WindowHandlePage extends PracticeBase{

    String primaryWindow;
    String newWindow;

    @Test
    public void goToURL(){

        chromeDriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        chromeDriver.manage().window().maximize();
        primaryWindow= chromeDriver.getWindowHandle();
        //primaryWindowID =ABC123, 123ABC
        System.out.println("Primary window: "+primaryWindow);
    }

    @Test
    public void openNewWindow(){
        WebElement newWindow = chromeDriver.findElement(By.id("openwindow"));
        newWindow.click();
    }

    @Test
    public void getWindowHandles() throws InterruptedException {

        Set<String> windowHandles= chromeDriver.getWindowHandles();
        //primaryWindowID =ABC123
        //newWindowID=XYZ345

        System.out.println("Set of Window Handles (ID): "+windowHandles);

        for(String windowHandle: windowHandles) {
            if(!primaryWindow.equals(windowHandle)){
                chromeDriver.switchTo().window(windowHandle);
                newWindow=windowHandle;
                Thread.sleep(5000);
            }
        }
        System.out.println("New Window: "+newWindow); // For checking
    }
    @Test
    public void newWindow(){
        String email= chromeDriver.findElement(By.xpath
                ("(//span[contains(text(),'info@qaclickacademy.com')])[2]")).getText();
        System.out.println(email);
        chromeDriver.close();
    }

    @Test
    public void moveToPrimaryWindow() throws InterruptedException {

        chromeDriver.switchTo().window(primaryWindow);
        Thread.sleep(3000);
    }
}

