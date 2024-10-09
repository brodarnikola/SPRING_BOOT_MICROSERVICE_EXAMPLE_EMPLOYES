package com.example.apigateway.selenium_automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FindElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();

       driver.manage().timeouts().implicitlyWait( 5L, TimeUnit.SECONDS);

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement passwordBox = driver.findElement(By.name("my-password"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        passwordBox.sendKeys("Awesome password");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        driver.quit();
    }
}