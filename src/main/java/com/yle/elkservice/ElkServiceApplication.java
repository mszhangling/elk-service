package com.yle.elkservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangling
 */
@SpringBootApplication
public class ElkServiceApplication {

	private static final Logger logger = LoggerFactory.getLogger(ElkServiceApplication.class);

	public static void main(String[] args) {

		logger.info("ElkServiceApplication START");

		SpringApplication.run(ElkServiceApplication.class, args);

		logger.info("ElkServiceApplication END");
	}
}
