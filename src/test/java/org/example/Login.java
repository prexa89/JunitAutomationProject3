package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }@Test
    public void openWebsite(){
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
       // driver.findElement(By.id("Email")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.id("Email")).sendKeys("preety2@yahoo.com");
        driver.findElement(By.xpath("//input[@name='Password']"));
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        driver.findElement(By.className("ico-logout")).click();

    }@After
    public void tearDown() throws InterruptedException{
            Thread.sleep(5000);
         driver.close();


}}