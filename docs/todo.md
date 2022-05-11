# TODO

Here comes a list of things to touch upon at some point during the Scala Academy. Consider it a scrapbook.

1. [ScalaCheck](https://scalacheck.org/)
1. [Testcontainers](https://www.testcontainers.org/)
1. Testing Kafka apps
    1. Consumer and Producer APIs
    1. [Testing Apache Kafka](https://developer.confluent.io/learn/testing-kafka/)
    1. [MockProducer](https://kafka.apache.org/31/javadoc/org/apache/kafka/clients/producer/MockProducer.html)
    1. [MockConsumer](https://kafka.apache.org/31/javadoc/org/apache/kafka/clients/consumer/MockConsumer.html)
1. Testing Kafka Streams applications
    1. [Testing Kafka Streams](https://kafka.apache.org/31/documentation/streams/developer-guide/testing.html)
    1. [Testing Streams Code](https://docs.confluent.io/platform/current/streams/developer-guide/test-streams.html)
1. Github Workflows
    * https://github.com/cashapp/pranadb/tree/main/.github/workflows
    * https://github.com/dbt-labs/dbt-spark/tree/main/.github/workflows
    * https://github.com/delta-io/delta/tree/master/.github/workflows
    * https://github.com/datapunchorg/punch/blob/main/.github/workflows

## Docker Compose

1. [Overview of Docker Compose](https://docs.docker.com/compose/)
1. [Get started with Docker Compose](https://docs.docker.com/compose/gettingstarted/)

### Exercise: Dockerized Kafka Cluster

Running a dockerized Kafka Cluster using [Confluent Platform](https://docs.confluent.io/platform/current/quickstart/ce-docker-quickstart.html) (and Docker Compose).

### Exercise: Dockerized Kafka Streams Application

Create and run a dockerized Kafka Streams application.

**TIP**: Use [Confluent Platform](https://docs.confluent.io/platform/current/quickstart/ce-docker-quickstart.html) (and Docker Compose).

## Dockerized Spark App

Working together on [Exercise 3: Dockerized Spark App](docker/003.md#exercise-3-dockerized-spark-app) from the Docker module.

## Introduction to Cloudera Enterprise 6.3

Read the following documents. Get familiar with the basics.

1. [Overview of Cloudera and the Cloudera Documentation Set]({{ cloudera.docs }}/topics/introduction.html)
1. [CDH Overview]({{ cloudera.docs }}/topics/cdh_intro.html)
1. [Cloudera Manager Overview]({{ cloudera.docs }}/topics/cm_intro_primer.html)
1. (optional) [Cluster Management]({{ cloudera.docs }}/topics/administration.html)

!!! important
    From [Cloudera Community Forum](https://community.cloudera.com/t5/Support-Questions/cloudera-sandbox-6-3-0-docker-run-no-services-are-running/m-p/339791/highlight/true#M233182):

    > We currently don't support any docker-based sandbox/quickstart clusters. The one available in GitHub is of a very old CDH version.
