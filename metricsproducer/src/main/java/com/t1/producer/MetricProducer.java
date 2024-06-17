package com.t1.producer;

import com.t1.model.broker.MetricMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MetricProducer {
    private final KafkaTemplate<Object, Object> kafkaTemplate;
    @Value("${broker.metric.topic}")
    private String metricTopic;

    public void send(MetricMessage message) {
        kafkaTemplate.send(metricTopic, message);
    }
}
