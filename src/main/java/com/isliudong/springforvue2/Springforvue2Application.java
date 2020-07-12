package com.isliudong.springforvue2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.isliudong.springforvue2.mapper")
public class Springforvue2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springforvue2Application.class, args);
    }

}
