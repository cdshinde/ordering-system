package com.ordering.system.order.service.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.ordering.system.order.service.dataaccess")
@EntityScan(basePackages = "com.ordering.system.order")
@SpringBootApplication(scanBasePackages = "com.ordering.system.order")
public class OrderServiceApplication {
    public static void main(String[] args) {
      SpringApplication.run(OrderServiceApplication.class, args);
    }
}
