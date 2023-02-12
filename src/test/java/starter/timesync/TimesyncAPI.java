package starter.timesync;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.timesync.Utils.Constant;

import java.io.File;

public class TimesyncAPI {

    public static String POST_LOGIN_ADMIN = Constant.BASE_URL + "/login";
    public static String POST_CREATE_EMPLOYEE = Constant.BASE_URL + "/register";
    public static String CREATE_EMPLOYEES_CSV = Constant.BASE_URL + "/register/csv";
    public static String POST_ANNOUNCEMENTS = Constant.BASE_URL + "/announcements";
    public static String PUT_UPDATE_EMPLOYEE = Constant.BASE_URL + "/employees/{id}";
    public static String GET_LIST_ANNOUNCEMENTS = Constant.BASE_URL + "/announcements";
    public static String GET_ANNOUNCEMENTS_ID = Constant.BASE_URL + "/announcements/{id}";
    public static String GET_LIST_EMPLOYEES = Constant.BASE_URL + "/employees";
    public static String GET_SINGLE_EMPLOYEES = Constant.BASE_URL + "/employees/{id}";
    public static String GET_PUT_COMPANY_PROFILES = Constant.BASE_URL + "/companies";
    public static String GET_PUT_SETTING = Constant.BASE_URL + "/setting";
    public static String GET_LIST_APPROVALS_EMPLOYEES = Constant.BASE_URL + "/approvals";
    public static String GET_PUT_APPROVALS_EMPLOYEES = Constant.BASE_URL + "/approvals/{id}";



    @Step("Post login admin")
    public void postLoginAdmin(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Get list users")
    public void getListEmployees(){
        SerenityRest.given();
    }@Step("Get list users")
    public void getApproveEmployeesWoToken(){
        SerenityRest.given();
    }

    @Step("Get list announcements")
    public void getListAnnouncements(){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU");
    }

    @Step("Get list announcements")
    public void getAnnouncementsById(int id){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .log().all();
    }

    @Step("Get single employee")
    public void getEmployeeId(int id){
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get company profiles")
    public void getCompanyProfiles(){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .log().all();
    }

    @Step("Get setting employee")
    public void getSettingEmployees(){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .log().all();
    }

    @Step("Get approvals employee")
    public  void getApprovalsEmployees(){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU").log().all();
    }
    @Step("Get approvals employee")
    public  void getApprovalsEmployeesWithId(int id){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .log().all();
    }

    @Step("Post create employees")
    public void postCreateEmployees(File json){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Post create employees by csv")
    public void postCreateEmployeesCsv(File register){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .multiPart("file", register).log().all();
    }

    @Step("Post create announcements")
    public void postCreateAnnounce(File json){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .contentType(ContentType.JSON)
                .body(json).log().all();
    }

    @Step("Put update employees")
    public void setPutUpdateEmployeeForm(int id, String name, String birth_of_date, String email,
                                         String gender, String position, String phone,
                                         String address, String password, File image){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .multiPart("profile_picture",image)
                .multiPart("name",name)
                .multiPart("birth_of_date",birth_of_date)
                .multiPart("email",email)
                .multiPart("gender",gender)
                .multiPart("position",position)
                .multiPart("phone",phone)
                .multiPart("address",address)
                .multiPart("password",password)
                .log().all();
    }

    @Step("Put update employees")
    public void setPutUpdateWoToken(int id, String name, String birth_of_date, String email,
                                         String gender, String position, String phone,
                                         String address, String password, File image) {
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .multiPart("file",image)
                .multiPart("name",name)
                .multiPart("birth_of_date",birth_of_date)
                .multiPart("email",email)
                .multiPart("gender",gender)
                .multiPart("position",position)
                .multiPart("phone",phone)
                .multiPart("address",address)
                .multiPart("password",password)
                .log().all();
    }

    @Step("Put update company profiles")
    public void setUpdateCompanyProfiles(String company_name, String company_email, String description,
                                    String company_address, String company_phone, String sosmed, File image) {
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .multiPart("file",image)
                .multiPart("company_name",company_name)
                .multiPart("company_email",company_email)
                .multiPart("description",description)
                .multiPart("company_address",company_address)
                .multiPart("company_phone",company_phone)
                .multiPart("sosmed",sosmed);
    }

    @Step("Put update setting employee")
    public void setUpdateSettingEmployees(String working_hour_start, String working_hour_end, String tolerance,
                                         String annual_leave) {
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .multiPart("working_hour_start",working_hour_start)
                .multiPart("working_hour_end",working_hour_end)
                .multiPart("tolerance",tolerance)
                .multiPart("annual_leave",annual_leave)
                .log().all();
    }

    @Step("Put update approvals employee")
    public void setUpdaApprovalsEmployee(int id, String approval_status){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .formParam("file",approval_status)
                .log().all();
    }
}
