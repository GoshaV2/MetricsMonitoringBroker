package com.t1.controller;

import com.t1.model.Metric;

import java.util.List;

public class MetricResponseMapper {
    public static MetricResponse toMetricResponse(Metric metric) {
        return MetricResponse.builder()
                .id(metric.getId())
                .serviceName(metric.getServiceName())
                .metricType(metric.getMetricType())
                .value(metric.getValue())
                .createdAt(metric.getCreatedAt())
                .build();
    }

    public static List<MetricResponse> toMetricResponse(List<Metric> metrics) {
        return metrics.stream()
                .map(MetricResponseMapper::toMetricResponse)
                .toList();
    }
}
