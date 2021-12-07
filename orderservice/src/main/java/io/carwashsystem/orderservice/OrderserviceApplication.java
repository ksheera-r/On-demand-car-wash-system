package io.carwashsystem.orderservice;

import org.springframework.boot.SpringApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.carwashsystem.orderservice.service.OrderServiceImpl;

@SpringBootApplication
@EnableSwagger2
public class OrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceApplication.class, args);
	}
	@Bean
	public OrderServiceImpl getcustomerService(){
		return new OrderServiceImpl();
	}
	
}
