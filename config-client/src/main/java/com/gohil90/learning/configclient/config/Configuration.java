package com.gohil90.learning.configclient.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties("metric-service")
public class Configuration {
    private Long threshold;
    private String name;

}
