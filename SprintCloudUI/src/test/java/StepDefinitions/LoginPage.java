package StepDefinitions;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;


    @Given("Login to SauceDemo URL {string}")
    public void login_saucedemo(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    @And("Enter user details {string} and {string}")
    public void input_user_details(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        }

    @When("Click on Login button")
    public void click_on_login_button(){
        driver.findElement(By.id("login-button")).click();
    }
    @Then("Navigate to Shopping Page")
    public void shopping_page(){
        driver.findElement(By.xpath("//div[@id='inventory_container']")).isDisplayed();


    }

    public String LoginFail(){
        WebElement ErrorMsg = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]"));
        driver.findElement(By.xpath("//div[@class='error-message-container error']")).isDisplayed();
        return ErrorMsg.getText();
        }
}
