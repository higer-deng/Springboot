package com.yqsh.springboot.demo.adminserver;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAdminServer
@SpringBootApplication
public class SpringBootDemoAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoAdminServerApplication.class,args);
    }

}
