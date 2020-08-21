package com.cleanbean.max;

import com.cleanbean.validation.AnnotationValidator;

import java.lang.reflect.Field;

public class MaxAnnotationValidator implements AnnotationValidator {

    private Object object;

    public MaxAnnotationValidator(Object object) {
        this.object = object;
    }

    @Override
    public boolean isAnnotationValid(Field field) {

        field.setAccessible(true);

        boolean isValid = true;

        Object handler = null;

        try {
            handler = field.get(object);

            Max max = field.getAnnotation(Max.class);

            if (handler instanceof Number) {
                isValid = ((Number) handler).intValue() <= max.max();
            } else if (handler instanceof String) {
                isValid = ((String) handler).length() <= max.max();
            }

        } catch (IllegalAccessException e) {
            isValid = false;
        }

        return isValid;
    }
}
