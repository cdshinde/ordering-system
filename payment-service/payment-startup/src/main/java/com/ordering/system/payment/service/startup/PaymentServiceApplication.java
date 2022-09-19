package com.ordering.system.payment.service.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.ordering.system.payment.service.dataaccess")
@EntityScan(basePackages = "com.ordering.system.payment")
@SpringBootApplication(scanBasePackages = "com.ordering.system.payment")
public class PaymentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class, args);
    }
}
