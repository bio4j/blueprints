Nice.javaProject

organization := "bio4j"

name := "model"

description := "bio4j abstract model and the default blueprints implementation"

bucketSuffix := "era7.com"

libraryDependencies += "com.tinkerpop.blueprints" % "blueprints-core" % "2.4.0"

javacOptions ++= Seq("-Xlint:unchecked")
