package starter.timesync.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.checkerframework.checker.units.qual.Time;
import starter.timesync.TimesyncAPI;
import starter.timesync.Utils.Constant;

import java.io.File;

public class GetAttendancesStepDef {
    @Steps
    TimesyncAPI timesyncAPI;

    @Given("Get attendances employee with valid token")
    public void getAttendancesEmployeeWithValidToken() {
        timesyncAPI.setGetAttendancesEmployee();
    }

    @Given("Get attendances employee with valid token date from {string} and date to {string}")
    public void getAttendancesEmployeeWithParam(String date_from, String date_to) {
        timesyncAPI.setGetAttendancesWithParam(date_from, date_to);
    }

    @When("Send request get attendances with token employee")
    public void sendRequestGetAttendancesEmployee() {
        SerenityRest.when().get(TimesyncAPI.GET_ATTENDANCES_EMPLOYEE_2);
    }

    @When("Send request get attendances with param employee")
    public void sendRequestGetAttendancesEmployee2() {
        SerenityRest.when().get(TimesyncAPI.GET_ATTENDANCES_EMPLOYEE);
    }

    @And("Validate JSON schema get attendances")
    public void validateJSONSchemaGetAttendances() {
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/GetAttendancesSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
