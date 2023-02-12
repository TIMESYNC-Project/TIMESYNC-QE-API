package starter.timesync.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.timesync.TimesyncAPI;

public class GetSearchEmployeeStepDef {
    @Steps
    TimesyncAPI timesyncAPI;

    @Given("Get search employee with valid token")
    public void getSearchEmployeeWithValidToken() {
        timesyncAPI.setGetSearchEmployee();
    }

    @When("Send request get search")
    public void sendRequestGetSearch() {
        SerenityRest.when().get(TimesyncAPI.GET_SEARCH_EMPLOYEE);
    }
}
