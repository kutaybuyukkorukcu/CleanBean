package com.cleanbean.validation;

import java.lang.reflect.Field;

public interface AnnotationValidator {
    boolean isAnnotationValid(Field field);
}
