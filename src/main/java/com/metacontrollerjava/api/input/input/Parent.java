package com.metacontrollerjava.api.input.input;

public record Parent(String apiVersion, String kind, ParentMetadata metadata, ParentSpec spec) {
}
