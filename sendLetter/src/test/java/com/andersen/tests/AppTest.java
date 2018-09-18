package com.andersen.tests;

import com.andersen.base.conf.InitDriver;

import com.andersen.base.page.Gmail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {

    InitDriver initDriver = new InitDriver();
    Gmail gmail = new Gmail();

    @BeforeClass
    public void start() {
        initDriver.startBrowser();
    }

    @AfterClass
    public void quit() {
        initDriver.closeBrowser();
    }

    @Test
    public void sendMailFromGmailTest() {
        gmail.sendMail();
    }
}
