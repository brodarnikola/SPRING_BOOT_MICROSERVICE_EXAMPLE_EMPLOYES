//package com.example.apigateway.selenium_automation_testing;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//public class Locator_ByID {
//
//    public static void main(String[] args) {
//
//        // System Property for Gecko Driver
//        System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );
//
//        // Initialize Gecko Driver using Desired Capabilities Class
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability("marionette",true);
//        WebDriver driver= new ChromeDriver(capabilities);
//
//
//        // Launch Website
//        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
//
//    }
//
//}