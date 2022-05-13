package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }@Test
    public void openWebsit(){
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@value='F']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Preety7");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Shah");
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("9");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("10");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("2020");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("preety7@yahoo.com");
        driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='Email']")).submit();
        driver.findElement(By.xpath("//div[@class='result']")).getText();
    }@After
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
    driver.close();
}}