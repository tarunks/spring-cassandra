package com.hcl.mapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@RestController
@EnableAutoConfiguration
@ComponentScan
public class App 
{
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
