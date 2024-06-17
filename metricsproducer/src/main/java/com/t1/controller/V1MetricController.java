package com.t1.controller;

import com.t1.service.MetricSendService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/metrics")
@RequiredArgsConstructor
public class V1MetricController {
    private final MetricSendService metricSendService;

    @PostMapping
    public void sendMetric(@RequestBody MetricRequest request) {
        metricSendService.invoke(request);
    }
}
