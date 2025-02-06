package Pages;

import Base.PracticeBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SwitchToAlertPage extends PracticeBase {

    @FindBy(xpath = "//input[@name='enter-name']")
    WebElement enterName;

    @FindBy(xpath = "//input[@onclick='displayAlert()']")
    WebElement clickOnAlert;

    public SwitchToAlertPage() {

        PageFactory.initElements(chromeDriver, this);

    }

 public void clickOnAlert() {
        enterName.click();
 enterName.sendKeys("Jess");
 chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 clickOnAlert.click();

  String text = chromeDriver.switchTo().alert().getText();
     System.out.println(text);
  chromeDriver.switchTo().alert().accept();

  //chromeDriver.switchTo().alert().dismiss();

 }
}