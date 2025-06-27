import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;

public class Test_automatizadoApis {

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api";
    }

    @Test
    public void loginTest() {

        String response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .header("x-api-key","reqres-free-v1")
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                .post("https://reqres.in/api/login")
                .then()
                .statusCode(200)
                .extract()
                .asString();
        System.out.println("Response: " + response);
    }

    @Test
    public void loginTest2() {
        RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON)
                .header("x-api-key","reqres-free-v1")
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                .post("/login")
                .then()
                .log().all()
                .statusCode(200)
                .body("token", notNullValue());
    }

    @Test
    public void getSingleUser() {
        RestAssured
                .given()
                .log().all()
                .contentType(ContentType.JSON)
                .header("x-api-key","reqres-free-v1")
                .get("users/2")
                .then()
                .log().all()
                .statusCode(200)
                .body("data.email", equalTo("janet.weaver@reqres.in"));
    }

    @Test
    public void listUser() {
        RestAssured
                .given()
                .log().all()
                .param("page", 2)
                .header("x-api-key","reqres-free-v1")
                .get("users")
                .then()
                .log().all()
                .statusCode(200)
                .body("total_pages", equalTo(2))
                .and()
                .body("data.id", hasItems(7,8,9,10,11,12));
    }
}
