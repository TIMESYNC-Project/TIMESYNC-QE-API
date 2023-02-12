package starter.timesync.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.timesync.TimesyncAPI;
import starter.timesync.Utils.Constant;

import java.io.File;

public class PutAttendanceStepDef {
    @Steps
    TimesyncAPI timesyncAPI;
    @Given("Put attendances with valid token and json")
    public void putAttendancesWithValidTokenAndJson() {
        File jsonPutAttendances = new File(Constant.JSON_REQUEST+"/PutAttendances.json");
        timesyncAPI.setPutAttendancesEmployee(jsonPutAttendances);
    }

    @When("Send request put attendances")
    public void sendRequestPutAttendances() {
        SerenityRest.when().put(TimesyncAPI.PUT_ATTENDANCES_EMPLOYEE);
    }
}
