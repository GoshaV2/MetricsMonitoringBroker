package com.t1.controller;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MetricResponse {
    private UUID id;
    private String serviceName;
    private String metricType;
    private long value;
    private LocalDateTime createdAt;
}
