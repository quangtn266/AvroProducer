package com.github.quangtn.kafka.avroproducer;

import JavaSessionize.avro.LogLine;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.util.Objects;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class AvroClicksProducer {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        if(args.length!=2){
            System.out.println("Please provide command line arguments: numEvents schemaRegistryURL");
            System.exit(-1);
        }
        long events = Long.parseLong(args[0]);
       // String schemaUrl = args[1];

        Properties props = new Properties();

        // Hard coding the kafka server URI for this example
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, org.apache.kafka.common.serialization.StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, io.confluent.kafka.serializers.KafkaAvroSerializer.class);
        props.put("schema.registry.url", "http://localhost:8081");
        // Hard coding topic too.
        String topic = "clicks";

        Producer<String, LogLine> producer = new KafkaProducer<String, LogLine>(props);
        Random rnd = new Random();
        for(long nEvents = 0; nEvents < events; nEvents++){
            LogLine event = EventGenerator.getNext();

            // Using IP as key, so events from same IP will go to same patition
            ProducerRecord<String, LogLine> record = new ProducerRecord<String, LogLine>(topic, event.getIp().toString(), event);
            producer.send(record).get();

        }
    }
}
