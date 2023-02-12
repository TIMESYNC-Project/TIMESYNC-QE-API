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

public class GetPresencesMyStepdef {
    @Steps
    TimesyncAPI timesyncAPI;
    @Given("Get presences employee with valid token")
    public void getPresencesEmployeeWithValidToken() {
        timesyncAPI.setGetPresencesEmployee();
    }

    @When("Send request get presences employee")
    public void sendRequestGetPresencesEmployee() {
        SerenityRest.when().get(TimesyncAPI.GET_PRESENCES_EMPLOYEE);
    }


    @And("Validate JSON schema get presences")
    public void validateJSONSchemaGetPresences() {
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/GetPresencesEmployeeSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
