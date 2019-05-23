# Demonstrate e very long (does it ever end?) bundle resolution.

For me it ended with

```
[ERROR] GC overhead limit exceeded -> [Help 1]
```

Try to build all:

```
mvn clean install
```

Trigger bundle resolution again:

```
mvn -pl resolvebug-app -am bnd-indexer:index bnd-indexer:index@test-index bnd-resolver:resolve package
```
