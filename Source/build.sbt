name := "BDP"

version := "0.1"

scalaVersion := "2.11.7"



libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.0.1",
  "org.apache.spark" % "spark-streaming_2.11" % "2.0.1",
  "org.apache.bahir" % "spark-streaming-twitter_2.11" % "2.0.1",
"org.apache.spark" %% "spark-core" % "1.5.1",
 "org.apache.spark" %% "spark-sql" % "2.0.1"
)