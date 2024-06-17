package com.t1.service;

import com.t1.model.Metric;
import com.t1.model.broker.MetricMessage;
import com.t1.repository.MetricRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MetricSaveService {
    private final MetricRepository metricRepository;

    @Transactional
    public void invoke(MetricMessage message) {
        Metric metric = buildMetric(message);
        metricRepository.save(metric);
    }

    private static Metric buildMetric(MetricMessage message) {
        return Metric.builder()
                .value(message.getValue())
                .serviceName(message.getServiceName())
                .createdAt(message.getCreatedAt())
                .metricType(message.getMetricType())
                .build();
    }
}
