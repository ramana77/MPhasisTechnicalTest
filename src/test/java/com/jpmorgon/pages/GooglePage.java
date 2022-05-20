package com.jpmorgon.pages;

import com.jpmorgon.utils.BasePage;
import com.jpmorgon.utils.ConfigProvider;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePage {

    @FindBy(name = "q")
    private WebElement search;

    @FindBy(css = "#L2AGLb div")
    private WebElement agree;

    @FindBy(tagName = "a")
    private WebElement firstResult;

    @FindBy(xpath = "//a[@href='https://www.jpmorgan.com/']")
    private WebElement result;

    public GooglePage() {
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(new ConfigProvider().getUrl());
        agree.click();

    }

    public void search(String value) {
        search.sendKeys(value, Keys.ENTER);
    }

    public void selectFirstResult() {
        result.click();
    }
}
