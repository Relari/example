package com.pe.relari.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Getter
@Setter
@Lazy
@Configuration
@ConfigurationProperties(prefix = "application.info")
public class DemoConfig {

    private String directory;
    private String name;
    private String home;

}
