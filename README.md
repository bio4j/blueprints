## Bio4j default Blueprints model implementation

Bio4j has an intermediate Blueprints layer, which allows us to make a default implementation of the [abstract domain model](https://github.com/bio4j/bio4j) using [Tinkerpop Blueprints API](https://github.com/tinkerpop/blueprints/wiki) and at the same time stay independent from the choice of database technology.

See also technology specific implementations:

- [**Titan DB**](https://github.com/bio4j/titandb)
- [**Neo4j DB**](https://github.com/bio4j/neo4jdb)

### SBT dependency

To use it in your sbt-project, add this to `build.sbt`:

```scala
resolvers += "Era7 maven releases" at "http://releases.era7.com.s3.amazonaws.com"

libraryDependencies += "bio4j" % "blueprints" % "0.4.0"
```
