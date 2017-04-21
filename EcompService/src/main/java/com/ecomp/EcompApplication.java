package com.ecomp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by AmareshKumar on 21/3/17.
 */

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class EcompApplication {
    public static void main(String args[]){
        SpringApplication.run(EcompApplication.class,args);
    }
}
