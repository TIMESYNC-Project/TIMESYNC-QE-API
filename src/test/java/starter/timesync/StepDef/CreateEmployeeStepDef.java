package starter.timesync.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.timesync.TimesyncAPI;
import starter.timesync.Utils.Constant;
import starter.timesync.Utils.TimesyncResponse;
import java.io.File;
import static org.junit.Assert.assertEquals;

public class CreateEmployeeStepDef {

    @Steps
    TimesyncAPI timesyncAPI;

    @Given("Admin create employee with valid json")
    public void createEmployeeValidJson(){
        File json = new File(Constant.JSON_REQUEST+"/RegisterEmployee.json");
        timesyncAPI.postCreateEmployees(json);
    }

    @When("Send request post create employee")
    public void sendRequestRegisterEmployee(){
        SerenityRest.when().post(TimesyncAPI.POST_CREATE_EMPLOYEE);
    }

    @And("Response body message should be email: \"email already registered\"")
    public void responseBodyMessage(){
        String expectedMessage = "email already registered";
        String actualMessage = SerenityRest.then().extract().path(TimesyncResponse.MESSAGE);
        assertEquals(expectedMessage, actualMessage);
    }

    @And("Response body message success should be email: \"success create account\"")
    public void responseBodyMessage2(){
        String expectedMessage = "success create account";
        String actualMessage = SerenityRest.then().extract().path(TimesyncResponse.MESSAGE);
        assertEquals(expectedMessage, actualMessage);
    }

    @Then("Validate json schema create new employee")
    public void validateJsonSchemaRegisterEmployee(){
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/RegisterEmployeeSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    //Scenario CSV
    @Given("Admin create employees with file csv")
    public void createEmployeesByCsv(){
        File csv = new File(Constant.CSV_REQUEST+"/TimeSyncNewUser.csv");
        timesyncAPI.postCreateEmployeesCsv(csv);
    }

    @When("Send request create employee by csv")
    public void sendRequestRegisterEmployeeCsv(){
        SerenityRest.when().post(TimesyncAPI.CREATE_EMPLOYEES_CSV);
    }

    @And("Response body message put should be status: \"success create account from csv\"")
    public void responseBodyMessageCsv() {
        String expectedMessage = "success create account from csv";
        String actualMessage = SerenityRest.then().extract().path(TimesyncResponse.MESSAGE);
        assertEquals(expectedMessage, actualMessage);
    }
}
