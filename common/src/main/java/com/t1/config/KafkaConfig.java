package com.t1.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;

@Configuration
public class KafkaConfig {
    @Value("${broker.metric.topic}")
    private String metricTopic;
    @Value("${broker.metric.partitions}")
    private int metricPartitions;
    @Value("${broker.metric.replication}")
    private short metricReplication;

    @Bean
    public NewTopic metricTopic() {
        return new NewTopic(metricTopic, metricPartitions, metricReplication);
    }

    @Bean
    public RecordMessageConverter converter() {
        return new JsonMessageConverter();
    }
}
