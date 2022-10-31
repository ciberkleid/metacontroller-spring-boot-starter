package com.metacontrollerjava.api.output;

import io.kubernetes.client.common.KubernetesObject;

import java.util.List;

public record ControllerOutput<T>(List<KubernetesObject> children, T status) {
}
