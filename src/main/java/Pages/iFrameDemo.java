package Pages;

import Base.PracticeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iFrameDemo extends PracticeBase {



        @Test (priority = 0)
        public void goToURL(){

            chromeDriver.manage().window().maximize();
            chromeDriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        }

        @Test(priority = 1)
        public void getIFrame() throws InterruptedException {
            WebElement iFrame = chromeDriver.findElement(By.id("courses-iframe"));

            //new Actions(driver).moveToElement(iFrame);

            scrollIntoView(iFrame);
            chromeDriver.switchTo().frame(iFrame);
            Thread.sleep(3000);

            WebElement learningPathButton = chromeDriver.findElement
                    (By.xpath("(//a[@href='learning-path'])[1]"));
            learningPathButton.click();

            Thread.sleep(5000);

            //Validation that control is inside iFrame

            chromeDriver.switchTo().parentFrame();

            chromeDriver.findElement(By.xpath
                    ("(//button[@class='btn btn-primary'])[1]")).click();

            Thread.sleep(5000);


        }


    }


