Nice.javaProject

organization := "bio4j"

name := "blueprints"

description := "Bio4j model default Blueprints implementation"

bucketSuffix := "era7.com"

libraryDependencies ++= Seq(
  "bio4j" % "bio4j" % "0.10.0-SNAPSHOT",
  "com.tinkerpop.blueprints" % "blueprints-core" % "2.4.0"
)
