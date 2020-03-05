package com.cleanbean.min;

import com.cleanbean.validation.AnnotationValidator;

public class MinAnnotationValidator implements AnnotationValidator {

    private Object object;

    public MinAnnotationValidator(Object object) {
        this.object = object;
    }

    public boolean isAnnotationValid(Object object) {
        return false;
    }
}
