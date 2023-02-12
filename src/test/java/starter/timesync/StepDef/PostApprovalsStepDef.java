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

public class PostApprovalsStepDef {
    @Steps
    TimesyncAPI timesyncAPI;
    @Given("Post employee with valid token and json")
    public void postEmployeeWithValidTokenAndJson() {
        File jsonPostApprovals = new File(Constant.JSON_REQUEST+"/PostApprovals.json");
        timesyncAPI.setApprovalsJsonAndToken(jsonPostApprovals);
    }

    @When("Send request post employee approvals")
    public void sendRequestPostEmployeeApprovals() {
        SerenityRest.when().post(TimesyncAPI.POST_APPROVALS_EMPLOYEE);
    }

    @And("Validate JSON schema post approvals")
    public void validateJSONSchemaPostApprovals() {
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/PostApprovalsSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));

    }
}
