package com.t1.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MetricRequest {
    private String serviceName;
    private String metricType;
    private long value;
}
