package com.andersen.base.page;

import com.andersen.base.frame.Element;
import org.openqa.selenium.By;

public class Gmail extends Element {

    By emailField = By.xpath("//*[@id=\"identifierId\"]");
    By buttonNext = By.xpath("//*[@id=\"identifierNext\"]/content/span");
    By userPass = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    By buttonLogin = By.xpath("//*[@id=\"passwordNext\"]/content/span");
    By buttonWrite = By.cssSelector("#\\3a ju > div > div");
    By sendTo = By.name("to");
    By subject = By.className("aoT");
    By message = By.className("editable");
    By buttonSend = By.className("aoO");
    By sendSuccess = By.className("aT");

    public void sendMail() {
        navigateTo("http://gmail.com");
        type(emailField, "serjchernyak94@gmail.com");
        click(buttonNext);
        type(userPass, "*********");
        click(buttonLogin);
        click(buttonWrite);
        type(sendTo, "qa.gradilenko@gmail.com");
        type(subject, "Hometask 1");
        type(message, "Hello Vova! Its Chernyak's homework!");
        click(buttonSend);
        click(sendSuccess);
    }
}

