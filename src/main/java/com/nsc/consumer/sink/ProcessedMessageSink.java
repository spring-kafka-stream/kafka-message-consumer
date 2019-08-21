package com.nsc.consumer.sink;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

public interface ProcessedMessageSink {
    String INPUT = "processedEventIn";

    @Input(INPUT)
    KStream<String, String> input();
}
