package Pages;

import Base.PracticeBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeAutomatePage extends PracticeBase {

       @FindBy(xpath = "//select[@id='dropdown-class-example']")
       WebElement dropDownSelect;

      @FindBy(xpath = "//div[@class='mouse-hover']")
      WebElement mouseHover;


        public PracticeAutomatePage() {

            PageFactory.initElements(chromeDriver, this);
        }


        public void navigateToPracticeAutomate() {

            dropDownSelect.click();



        }


}
