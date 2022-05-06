package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFiveUrl {
    WebDriver driver;
    @Before
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("https://www.amazon.co.uk");
}@Test
    public void OpenAmazon() {
        driver.get("https://www.amazon.co.uk");
    }@Test public void OpenPoundland() {
        driver.get("https://www.poundland.co.uk/");
    }@Test
    public void OpenArgoes() {
        driver.get("https://www.argos.co.uk");
    }@Test public void OpenNext(){
        driver.get("https://www.next.co.uk");

    }@After
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
     driver.close();
}}
