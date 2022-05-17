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

## Introduction to Cloudera Enterprise 6.3

Read the following documents. Get familiar with the basics.

1. [Overview of Cloudera and the Cloudera Documentation Set]({{ cloudera.docs }}/topics/introduction.html)
1. [CDH Overview]({{ cloudera.docs }}/topics/cdh_intro.html)
1. [Cloudera Manager Overview]({{ cloudera.docs }}/topics/cm_intro_primer.html)
1. (optional) [Cluster Management]({{ cloudera.docs }}/topics/administration.html)

!!! important
    From [Cloudera Community Forum](https://community.cloudera.com/t5/Support-Questions/cloudera-sandbox-6-3-0-docker-run-no-services-are-running/m-p/339791/highlight/true#M233182):

    > We currently don't support any docker-based sandbox/quickstart clusters. The one available in GitHub is of a very old CDH version.

## Exercises: Spark on minikube

1. [Demo: Running Spark Structured Streaming on minikube](https://jaceklaskowski.github.io/spark-kubernetes-book/demo/running-spark-structured-streaming-on-minikube/)
1. [Demo: Spark and Local Filesystem in minikube](https://jaceklaskowski.github.io/spark-kubernetes-book/demo/spark-and-local-filesystem-in-minikube/)

## Exercise: HorizontalPodAutoscaler Walkthrough

[HorizontalPodAutoscaler Walkthrough](https://kubernetes.io/docs/tasks/run-application/horizontal-pod-autoscale-walkthrough/)

## Deployments in Kubernetes

Read [Deployments](https://kubernetes.io/docs/concepts/workloads/controllers/deployment/).

## (optional) Exercise: Kafka Streams on minikube

This is a fairly challenging (_hard_?) exercise and hence optional. It should help you understand how to scale applications up and down but more importantly how to deploy a Kafka application that consumes records from a Kafka cluster on minikube (if possible) or outside minikube.

Scaling up and down a Kafka Streams application on minikube.

1. Create a Kafka Streams application
2. Deploy it to Kubernetes (minikube)

The main challenge is to set up a Kafka cluster so it is accessible to the Kafka Streams application.
