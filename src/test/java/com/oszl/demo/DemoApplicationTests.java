package com.oszl.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.RestAssured;
import io.restassured.response.*;
import org.testng.Assert;


@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetStatus() {
		Response res = RestAssured.get("http://localhost:8080/api/employees/2");
		int code = res.getStatusCode();
		System.out.println("status code = " + code);
		Assert.assertEquals(code, 200);
	}

}
