package com.t1.consumer;

import com.t1.model.broker.MetricMessage;
import com.t1.service.MetricSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MetricConsumer {
    private final MetricSaveService metricSaveService;

    @KafkaListener(id = "${broker.metric.groupId}", topics = "${broker.metric.topic}")
    public void listen(MetricMessage message) {
        metricSaveService.invoke(message);
    }
}
