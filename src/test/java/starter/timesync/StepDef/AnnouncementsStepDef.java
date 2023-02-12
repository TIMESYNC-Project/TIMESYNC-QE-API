package starter.timesync.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.timesync.TimesyncAPI;
import starter.timesync.Utils.Constant;
import starter.timesync.Utils.TimesyncResponse;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class AnnouncementsStepDef {

    @Steps
    TimesyncAPI timesyncAPI;

    //Scenario 1 GET
    @Given("GET list announcements by admin")
    public void getListAnnouncements() {
        SerenityRest.given();
        timesyncAPI.getListAnnouncements();
    }

    @When("Send request get list announcements")
    public void sendRequestGetListAnnounce() {
        SerenityRest.when().get(TimesyncAPI.GET_LIST_ANNOUNCEMENTS);
    }

    @And("Validate json schema all list announcements")
    public void validateJsonSchemaListAnnounce(){
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/ListAnnounceSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    //Scenario Post
    @Given("Post admin create announcements for employee")
    public void createAnnounceValidJson(){
        File json = new File(Constant.JSON_REQUEST+"/CreateAnnounce.json");
        timesyncAPI.postCreateAnnounce(json);
    }

    @When("Send request create announcements from employee")
    public void sendRequestCreateAnnounce(){
        SerenityRest.when().post(TimesyncAPI.POST_ANNOUNCEMENTS);
    }

    @And("Validate json schema create announce from employee")
    public void validateJsonSchemaCreateAnnounce(){
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/CreateAnnounceSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("GET Announcements by id {int}")
    public void getAnnounceById(int id){
        SerenityRest.given();
        timesyncAPI.getAnnouncementsById(id);
    }


    @When("Send request get announcements by id")
    public void sendRequestGeAnnounceById() {
        SerenityRest.when().get(TimesyncAPI.GET_ANNOUNCEMENTS_ID);
    }

    @And("Response body message get should be status: \"success get announcement details\"")
    public void responseBodyMessageGetAnnounceById() {
        String expectedMessage = "success get announcement details";
        String actualMessage = SerenityRest.then().extract().path(TimesyncResponse.MESSAGE);
        assertEquals(expectedMessage, actualMessage);
    }

    @And("Validate json schema announcements by id")
    public void validateJsonSchemaSingleAnnounce(){
        File jsonSchema = new File(Constant.JSON_SCHEMA+"/SingleAnnounceSchema.json");
        SerenityRest.then()
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
