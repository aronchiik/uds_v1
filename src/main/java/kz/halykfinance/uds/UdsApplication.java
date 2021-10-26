package kz.halykfinance.uds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UdsApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder app) {
		return app.sources(UdsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(UdsApplication.class, args);
	}

}
