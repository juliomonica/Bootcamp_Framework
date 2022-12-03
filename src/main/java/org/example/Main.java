package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jym0222/Desktop/Apps/Bootcamp/bootCamp/chromedriver");
        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "/Users/jym0222/Desktop/Apps/Bootcamp/bootCamp/chromedriver");
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.github.com");
        String browserTitle = driver.getTitle();
        System.out.println(browserTitle);
        String browserUrl = driver.getCurrentUrl();
        System.out.println(browserUrl);
        driver.findElement(By.name("q")).sendKeys("userNameOne");
        driver.findElement(By.xpath("(//input[@placeholder='Username])[2]")).sendKeys("newUsername");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div[1]/div/div/form/label/input[1]")).clear();
        //driver.findElement(By.name("q")).submit();
        //xpath structure
        //objectType[@attribute='value']
        //input[@placeholder='Username']
        //CeeSelector structure
        //    objectType[attribute='value']
        driver.findElement(By.cssSelector("(input[placeholder='Username]")).sendKeys("newUsername");
        driver.findElement(By.name("q")).click();

        driver.navigate().back();
        driver.get("https://www.google.com");
        sleep(5000);
        //driver.close();
        driver.quit();
    }
}