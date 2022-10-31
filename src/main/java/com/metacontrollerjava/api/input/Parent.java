package com.metacontrollerjava.api.input;

public record Parent<T>(String apiVersion, String kind, ParentMetadata metadata, T spec) {
}
