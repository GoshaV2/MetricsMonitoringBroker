package com.t1.service;

import com.t1.controller.MetricResponse;
import com.t1.controller.MetricResponseMapper;
import com.t1.repository.MetricRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetricGetService {
    private final MetricRepository metricRepository;


    public List<String> getMetricTypes() {
        return metricRepository.findMetricTypes();
    }

    public List<MetricResponse> getMetricTypes(String metricType) {
        return MetricResponseMapper.toMetricResponse(metricRepository.findAllByMetricType(metricType));
    }
}
