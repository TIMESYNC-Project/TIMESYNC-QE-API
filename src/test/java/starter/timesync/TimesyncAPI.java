package starter.timesync;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.timesync.Utils.Constant;

import java.io.File;

public class TimesyncAPI {
    public static String GET_PROFILE_EMPLOYEES = Constant.BASE_URL + "/employees/profile";
    public static String PUT_EMPLOYEES = Constant.BASE_URL + "/employees";
    public static String POST_APPROVALS_EMPLOYEE = Constant.BASE_URL + "/approvals";
    public static String GET_APPROVALS_EMPLOYEES = Constant.BASE_URL + "/approvals";
    public static String PUT_ATTENDANCES_EMPLOYEE = Constant.BASE_URL + "/attendances";
    public static String GET_ATTENDANCES_EMPLOYEE = Constant.BASE_URL + "/attendances";
    public static String GET_ATTENDANCES_EMPLOYEE_2 = Constant.BASE_URL + "/attendances?date_from=2023-02-09&date_to=2023-02-10";
    public static String POST_ATTENDANCES_EMPLOYEE = Constant.BASE_URL + "/attendances";
    public static String GET_ATTENDANCES_LOCATION_EMPLOYEE = Constant.BASE_URL + "/attendances/location";
    public static String GET_PRESENCES_EMPLOYEE = Constant.BASE_URL + "/presences";
    public static String GET_EMPLOYEE_INBOX = Constant.BASE_URL + "/inbox";
    public static String GET_EMPLOYEE_APPROVALS = Constant.BASE_URL + "/employee/approvals";
    public static String GET_SEARCH_EMPLOYEE = Constant.BASE_URL + "/search";
    public static String GET_RECORD_ID_EMPLOYEE = Constant.BASE_URL + "/record/9?date_from=2023-02-06&date_to=2023-02-09";

    @Step("Get profile employee")
    public void setGetProfileEmployee() {
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given().headers("Authorization",authToken);
    }
    @Step("Put employee")
    public void setPutEmployees (){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given().headers("Authorization",authToken);
    }
    @Step("Put employee invalid token")
    public void setPutEmployeesInvalidToken () {
        String token = "invalid token";
        String authToken = "Bearer " + token;
        SerenityRest.given().headers("Authorization",authToken);
    }

    @Step("Post Approvals with Token and JSON")
    public void setApprovalsJsonAndToken (File json) {
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization", authToken)
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Get Approvals with valid token")
    public void setGetApprovalsEmployees (){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given().headers("Authorization",authToken);
    }

    @Step("Put Attendances with valid token and json")
    public void setPutAttendancesEmployee(File json){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjgyfQ.i6koT9RuTRix_p2948wnXNFm69BturymDo4bsHyySlQ";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step ("Get Attendances with valid token ")
    public void setGetAttendancesEmployee(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjgyfQ.i6koT9RuTRix_p2948wnXNFm69BturymDo4bsHyySlQ";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken)
        ;
    }

    @Step ("Get Attendances with param")
    public void setGetAttendancesWithParam(String date_from, String date_to){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjgyfQ.i6koT9RuTRix_p2948wnXNFm69BturymDo4bsHyySlQ";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken)
                .queryParam("date_from", date_from)
                .queryParam("date_to", date_to);
    }

    @Step ("Post Attendances with valid token and JSON")
    public void setPostAttendancesEmployee(File json){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Get Attendances Location with valid token")
    public void setGetAttendancesLocationEmployee(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
    }
    @Step("Get Presences employee with valid token")
    public void setGetPresencesEmployee(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
    }

    @Step("Get Employee Inbox with valid token")
    public void setGetEmployeeInbox(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
    }

    @Step("Get Employee approvals with valid token")
    public void setGetEmployeeApprovals(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
    }
    @Step("Get search employee with valid token")
    public void setGetSearchEmployee(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
    }
    @Step("Get Approvals with invalid token")
    public void setGetApprovalsInvalidToken() {
        String token = "invalid token";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
    }

    @Step("Get Record Employee with valid token")
    public void setGetRecordEmployeeValid (){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
    }

    @Step("Get Record Employee with invalid token")
    public void setGetRecordEmployee (){
        String token = "invalid token";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
    }
}
