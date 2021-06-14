package steps;

import cucumber.api.java8.En;
import pages.Page;

public class StepDefs extends Page implements En  {

    public StepDefs() {
        Given("I go to url (.*)$", (final String url) ->  getUrl(url));

        When("^I click in signIn tab$", () -> {click_sign_in();

        });

        When("^I enter userName (.*)$", (final String email) -> {enter_userName(email);

        });

        When("^I enter password (.*)$", (final String pwd) -> {enter_password(pwd);

        });

        When("^I click on SignIn button$", () -> {click_signInBtn();

        });

        Then("^I verify Your account is displayed$", () -> {verify_yourAcnt();

        });

    }

}
