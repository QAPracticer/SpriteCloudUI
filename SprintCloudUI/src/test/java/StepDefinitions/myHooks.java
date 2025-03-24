package StepDefinitions;


import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class myHooks {
WebDriver driver = new ChromeDriver();

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver");
        //WebDriverManager.chromedriver.setup();
       // WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/" + scenario.getName() + ".png"));
        }
        driver.quit();
    }
}

