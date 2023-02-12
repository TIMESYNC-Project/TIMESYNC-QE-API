package starter.timesync.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.timesync.TimesyncAPI;
import starter.timesync.Utils.Constant;

import java.io.File;

public class GetRecordMyStepdef {
    @Steps
    TimesyncAPI timesyncAPI;

    @Given("Get Record with invalid token")
    public void getRecordWithValidToken() {
        timesyncAPI.setGetRecordEmployee();
    }

    @When("Send request get record")
    public void sendRequestGetRecord() {
        SerenityRest.when().get(TimesyncAPI.GET_RECORD_ID_EMPLOYEE);
    }

    @And("Validate JSON schema get record")
    public void validateJSONSchemaGetRecord() {
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/GetRecordEmployeeSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Get Record with valid token employee")
    public void getRecordWithValidTokenEmployee() {
        timesyncAPI.setGetRecordEmployeeValid();
    }
}
