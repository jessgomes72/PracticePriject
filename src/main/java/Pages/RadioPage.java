package Pages;

import Base.PracticeBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioPage extends PracticeBase {

    @FindBy(xpath = "//input[@value='radio2']")
    WebElement radioButton;

    public RadioPage() {
        PageFactory.initElements(chromeDriver, this);

    }


    public void clickOnRadio() {

         radioButton.click();
         System.out.println("Radio2");
    }
}