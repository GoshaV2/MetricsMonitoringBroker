package com.t1.repository;

import com.t1.model.Metric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MetricRepository extends JpaRepository<Metric, UUID> {
    @Query("""
            select distinct m.metricType from Metric m
            """)
    List<String> findMetricTypes();

    List<Metric> findAllByMetricType(String metricType);
}
