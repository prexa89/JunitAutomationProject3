package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
        WebDriver driver;
        @Before
        public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }@Test
            public void openWebsite(){
       // WebDriver driver = null;
       driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    driver.findElement(By.className("ico-register")).click();
        System.out.println("Register button clicked");

        driver.findElement(By.id("FirstName")).sendKeys("Preety");
       driver.findElement(By.id("LastName")).sendKeys("shah");
        driver.findElement(By.id("Email")).sendKeys("preety2@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
       driver.findElement((By.id("register-button"))).submit();
      // driver.findElement(By.linkText("Your Registration Completed"));
        System.out.println("Registration completed");
    }@After
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();

}}

