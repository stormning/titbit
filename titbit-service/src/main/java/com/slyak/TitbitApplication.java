package com.slyak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableJdbcHttpSession
@EnableJpaRepositories
public class TitbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TitbitApplication.class, args);
	}
}
