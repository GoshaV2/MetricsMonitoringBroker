package com.t1.controller;

import com.t1.service.MetricGetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/metrics")
@RequiredArgsConstructor
public class V1MetricController {
    private final MetricGetService metricGetService;

    @GetMapping
    public List<String> getMetricTypes() {
        return metricGetService.getMetricTypes();
    }

    @GetMapping("/{type}")
    public List<MetricResponse> getMetrics(@PathVariable String type) {
        return metricGetService.getMetricTypes(type);
    }
}
