package com.stackoverflow.jpa.dao;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.stackoverflow.domain.model"})
@ComponentScan(basePackages = "com.stackoverflow.jpa.dao")
public class DaoConfig {

}
