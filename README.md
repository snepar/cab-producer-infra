**Commands to Execute**
This project creates infrastructure for the spark cab-alert use-case.

The Docker compose contains the following ::
- Kafka

The Scala job _App.scala_ generates events and ingests into kafka 

_Pre-Requisite_

- Docker Desktop
- Any IDE

_Docker_
- docker compose up 

_Kafka_
- broker port is 9092
- kafka-topics --list --bootstrap-server broker:9092
- _test ingestion on kafka #_>
  - kafka-console-consumer --topic ride --bootstrap-server broker:9092
  - kafka-console-consumer --topic rejectalert --bootstrap-server broker:9092