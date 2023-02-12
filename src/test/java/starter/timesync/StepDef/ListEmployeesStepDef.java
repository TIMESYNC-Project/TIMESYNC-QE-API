package starter.timesync.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.timesync.TimesyncAPIAdmin;
import starter.timesync.Utils.Constant;

import java.io.File;

public class ListEmployeesStepDef {

    @Steps
    TimesyncAPIAdmin timesyncAPIAdmin;

    @Given("GET list all employees by admin")
    public void getListEmployees() {
        SerenityRest.given();
        timesyncAPIAdmin.getListEmployees();
    }

    @When("Send request get list employees")
    public void sendRequestGetListEmployees() {
        SerenityRest.when().get(TimesyncAPIAdmin.GET_LIST_EMPLOYEES);
    }


    @And("Validate json schema all list employees")
    public void validateJsonSchemaListEmployees(){
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/ListEmployeesSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    //Scenario 2
    @Given("GET employee with valid id {int}")
    public void getSingleUserWithId(int id){
        timesyncAPIAdmin.getEmployeeId(id);
    }

    @When("Send request get single user")
    public void sendRequestGetSingleUser(){
        SerenityRest.when().get(TimesyncAPIAdmin.GET_SINGLE_EMPLOYEES);
    }

    @And("Validate json schema single employee")
    public void validateJsonSchemaSingleEmployee(){
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/SingleEmployeeSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

}