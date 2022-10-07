# metacontroller-spring-boot-starter

Spring Boot Starter for Metacontroller

Includes:
1. Java objects representing input and output for controller implementations that leverage Metacontroller for handling communication with the Kubernetes API
2. AOT compilation hints for the above Java objects
3. Configuration to publish to maven repo hosted in this same GitHub repo (self-hosted)

TO-DO:
1. Enhance api package objects to cover more of the complete types. 
See [https://github.com/metacontroller/metacontroller/blob/99bca2fbe1c5fa20fee016dffd5856761ee90cc3/pkg/apis/metacontroller/v1alpha1/types.go](https://github.com/metacontroller/metacontroller/blob/99bca2fbe1c5fa20fee016dffd5856761ee90cc3/pkg/apis/metacontroller/v1alpha1/types.go)
2. Separate api package into a dedicated `metacontroller-java` library,
leaving only the AOT starter hints (and the reference to the new api package library
as a dependency in the pom.xml) in the starter

> Note: This project is configured to build and publish as a maven artifact to this same repo.
See: [https://www.baeldung.com/maven-repo-github](https://www.baeldung.com/maven-repo-github)
(hint: run `mvn deploy`)