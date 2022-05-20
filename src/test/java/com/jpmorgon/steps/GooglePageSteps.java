package com.jpmorgon.steps;

import com.jpmorgon.pages.GooglePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GooglePageSteps {
    GooglePage page = new GooglePage();

    @Given("user is on Google search page")
    public void userIsOnGoogleSearchPage() {
        page.open();
    }

    @When("the search phrase {string} is entered")
    public void theSearchPhrase(String string) {
        page.search(string);
    }

    @When("click the first result returned by google")
    public void clickTheFirstResult() {
        page.selectFirstResult();
    }

}
