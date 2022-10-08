package com.metacontrollerjava.api.input;

public record Parent(String apiVersion, String kind, ParentMetadata metadata, ParentSpec spec) {
}
