package br.com.alura.listavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by carlos on 04/06/2017.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AppWebConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(AppWebConfiguration.class, args);
    }


}
