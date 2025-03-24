package StepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class ShoppingPage {
    WebDriver driver;

    @And("Add two Cart")
    public void AddtwoCart() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
    }
}
