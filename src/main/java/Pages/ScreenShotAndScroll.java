package Pages;

import Base.PracticeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class ScreenShotAndScroll extends PracticeBase {
    @Test
    public void tryCaptureScreenshot() throws InterruptedException {

        chromeDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        chromeDriver.get("https://www.amazon.com");
        chromeDriver.manage().window().maximize();

        WebElement updateLocation = chromeDriver.findElement(By.xpath("//div[@id='glow-ingress-block']"));
        elementToBeClickable(chromeDriver, 10, updateLocation);
        updateLocation.click();


        String str = chromeDriver.findElement(By.xpath("//h4[@id='a-popover-header-1']")).getText();
        System.out.println(str);

        WebElement shipOutsideUS = chromeDriver.findElement(By.xpath("//span[@id='GLUXCountryValue']"));
        elementToBeClickable(chromeDriver, 5, shipOutsideUS);
        shipOutsideUS.click();


        //Failed Part

        WebElement selectCountry = chromeDriver.findElement(By.xpath("//a[@id='GLUXCountryList_7']"));
        elementToBeClickable(chromeDriver, 5, selectCountry);
        selectCountry.click();


    }

    @Test

    public void scrollHeightPrac() throws InterruptedException {
        chromeDriver.get("https://www.amazon.com");
        Thread.sleep(2000);
        chromeDriver.manage().window().maximize();
        scrollHeightPrac();
        String str1 = chromeDriver.findElement(By.xpath("//a[@href='/privacyprefs?ref_=footer_iba']")).getText();
        System.out.println(str1);
        Thread.sleep(5000);

    }

    @Test
    public void scrollByNumberPrac() throws InterruptedException, IOException {
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.amazon.com");
        Thread.sleep(2000);


        scrollByNumberPrac();
        Thread.sleep(5000);

    }
}