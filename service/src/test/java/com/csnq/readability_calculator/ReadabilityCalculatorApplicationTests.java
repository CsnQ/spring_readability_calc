package com.csnq.readability_calculator;

import com.csnq.readability_calculator.controllers.TextCalcController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ReadabilityCalculatorApplicationTests {

	@Autowired
	private TextCalcController controller;

	@Test
	public void contextLoads() throws Exception{
		assertThat(controller).isNotNull();

	}

}
