package io.github.bilal7596.sb;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBaseApplication.class, args);
    }

    @Autowired
    private LombokSetterGetter lombokSetterGetter;

    @PostConstruct
    public void run() {
        System.out.println(lombokSetterGetter.getName());
    }

}