package com.humbertomattos.quarkus.test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class PersonsEndpointTest {

	@Test
	public void getPersons() {
		given().when().get("/api/persons").then().statusCode(200);
	}

	@Test
	public void addPerson() {
		given().when().contentType(ContentType.JSON)
				.body("{\"actived\":false,\"email\":\"NAME1@gmail.com\",\"name\":\"NAME1\"}").post("/api/persons")
				.then().statusCode(200)
				.body(is("{\"actived\":false,\"email\":\"NAME1@gmail.com\",\"id\":1,\"name\":\"NAME1\"}"));
	}

}