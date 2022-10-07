# metacontroller-spring-boot-starter

Spring Boot Starter for Metacontroller

Includes:
1. Java objects representing input and output for controller implementations that leverage Metacontroller for handling communication with the Kubernetes API
2. AOT compilation hints for the above Java objects

TO-DO:
Separate Java objects into a dedicated `metacontroller-java` library,
leaving only the AOT starter hints and the reference to the new library
as a dependency in the pom.xml in the starter.