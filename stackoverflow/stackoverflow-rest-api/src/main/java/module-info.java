/**
 * 
 */
/**
 * @author atbalog
 *
 */
open module com.stackoverflow.rest {

	requires transitive com.stackoverflow.dao;
	requires transitive com.stackoverflow.domain;
	requires transitive com.stackoverflow.jpa.dao;
	requires spring.context;
	requires spring.core;
	requires spring.boot;
	requires spring.beans;
	requires spring.web;
	requires spring.webmvc;
	requires spring.boot.autoconfigure;
	requires java.annotation;
	requires spring.boot.test;
	
	exports com.stackoverflow.rest;
}