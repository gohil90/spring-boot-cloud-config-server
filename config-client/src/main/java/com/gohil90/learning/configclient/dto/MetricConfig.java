package com.gohil90.learning.configclient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetricConfig {
    private Long threshold;
    private String name;

}
