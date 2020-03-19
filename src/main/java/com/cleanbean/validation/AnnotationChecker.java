package com.cleanbean.validation;

import java.lang.reflect.Field;

public class AnnotationChecker {

    static boolean isAnnotationPresent(Field field, Class klass) {
        return field.isAnnotationPresent(klass);
    }
}