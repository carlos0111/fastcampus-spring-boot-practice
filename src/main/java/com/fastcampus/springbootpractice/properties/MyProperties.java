package com.fastcampus.springbootpractice.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConstructorBinding
@ConfigurationProperties("my")
public class MyProperties {
    private final Integer height;

    public MyProperties(Integer height){
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }


}
