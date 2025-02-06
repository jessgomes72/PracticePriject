package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;

public class ListNameAndPrice {
    //Selenium works with webDriver class
    public static ChromeDriver chromeDriver = new ChromeDriver();


    public ListNameAndPrice() { //constructor

        chromeDriver.get("https://www.saucedemo.com/v1/");

    }


    public void login() {

        chromeDriver.findElement(By.id("user-name")).
                sendKeys("standard_user");

        chromeDriver.findElement(By.id("password")).
                sendKeys("secret_sauce");

        chromeDriver.findElement(By.xpath("//input[@id='login-button']"))
                .click();
    }

    public void nameAndPrice(){

        HashMap<String, String> product = new HashMap<>();
        List<WebElement> item = chromeDriver.findElements
                (By.xpath("div[@class='inventory_item_name']"));

        List<WebElement> price =chromeDriver.findElements
                (By.xpath("div[@class='inventory_item_price']"));

        for (int i =0; i< item.size(); i++){
            String itemName = item.get(i).getText();
            String iemPrice = price.get(i).getText();
            product.put(itemName,iemPrice);
        }
        System.out.println(product.toString());

    }

    public static void main(String[] args) {
        ListNameAndPrice obj = new ListNameAndPrice();
        obj.login();
        obj.nameAndPrice();
    }

}





