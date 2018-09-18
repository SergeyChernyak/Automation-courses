package com.andersen.base.frame;

import com.andersen.base.conf.InitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Element extends InitDriver {
    private static final long TIME_OUT = 30;
    private static final long DELAY = 1000;

    public void type(By locator, String input) {
        waitUntilVisible(locator);
        driver.findElement(locator).sendKeys(input);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void click(By locator) {
        waitUntilVisible(locator);
        driver.findElement(locator).click();
    }

    public WebElement waitUntilVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
        wait.pollingEvery(Duration.ofMillis(DELAY));
        wait.ignoring(NoSuchElementException.class);
        wait.ignoring(StaleElementReferenceException.class);
        wait.ignoring(InterruptedException.class);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
