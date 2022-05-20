package com.jpmorgon.pages;

import com.jpmorgon.utils.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    @FindBy(css = "div[class='logo-desktop-only'] img[alt='J.P. Morgan logo']")
    private WebElement logo;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void validateLogo() {
        Assert.assertTrue(logo.isDisplayed());
    }
}
