package com.liaoyuanfang.cloudyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CloudyfSsoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudyfSsoApplication.class, args);
    }

}
