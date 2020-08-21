package com.cleanbean.size;

import com.cleanbean.validation.AnnotationValidator;

import java.lang.reflect.Field;

public class SizeAnnotationValidator implements AnnotationValidator {

    private Object object;

    public SizeAnnotationValidator(final Object object) {
        this.object = object;
    }

    @Override
    public boolean isAnnotationValid(Field field) {

        field.setAccessible(true);

        boolean isValid = true;

        Object handler = null;

        try {
            handler = field.get(object);

            Size size = field.getAnnotation(Size.class);
            int min = size.min();
            int max = size.max();

            if (handler instanceof Number) {
                isValid = ((Number) handler).intValue() >= min && ((Number) handler).intValue() <= max;
            } else if(handler instanceof String) {
                isValid = ((String) handler).length() >= min && ((String) handler).length() <= max;
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
