package starter.timesync;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.timesync.Utils.Constant;

import java.awt.*;
import java.io.File;

<<<<<<< HEAD:src/test/java/starter/timesync/TimesyncAPIAdmin.java
public class TimesyncAPIAdmin {

    public static String POST_LOGIN_ADMIN = Constant.BASE_URL + "/login";
    public static String POST_CREATE_EMPLOYEE = Constant.BASE_URL + "/register";
    public static String CREATE_EMPLOYEES_CSV = Constant.BASE_URL + "/register/csv";
    public static String POST_ANNOUNCEMENTS = Constant.BASE_URL + "/announcements";
    public static String POST_ANNOUNCEMENTS_FAIL = Constant.BASE_URL + "/pengumuman";
    public static String POST_ATTENDANCE = Constant.BASE_URL + "/attendances/{id}";
    public static String POST_WO_ATTENDANCE = Constant.BASE_URL + "/attendances";
    public static String PUT_UPDATE_EMPLOYEE = Constant.BASE_URL + "/employees/{id}";
    public static String GET_LIST_ANNOUNCEMENTS = Constant.BASE_URL + "/announcements";
    public static String GET_ANNOUNCEMENTS_ID = Constant.BASE_URL + "/announcements/{id}";
    public static String GET_LIST_EMPLOYEES = Constant.BASE_URL + "/employees";
    public static String GET_SINGLE_EMPLOYEES = Constant.BASE_URL + "/employees/{id}";
    public static String GET_PUT_COMPANY_PROFILES = Constant.BASE_URL + "/companies";
    public static String GET_PUT_SETTING = Constant.BASE_URL + "/setting";
    public static String GET_LIST_APPROVALS_EMPLOYEES = Constant.BASE_URL + "/approvals";
    public static String GET_PUT_APPROVALS_EMPLOYEES = Constant.BASE_URL + "/approvals/{id}";
    public static String GET_PRESENCES_TOTAL = Constant.BASE_URL + "/presences/total";
    public static String GET_PRESENCES_DETAIL = Constant.BASE_URL + "/presences/detail/{id}";
    public static String GET_SEARCH = Constant.BASE_URL + "/search";
    public static String GET_RECORD = Constant.BASE_URL + "/record/{id}";
    public static String GET_GRAPH = Constant.BASE_URL + "/graph";


    @Step("Post login admin")
    public void postLoginAdmin(File json){
=======
public class TimesyncAPI {
    public static String GET_PROFILE_EMPLOYEES = Constant.BASE_URL + "/employees/profile";
    public static String PUT_EMPLOYEES = Constant.BASE_URL + "/employees";
    public static String POST_APPROVALS_EMPLOYEE = Constant.BASE_URL + "/approvals";
    public static String GET_APPROVALS_EMPLOYEES = Constant.BASE_URL + "/approvals";
    public static String PUT_ATTENDANCES_EMPLOYEE = Constant.BASE_URL + "/attendances";
    public static String GET_ATTENDANCES_EMPLOYEE = Constant.BASE_URL + "/attendances?date_from={string}&date_to={string}";
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
>>>>>>> master:src/test/java/starter/timesync/TimesyncAPI.java
        SerenityRest.given()
                .headers("Authorization",authToken)
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
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
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
                .pathParam("date_from", date_from)
                .pathParam("date_to", date_to);
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

<<<<<<< HEAD:src/test/java/starter/timesync/TimesyncAPIAdmin.java
    @Step("Get list users")
    public void getListEmployees(){
        SerenityRest.given();
    }

    @Step("Get list users")
    public void getApproveEmployeesWoToken(){
        SerenityRest.given();
=======
    @Step("Get Attendances Location with valid token")
    public void setGetAttendancesLocationEmployee(){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
>>>>>>> master:src/test/java/starter/timesync/TimesyncAPI.java
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

    @Step("Get Rescord Employee with valid token")
    public void setGetRecordEmployeeValid (){
        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjh9.Tyw9fenvyLJ7FNDlonDjaMfY8-RqKCc7gzeuVf_KF2o";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
    }

<<<<<<< HEAD:src/test/java/starter/timesync/TimesyncAPIAdmin.java
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
    @Step("Get approvals employee with id")
    public  void getApprovalsEmployeesWithId(int id){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .log().all();
    }

    @Step("Get presences by admin")
    public void getPresences(){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .log().all();
    }

    @Step("Get presences by admin")
    public void getPresencesDetail(int id){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .log().all();
    }

    @Step("Get search employee")
    public void getSearchEmployee(String q){
        SerenityRest.given()
                .headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .queryParam("q",q)
                .log().all();
    }

    @Step("Get search employee without param")
    public void getSearchWoParam(){
        SerenityRest.given()
                .headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .log().all();
    }

    @Step("Get search employee unauthorized")
    public void getSearchUnauthorized(String q){
        SerenityRest.given()
                .headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjI5fQ" +
                        ".xCGvu6_8qbfnJvMKeBVTkoKLWD-4d_pvymbjnWXwT-g")
                .queryParam("q",q)
                .log().all();
    }

    @Step("Get graph timesync")
    public void setGetGraph(String type, String ym, String lim){
        SerenityRest.given()
                .headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .queryParam("type",type)
                .queryParam("year_month", ym)
                .queryParam("limit", lim)
                .log().all();
    }

    @Step("Get record employees")
    public void setGetRecordEmployees(int id, String df, String dt){
        SerenityRest.given()
                .headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .queryParam("date_from", df)
                .queryParam("date_to", dt)
                .log().all();
    }

    @Step("Get record employees invalid parameter")
    public void setGetRecordEmployeesInvalidParam(int id, String df, String dt){
        SerenityRest.given()
                .headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .queryParam("tanggal", df)
                .queryParam("tanggal", dt)
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

    @Step("Post create announcements with specifications nip")
    public void postCreateAnnounceNip(String to, String at, String ad){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .multiPart("to", to)
                .multiPart("announcement_title", at)
                .multiPart("announcement_description", ad)
                .log().all();
    }

    @Step("Post create attendance employees")
    public void setPostAttendanceEmployees(int id, String at, String ds, String de){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .formParam("attendance",at)
                .formParam("date_start",ds)
                .formParam("date_end", de)
                .log().all();
    }
    @Step("Post create attendance employees without id")
    public void setPostAttendanceWoId(String at, String ds, String de){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .formParam("attendance",at)
                .formParam("date_start",ds)
                .formParam("date_end", de)
                .log().all();
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
=======
    @Step("Get Record Employee with invalid token")
    public void setGetRecordEmployee (){
        String token = "invalid token";
        String authToken = "Bearer " + token;
        SerenityRest.given()
                .headers("Authorization",authToken);
>>>>>>> master:src/test/java/starter/timesync/TimesyncAPI.java
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
    public void setUpdateApprovalsEmployee(int id, String approval_status){
        SerenityRest.given().headers("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9" +
                        ".eyJhdXRob3JpemVkIjp0cnVlLCJ1c2VySUQiOjF9" +
                        ".-DGQDtU6oq4NIINSqqqlW1FGPfZrPcQBUTdc37CnpcU")
                .pathParam("id", id)
                .formParam("approval_status",approval_status)
                .log().all();
    }


}
