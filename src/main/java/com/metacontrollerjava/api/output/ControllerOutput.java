package com.metacontrollerjava.api.output;

import com.metacontrollerjava.api.output.Status;
import io.kubernetes.client.common.KubernetesObject;

import java.util.List;

public record ControllerOutput(List<KubernetesObject> children, Status status) {
}
