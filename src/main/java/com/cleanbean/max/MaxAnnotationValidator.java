package com.cleanbean.max;

import com.cleanbean.validation.AnnotationValidator;

public class MaxAnnotationValidator implements AnnotationValidator {

    private Object object;

    public MaxAnnotationValidator(Object object) {
        this.object = object;
    }

    public boolean isAnnotationValid(Object object) {
        return false;
    }
}
