package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        ChromeBrowserTesting c = new ChromeBrowserTesting();
        c.test();
    }

    public void test(){
        String baseURL = "https://demo.nopcommerce.com/";//storing base url
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");//setting web driver
        WebDriver driver = new ChromeDriver();// creating object of chrome driver
        driver.get(baseURL);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
