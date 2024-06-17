package com.t1.service;

import com.t1.controller.MetricRequest;
import com.t1.model.broker.MetricMessage;
import com.t1.producer.MetricProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MetricSendService {
    private final MetricProducer metricProducer;

    public void invoke(MetricRequest request) {
        metricProducer.send(MetricMessage.builder()
                .serviceName(request.getServiceName())
                .metricType(request.getMetricType())
                .value(request.getValue())
                .createdAt(LocalDateTime.now())
                .build());
    }
}
