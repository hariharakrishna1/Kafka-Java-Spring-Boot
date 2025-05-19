# Apache Kafka Project – Producer & Consumer Scripts

This project demonstrates the use of Apache Kafka for real-time data streaming using separate producer and consumer scripts. It showcases a modular design for scalability and ease of maintenance.

## 🚀 Features

- Kafka Producer script to send messages to a topic.
- Multiple Consumer scripts, each consuming from specific topics or partitions.
- Environment-based configuration using `.env` or config files.
- Graceful error handling and reconnection logic.
- Logging for debugging and monitoring.


## ⚙️ Prerequisites

- Java Spring Boot
- Apache Kafka running locally or on a remote server (Zookeeper as well)
- `kafka-python` or `confluent-kafka` library (depending on implementation)

## 🔧 Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/your-username/kafka-project.git
   cd kafka-project

## Configure Kafka
{
  "bootstrap_servers": "localhost:9092",
  "topic_name": "demodata",
  "group_id": "grp1"
}

## NOTE: 

Start Kafka Broker

Make sure your Kafka and Zookeeper services are running.

## EXAMPLE: 
zookeeper-server-start.sh config/zookeeper.properties
kafka-server-start.sh config/server.properties



