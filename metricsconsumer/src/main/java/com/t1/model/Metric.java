package com.t1.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "metrics")
@Entity
public class Metric {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String serviceName;
    private String metricType;
    private long value;
    private LocalDateTime createdAt;
}
