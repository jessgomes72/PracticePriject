package Pages;

import Base.PracticeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GetSeventhRowValueFromWebTable extends PracticeBase {

    @Test
    public void getRowGetValue(){

        chromeDriver.get("www.rahulshettyacademy.com/AutomationPractice/");
        WebElement table = chromeDriver.findElement(By.xpath
                        ("(//table[@id='product'])[2])"));
        WebElement row7 = table.findElements(By.tagName("tr")).get(6);

        List<WebElement> cellValue = row7.findElements(By.tagName("td"));

for(WebElement cell:cellValue){
    System.out.println(cell.getText());
}

    }
}
