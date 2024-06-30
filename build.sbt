name := "cab-producer-infra"

version := "0.1"

scalaVersion := "2.12.10"

val kafkaVersion = "2.4.0"
val log4jVersion = "2.4.1"
val nlpLibVersion = "3.5.1"

resolvers ++= Seq(
  "bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven",
  "Typesafe Simple Repository" at "https://repo.typesafe.com/typesafe/simple/maven-releases",
  "MavenRepository" at "https://mvnrepository.com"
)

/*
  Beware that if you're working on this repository from a work computer,
  corporate firewalls might block the IDE from downloading the libraries and/or the Docker images in this project.
 */
libraryDependencies ++= Seq(
  // kafka
  "org.apache.kafka" %% "kafka" % kafkaVersion,
  "org.apache.kafka" % "kafka-streams" % kafkaVersion
)