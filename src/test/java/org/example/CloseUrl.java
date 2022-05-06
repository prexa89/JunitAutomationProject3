package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CloseUrl {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.operadriver().setup();
        driver=new OperaDriver();
        driver.get("https://www.poundland.co.uk/");
        Thread.sleep(5000);
        driver.close();
    }
}
