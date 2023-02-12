package starter.timesync.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.timesync.TimesyncAPI;

public class PutEmployeeStepDef {
    @Steps
    TimesyncAPI timesyncAPI;

    @Given("Put employee with valid token")
    public void putEmployeeWithValidToken() {
        timesyncAPI.setPutEmployees();
    }

    @When("Send request put employee")
    public void sendRequestPutEmployee() {
        SerenityRest.when().put(TimesyncAPI.PUT_EMPLOYEES);
    }


    @Given("Put employee with invalid token")
    public void putEmployeeWithInvalidToken() {
        timesyncAPI.setPutEmployeesInvalidToken();
    }
}
