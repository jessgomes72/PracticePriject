package Pages;

import Base.PracticeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DynamicSelect extends PracticeBase {

    @Test
    public void dynamicSelect() throws InterruptedException {

/*
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement dropDown = chromeDriver.findElement(By.xpath("//input[@id='autocomplete']"));
        dropDown.sendKeys("uni");

        Thread.sleep(3000);

        List<WebElement> elements = chromeDriver.findElements
        (By.xpath("//li[@class='ui-menu-item']"));

        for (WebElement element : elements) {
            if (element.getText().contains("Islands")) {
                //System.out.println(element.getText());
                element.click();
                break;
            }
        }*/

         /*
         for(int i=0; i<elements.size(); i++){
             if(elements.get(i).getText().contains("Kingdom")){
                 String element = elements.get(i).getText();
                 elements.get(i).click();
                 System.out.println(element);
             }
         }
*/
        Thread.sleep(3000);
    }
        @Test
        public void dynamicSelect2() throws InterruptedException {
            chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
            chromeDriver.get("https://www.amazon.com");
            chromeDriver.manage().window().maximize();
            Thread.sleep(2000);
            //WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='twotabsearchtextbox']")));
            //searchBox.sendKeys("i");

            List<WebElement> elements = chromeDriver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
            //wait.until(ExpectedConditions.visibilityOfAllElements(elements));
            for (WebElement element : elements) {
                if (element.getText().contains("iphone 15 pro max case")) {
                    System.out.println(element.getText());
                    element.click();
                }
            }
            Thread.sleep(3000);
            System.out.println(chromeDriver.getTitle());
        }


    }

