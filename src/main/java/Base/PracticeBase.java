package Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeBase {

        //Selenium works with webDriver class
        public static ChromeDriver chromeDriver = new ChromeDriver();
        public static Actions actions = new Actions(chromeDriver) {
        };
        Wait<WebDriver> wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(4));

    public void scrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }
        public static Actions getActions() {

            return actions;
        }

        // this is the super constructor of the entire project
        public PracticeBase(){
            //this is the method to navigate to a specific url
            chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        }
    public void elementToBeClickable(WebDriver driver, int waitTime, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.elementToBeClickable(element));

        }


    }




