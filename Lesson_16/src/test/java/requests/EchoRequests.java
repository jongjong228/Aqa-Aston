package requests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import keys.ConfKeys;
import org.apache.http.HttpStatus;
import utils.ConfigUtils;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoRequests {

    public EchoRequests() {
        RestAssured.baseURI = ConfigUtils.getConfProperty(ConfKeys.BASE_URI);
        RestAssured.port = Integer.parseInt(ConfigUtils.getConfProperty(ConfKeys.PORT));;
    }

    public void getMethod(String param1, String param2) {
        given().queryParam("foo1", param1).queryParam("foo2", param2)
                .when().get("/get")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK).and()
                .body("args.foo1", equalTo(param1)).and()
                .body("args.foo2", equalTo(param2));
    }

    public void postRawMethod(String text) {
        given()
                .contentType(ContentType.TEXT).body(text)
                .when().post("/post")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK).and()
                .body("data", equalTo(text));
    }

    public void postFormDateMethod(String param1, String param2) {
        given()
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", param1)
                .formParam("foo2", param2)
                .when().post("/post")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK).and()
                .body("form.foo1", equalTo(param1)).and()
                .body("form.foo2", equalTo(param2));
    }

    public void putMethod(String text) {
        given()
                .contentType(ContentType.TEXT).body(text)
                .when().put("/put")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK).and()
                .body("data", equalTo(text));
    }

    public void patchMethod(String text) {
        given()
                .contentType(ContentType.TEXT).body(text)
                .when().patch("/patch")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK).and()
                .body("data", equalTo(text));
    }

    public void deleteMethod(String text) {
        given()
                .contentType(ContentType.TEXT).body(text)
                .when().delete("/delete")
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK).and()
                .body("data", equalTo(text));
    }
}
