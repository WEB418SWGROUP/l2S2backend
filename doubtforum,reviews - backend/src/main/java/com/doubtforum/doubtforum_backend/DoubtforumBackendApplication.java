package com.doubtforum.doubtforum_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.doubtforum")
@SpringBootApplication
public class DoubtforumBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(DoubtforumBackendApplication.class, args);
    }

}
