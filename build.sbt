name := "BigDataBench-Spark"
version := "3.0.0"
scalacOptions := Seq("-unchecked", "-deprecation")

scalaVersion := "2.12.10"

val sparkVersion = "3.0.0"
val hadoopVersion = "2.8.3"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-graphx" % sparkVersion
)

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % hadoopVersion

