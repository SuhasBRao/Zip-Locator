package com.example.ZipFinder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZipFinderApplication {

	private static final Logger log = LoggerFactory.getLogger(ZipFinderApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ZipFinderApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			ZipData zipdata = restTemplate.getForObject(
					"http://api.zippopotam.us/IN/570018", ZipData.class);

			// System.out.println(zipdata.toString());
			log.info(zipdata.toString());
		};
	}
}
