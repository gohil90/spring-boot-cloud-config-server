package com.gohil90.learning.configclient.controller;

import com.gohil90.learning.configclient.config.Configuration;
import com.gohil90.learning.configclient.dto.MetricConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/metric/config")
    public MetricConfig getMetricConfig() {
        return new MetricConfig(configuration.getThreshold(), configuration.getName());
    }
}
