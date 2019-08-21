package com.nsc.consumer.receiver;

import com.nsc.consumer.sink.ProcessedMessageSink;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(ProcessedMessageSink.class)
public class MessageReceiver {

    @StreamListener(target = ProcessedMessageSink.INPUT)
    public void process(KStream<String, String> message) {
        message.foreach(((key, value) -> System.out.println(value)));
    }
}
