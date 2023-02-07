package ru.netology;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class TestPostman {
    @Test
    void shouldSendReRequestBody() {
        given()
                .baseUri("https://postman-echo.com")
                .body("one.two.1989")

                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("15.07.1989"));
    }
}
