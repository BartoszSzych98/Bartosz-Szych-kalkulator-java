package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class FacebookTestingApp {
    public static final String XPATH_ACCEPT_COOKIES = "//div[contains(@class, \"_al64\")]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "//form[contains(@class, \"_9vtf\")]/div[5]/a";
    public static final String XPATH_REGISTER_WINDOW = "//div[contains(@class, \"_n3\")]";
    public static final String XPATH_AGE_DAY = "//span[contains(@class, \"_5k_4\")]/span/select[1]";
    public static final String XPATH_AGE_MONTH = "//span[contains(@class, \"_5k_4\")]/span/select[2]";
    public static final String XPATH_AGE_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";
    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT)).click();

        while (!driver.findElement(By.xpath(XPATH_REGISTER_WINDOW)).isDisplayed());

        WebElement selectBirthDay = driver.findElement(By.xpath(XPATH_AGE_DAY));
        new Select(selectBirthDay).selectByIndex(17);
        WebElement selectBirthMonth = driver.findElement(By.xpath(XPATH_AGE_MONTH));
        new Select(selectBirthMonth).selectByIndex(01);
        WebElement selectBirthYear = driver.findElement(By.xpath(XPATH_AGE_YEAR));
        new Select(selectBirthYear).selectByIndex(1998);
    }
}