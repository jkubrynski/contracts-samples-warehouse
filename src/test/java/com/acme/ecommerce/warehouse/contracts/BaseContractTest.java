package com.acme.ecommerce.warehouse.contracts;

import com.acme.ecommerce.warehouse.logistics.LogisticsService;
import com.acme.ecommerce.warehouse.stocks.ProductStock;
import com.acme.ecommerce.warehouse.stocks.StockController;
import com.acme.ecommerce.warehouse.stocks.StockService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMessageVerifier
public abstract class BaseContractTest {

	@Autowired
	LogisticsService logisticsService;

	@Before
	public void setUp() {
		StockService stockService = Mockito.mock(StockService.class);
		Mockito.when(stockService.checkStock(Mockito.anyInt())).thenReturn(new ProductStock(34257815, true));

		RestAssuredMockMvc.standaloneSetup(standaloneSetup(new StockController(stockService)));
	}

	protected void triggerPackageSentMessage() {
		logisticsService.dispatchPackageSentMessage("7JS8HD8");
	}
}
