Nice.javaProject

name := "bio4j-model"

description := "bio4j-model project"

organization := "era7"

bucketSuffix := "era7.com"

libraryDependencies += "com.tinkerpop.blueprints" % "blueprints-core" % "2.4.0"

scalacOptions ++= Seq("-Xlint:unchecked")

javacOptions ++= Seq("-Xlint:unchecked")