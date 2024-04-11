package com.example.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching; //mejora

@SpringBootApplication
@EnableCaching//mejora
public class CachingApplication {

  public static void main(String[] args) {
    SpringApplication.run(CachingApplication.class, args);
  }

}


