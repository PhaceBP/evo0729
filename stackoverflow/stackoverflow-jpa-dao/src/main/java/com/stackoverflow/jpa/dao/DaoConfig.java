package com.stackoverflow.jpa.dao;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.stackoverflow.jpa.dao"})
@EntityScan(basePackages = {"com.stackoverflow.domain.model"})
public class DaoConfig {
	
	
}
