package com.acme.ecommerce.warehouse.contracts;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class BaseContractTest {

}
