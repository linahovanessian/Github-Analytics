package com.webbfontain.githubanalytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author linahovanessian on 11/6/18.
 */

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.webbfontain.githubanalytics",
})
public class WebApp {


    public static void main(String[] args) {
        SpringApplication.run( WebApp.class, args );
    }


}
