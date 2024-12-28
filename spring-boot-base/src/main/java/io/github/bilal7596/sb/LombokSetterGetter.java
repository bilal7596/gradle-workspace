package io.github.bilal7596.sb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LombokSetterGetter {

    @Value("${spring.application.name}")
    public String name;

    public String getName() {
        return name;
    }

}
