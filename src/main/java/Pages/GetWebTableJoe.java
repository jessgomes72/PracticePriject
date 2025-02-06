package Pages;

import Base.PracticeBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GetWebTableJoe extends PracticeBase {

    @Test
    public void getRowGetValue() {

        chromeDriver.get("www.rahulshettyacademy.com/AutomationPractice/");
        WebElement table = chromeDriver.findElement(By.xpath
                ("(//table[@id='product'])[2]"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            if (!columns.isEmpty() && columns.get(0).getText().equals("Joe")) {
                for (WebElement column : columns) {
                    System.out.println(column.getText() + " ");

                }
                System.out.println();
                break;
            }
        }
        chromeDriver.quit();
    }

    @Test
    public void getRowGetValue1() {

        chromeDriver.get("www.rahulshettyacademy.com/AutomationPractice/");
        WebElement table = chromeDriver.findElement(By.xpath
                ("(//table[@id='product'])[2]"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));  //Row1
        for (WebElement row : rows) {
            List<WebElement> columns = row.findElements(By.tagName("td")); //Row1Cells-4
            for (WebElement colm : columns) {
                if (colm.getText().equalsIgnoreCase("Joe")) {
                    for(WebElement cell:columns){
                        System.out.println(cell.getText());
                    }
                    break;
                }

            }

        }
    }
}