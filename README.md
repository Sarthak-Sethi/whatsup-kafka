# whatsup-kafka
# Kafka Learning Project with Spring Boot

This repository contains a simple Apache Kafka learning project implemented using Spring Boot. The project consists of two Spring Boot applications: a producer and a consumer.

## Producer Application

The producer application provides an HTTP endpoint (`/send`) that allows users to send messages to a Kafka topic. When a message is sent to this endpoint, the producer sends the message to the Kafka topic.

### Usage

To send a message to Kafka using the producer application:

1. Start the producer application by running `ProducerApplication.java`.

2. Make a POST request to the `/send` endpoint with a message as a request parameter:

   ```shell
   curl -X POST "http://localhost:8080/send?message=YourMessageHere"
Replace YourMessageHere with the message you want to send to Kafka.

## Consumer Application
The consumer application uses a Kafka listener (@KafkaListener) to consume messages from the Kafka topic. When a message is received, it logs the message content.

## Usage
To consume messages from Kafka using the consumer application:

Start the consumer application by running ConsumerApplication.java.

Messages sent to the Kafka topic by the producer application will be received and logged by the consumer.

## Prerequisites
Java Development Kit (JDK) installed on your system.
Apache Kafka installed and running locally or on a reachable server.
Configuration
Ensure that the Kafka broker address is correctly configured in both producer and consumer applications. You can configure Kafka-related properties in the application.properties or application.yml files.

## Dependencies
Spring Boot
Spring Kafka
