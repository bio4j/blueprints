Nice.javaProject

name := "bio4j-model"

description := "bio4j-model project"

organization := "ohnosequences"

bucketSuffix := "era7.com"

libraryDependencies += "com.tinkerpop.blueprints" % "blueprints-core" % "2.4.0"

javacOptions ++= Seq("-Xlint:unchecked")
