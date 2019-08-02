/**
 * 
 */
/**
 * @author atbalog
 *
 */
module com.stackoverflow.jpa.dao {

	requires com.stackoverflow.dao;
	requires com.stackoverflow.domain;
	requires java.persistence;
	requires spring.context;
	requires spring.core;
	requires spring.boot.autoconfigure;
	requires java.annotation;
	requires spring.orm;
	
	exports com.stackoverflow.jpa.dao;
	
	opens com.stackoverflow.jpa.dao to spring.core;
}