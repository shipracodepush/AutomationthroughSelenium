package co.justhype.qa.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {

        try {

            prop = new Properties();
            FileInputStream fis = new FileInputStream("C:\\Users\\shipra.parihar\\coukjusthype\\src\\main\\java\\co\\justhype\\qa\\config\\config.properties");
            prop.load(fis);


        }catch(FileNotFoundException e){
            e.printStackTrace();


        }catch(IOException e){
            e.printStackTrace();

        }


    }

    public static void intialization(){

        String browsername = prop.getProperty("browser");
        if(browsername.equals("chrome")){

            System.setProperty("webdriver.chrome.driver","C:\\Users\\shipra.parihar\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browsername.equals("FF")){
            driver = new FirefoxDriver();
        }
        else if(browsername.equals("IE")){

            driver = new InternetExplorerDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }

}




