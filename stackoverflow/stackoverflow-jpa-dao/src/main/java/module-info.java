/**
 * 
 */
/**
 * @author atbalog
 *
 */
open module com.stackoverflow.jpa.dao {

	requires com.stackoverflow.dao;
	requires com.stackoverflow.domain;
	requires java.persistence;
	requires spring.context;
	requires spring.core;
	requires spring.boot;
	requires spring.data.jpa;
	requires spring.data.commons;
	requires spring.boot.autoconfigure;
	requires java.annotation;
	requires spring.orm;
	requires org.hibernate.orm.core;
	requires spring.boot.test;
	
	exports com.stackoverflow.jpa.dao;
}