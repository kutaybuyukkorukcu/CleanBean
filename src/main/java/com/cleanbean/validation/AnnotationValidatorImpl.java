package com.cleanbean.validation;

import com.cleanbean.max.Max;
import com.cleanbean.max.MaxAnnotationValidator;
import com.cleanbean.min.Min;
import com.cleanbean.min.MinAnnotationValidator;
import com.cleanbean.validation.AnnotationValidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class AnnotationValidatorImpl implements AnnotationValidator {

    private Map<Class, AnnotationValidator> annotationMap = new HashMap<>();

    public AnnotationValidatorImpl(Object object) {
        init(object);
    }

    private void init(Object object) {
        annotationMap.put(Max.class, new MaxAnnotationValidator(object));
        annotationMap.put(Min.class, new MinAnnotationValidator(object));

    }

    public boolean isAnnotationValid(Field field) {
        boolean isValid = false;
        for (Annotation annotation : field.getDeclaredAnnotations()) {
            if (AnnotationChecker.isAnnotationPresent(field, annotation.annotationType())) {
                if(annotationMap.get(annotation.annotationType()).isAnnotationValid(field)) {
                    isValid = true;
                }
            }
        }
        return isValid;
    }
}
