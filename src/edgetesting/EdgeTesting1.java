package edgetesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTesting1 {
    public static void main(String[] args) {
        EdgeTesting1 e = new EdgeTesting1();
        e.m1();
    }

    public void m1(){
        String baseURL = "https://demo.nopcommerce.com/";//storing base url
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");//setting edge webdriver
        WebDriver driver = new EdgeDriver();//creating object of edge webdriver
        driver.get(baseURL);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
    }
}
