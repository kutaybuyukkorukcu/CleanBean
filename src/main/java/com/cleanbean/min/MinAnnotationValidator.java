package com.cleanbean.min;

import com.cleanbean.validation.AnnotationValidator;

import java.lang.reflect.Field;

public class MinAnnotationValidator implements AnnotationValidator {

    private Object object;

    public MinAnnotationValidator(Object object) {
        this.object = object;
    }

    public boolean isAnnotationValid(Field field) {

        field.setAccessible(true);

        boolean isValid = true;

        Object handler = null;

        try {
            handler = field.get(object);

            Min min = field.getAnnotation(Min.class);

            if (handler instanceof Number) {
                isValid = ((Number) handler).intValue() <= min.min();
            } else if (handler instanceof String) {
                isValid = ((String) handler).length() <= min.min();
            }

        } catch (NullPointerException | IllegalAccessException e) {
            isValid = false;
        }

        return isValid;
    }
}