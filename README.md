# metacontroller-spring-boot-starter

Spring Boot Starter for Metacontroller

Includes:
1. Java objects representing input and output for controller implementations that leverage [Metacontroller](https://metacontroller.github.io/metacontroller)
2. AOT compilation hints for the above Java objects

The following shows how to use this library in your maven project.
For guidance on how to use it in other types of projects, check the [library home page on JitPack](https://jitpack.io/#ciberkleid/metacontroller-spring-boot-starter).

Add the [JitPack repository](https://jitpack.io/#ciberkleid/metacontroller-spring-boot-starter) to your pom.xml file:
```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

Add the dependency to your pom.xml file:
```xml
	<dependency>
	    <groupId>com.github.ciberkleid</groupId>
	    <artifactId>metacontroller-spring-boot-starter</artifactId>
	    <version>0.0.1-SNAPSHOT</version>
	</dependency>
```

TO-DO:
1. Enhance api package objects to cover more of the complete types. 
See [https://github.com/metacontroller/metacontroller/blob/99bca2fbe1c5fa20fee016dffd5856761ee90cc3/pkg/apis/metacontroller/v1alpha1/types.go](https://github.com/metacontroller/metacontroller/blob/99bca2fbe1c5fa20fee016dffd5856761ee90cc3/pkg/apis/metacontroller/v1alpha1/types.go)
2. Separate api package into a dedicated `metacontroller-java` library,
leaving only the AOT starter hints (and a reference to the new api package library
as a dependency in the pom.xml) in the starter
