package com.github.markdingram.aot;

import java.lang.annotation.*;

@Target({ElementType.PACKAGE})
public @interface Aot {
    /**
     * @return Optional namespace, when not given the declaring package will be used
     */
    String namespace() default "";
}