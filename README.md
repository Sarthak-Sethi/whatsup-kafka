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
