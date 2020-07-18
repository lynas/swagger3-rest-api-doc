package com.lynas.swagger3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Swagger3Application {

    public static void main(String[] args) {
        SpringApplication.run(Swagger3Application.class, args);
    }

    @Controller
    public static class ApiController {
        @GetMapping("/")
        public String api() {
            return "redirect:/swagger-ui/";
        }
    }

    // Optional
    /*
    @Bean
    public SecurityConfiguration securityConfiguration() {
      return SecurityConfigurationBuilder.builder()
          .enableCsrfSupport(true)
          .build();
    }

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfo(
                        "Swagger 3 api demo",
                        "Swagger 3 api demo application with spring boot",
                        "2.3",
                        "/terms",
                        new Contact("lynas", "http://lynas.github.io", "szlynas@gmail.com"),
                        "MIT",
                        "/",
                        Collections.emptyList()
                ));
    }*/

}


