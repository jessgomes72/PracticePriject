package Pages;

import Base.PracticeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MouseHover extends PracticeBase {

       @FindBy(xpath = "//button[@id='mousehover']")
        WebElement mouseHover;

       @FindBy(xpath = "//a[@href='#top']")
       WebElement top;

        public MouseHover() {

            PageFactory.initElements(chromeDriver, this);

        }

        public void ClickOnTop(){

            actions.moveToElement(mouseHover).build().perform();
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

            actions.moveToElement(top).perform();
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            top.click();
            chromeDriver.quit();
        }
    }
