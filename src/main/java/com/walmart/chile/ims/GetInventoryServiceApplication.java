package com.walmart.chile.ims;


import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
//@ComponentScan(includeFilters = @ComponentScan.Filter(type =FilterType.ANNOTATION, value = Provider.class))
public class GetInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetInventoryServiceApplication.class, args);
		BasicConfigurator.configure();
	}
	
}
