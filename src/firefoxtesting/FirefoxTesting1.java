package firefoxtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTesting1 {
     public static void main(String[] args) {
          FirefoxTesting1 f = new FirefoxTesting1();
          f.test();
     }

     public void test(){
          String baseURL = "https://demo.nopcommerce.com/";//storing base url
          System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");//setting web driver
          WebDriver driver = new FirefoxDriver();//CREATING OBJECT OF FIREFOX DRIVER
          driver.get(baseURL);
          driver.manage().window().maximize();
          String title = driver.getTitle();
          System.out.println(title);
          driver.close();
     }
}