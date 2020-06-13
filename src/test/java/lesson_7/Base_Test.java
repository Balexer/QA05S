package lesson_7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_Test {

    private String driverPath = "C:\\Users\\user\\Desktop\\dz\\TestSelenium\\src\\drivers\\chromedriver.exe";
    public ChromeDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
