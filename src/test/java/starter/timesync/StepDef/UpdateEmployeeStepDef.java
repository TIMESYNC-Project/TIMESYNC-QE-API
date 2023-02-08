package starter.timesync.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.timesync.TimesyncAPI;
import starter.timesync.Utils.Constant;
import starter.timesync.Utils.TimesyncResponse;

import java.io.File;
import static org.junit.Assert.assertEquals;

public class UpdateEmployeeStepDef {

    @Steps
    TimesyncAPI timesyncAPI;

    @Given("PUT update employee with data image, id {int}, name {string}, birth_of_date {string}, email {string}, " +
            "gender {string}, position {string}, phone {string}, address {string}, password {string}")
    public void updateEmployeeWithId(int id, String name, String birth_of_date, String email, String gender,
                                              String position, String phone, String address, String password){
        File image = new File(Constant.IMAGE_REQUEST+"/momonosuke.jpg");
        timesyncAPI.setPutUpdateEmployeeForm(id, name, birth_of_date , email, gender, position, phone,
                address, password, image);
    }

    @When("Send request PUT update employee")
    public void sendRequestUpdateUser(){
        SerenityRest.when().put(TimesyncAPI.PUT_UPDATE_EMPLOYEE);
    }

    @And("Response body message put should be status: \"update profile success\"")
    public void responseBodyMessage() {
        String expectedMessage = "update profile success";
        String actualMessage = SerenityRest.then().extract().path(TimesyncResponse.MESSAGE);
        assertEquals(expectedMessage, actualMessage);
    }

    //Scenario 2
    @Given("PUT update employee without token data image, id {int}, name {string}, birth_of_date {string}, email {string}, " +
            "gender {string}, position {string}, phone {string}, address {string}, password {string}")
    public void udateEmployeeWoToken(int id, String name, String birth_of_date, String email, String gender,
                                     String position, String phone, String address, String password){
        File image = new File(Constant.IMAGE_REQUEST+"/momonosuke.jpg");
        timesyncAPI.setPutUpdateWoToken(id, name, birth_of_date , email, gender, position, phone,
                address, password, image);
    }

    @And("Response body message put should be status: \"missing or malformed jwt\"")
    public void responseBodyMessageErr() {
        String expectedMessage = "missing or malformed jwt";
        String actualMessage = SerenityRest.then().extract().path(TimesyncResponse.MESSAGE);
        assertEquals(expectedMessage, actualMessage);
    }
}
