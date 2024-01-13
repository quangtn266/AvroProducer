# AvroProducer
A demo Kafka using Schema Registry to producer Avro classes.

## Configuration.

1. Generate a server.properties

```
kafka-storage.sh random-uuid
```

```
kafka-storage.sh format -t <uuid> -c ~/kafka_2.13-3.1.0/config/kraft/server.properties
```

2. Download Schema Registry http://www.confluent.io/developer and follow steps here for using schema-registry https://docs.confluent.io/platform/current/installation/installing_cp/zip-tar.html#prod-kafka-cli-install

```
export CONFLUENT_HOME=<The directory where Confluent is installed>
export PATH=$PATH:$CONFLUENT_HOME/bin
```

3. Build the producer:

```
mvn clean package
```

4. Start Kafka.

```
kafka-server-start.sh ~/kafka_2.13-3.6.0/config/kraft/server.properties
```

5. Start Schema-Registry

```
schema-registry-start ./etc/schema-registry/schema-registry.properties
```

6. Create a topic "clicks".

```
kafka-topics.sh --create --boostrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic sessions
```

7. Run the producer to produce 100 clicks:

```
java -cp target/uber-ClickstreamGenerator-1.0-SNAPSHOT.jar com.github.quangtn.kafka.avroclicks.AvroClicksProducer 100 http://localhost:8081
```

8. Validate the result by using the avro console consumer (part of the schema repository):

```
kafka-avro-console-consumer --boostrap-server localhost:9092 --topic clicks --from-beginning
```
