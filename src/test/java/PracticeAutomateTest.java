import Base.PracticeBase;
import Pages.*;
import org.testng.annotations.Test;

public class PracticeAutomateTest extends PracticeBase {

    PracticeAutomatePage practiceAutomatePage = new PracticeAutomatePage();
    RadioPage radioPage = new RadioPage();

    SwitchToAlertPage switchToAlertPage = new SwitchToAlertPage();
    MouseHover mouseHover = new MouseHover();
    DynamicSelect dynamicSelect = new DynamicSelect();


    public PracticeAutomateTest() {

        super();
    }

    @Test

    public void navigateToPracticePage() {

        practiceAutomatePage.navigateToPracticeAutomate();

    }


    @Test
    public void navigateToRadioPage() {

        radioPage.clickOnRadio();
    }


    @Test
    public void navigateToSwitchToAlertPage() {

        switchToAlertPage.clickOnAlert();
    }

    @Test
    public void navigateToMouseHover() {

        mouseHover.ClickOnTop();

    }



}