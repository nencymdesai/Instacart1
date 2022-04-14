import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OptionalProgram {

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
            URL = "https://login.instacart.com/";
            driver.navigate().to(URL);
            Thread.sleep(5000);

            WebElement tbx_email = driver.findElement(By.id("id-u66dje"));
            tbx_email.click();
            tbx_email.sendKeys("nencydesai29@gmail.com");

            WebElement tbx_password = driver.findElement(By.id("id-30m58h"));
            tbx_password.click();
            tbx_password.sendKeys("butterfly2907");

            WebElement clickLogin = driver.findElement(By.xpath("//button[@class='css-1squkqu']"));
            clickLogin.click();
            Thread.sleep(2000);

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


