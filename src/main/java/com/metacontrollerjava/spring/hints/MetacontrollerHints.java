package com.metacontrollerjava.spring.hints;

import com.metacontrollerjava.api.input.input.ControllerInput;
import com.metacontrollerjava.api.output.ControllerOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

public class MetacontrollerHints implements RuntimeHintsRegistrar {

    private static final Logger log = LoggerFactory.getLogger(MetacontrollerHints.class);

    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        log.info("Registering runtime hints");
        hints.reflection().registerType(ControllerInput.class, MemberCategory.values());
        hints.reflection().registerType(ControllerOutput.class, MemberCategory.values());

    }
}
