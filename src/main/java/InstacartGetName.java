import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InstacartGetName {

    static WebDriver driver;
    static String URL;

    @BeforeMethod
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver","/Users/nencydesai/Downloads/chromedriver/");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void testSomething() throws Exception{
        URL = "https://www.instacart.ca/";
        driver.navigate().to(URL);
        Thread.sleep(5000);

        WebElement brandName = driver.findElement(By.xpath("//p[normalize-space()='Wholesale Club']"));
        String text= brandName.getText();
        System.out.println(text);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown(){

        driver.close();
    }


}



