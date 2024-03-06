package org.fugerit.java.service;

import io.quarkus.test.junit.QuarkusTest;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class LivenessCheckTest {

    @Test
    void testLiveness() {
        given()
          .when().get("/q/health")
          .then()
             .statusCode(200)
             .body( StringContains.containsString("\"status\": \"UP\""));
    }

}