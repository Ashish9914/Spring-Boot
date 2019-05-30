package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.google.common.base.Predicates.or;
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()                                       
	      .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
	      .paths(PathSelectors.any())                     
	      .build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("RPA API")
				.description("JavaInUse API reference for developers")
				.termsOfServiceUrl("http://eaiesb.com")
				.contact("sateesh.reddy@eaiesb.com").license("Eaiesb License")
				.licenseUrl("sateesh.reddy@eaiesb.com").version("1.0").build();
	}

}