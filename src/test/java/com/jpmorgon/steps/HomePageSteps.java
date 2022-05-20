package com.jpmorgon.steps;

import com.jpmorgon.pages.HomePage;
import io.cucumber.java.en.Then;

public class HomePageSteps {

    HomePage home = new HomePage();

    @Then("verify the J.P.Morgon logo is shown")
    public void verifyTheJPMorgonLogo() {
        home.validateLogo();
    }
}
