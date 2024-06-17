package com.t1.model.broker;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MetricMessage {
    private String serviceName;
    private String metricType;
    private long value;
    private LocalDateTime createdAt;
}
