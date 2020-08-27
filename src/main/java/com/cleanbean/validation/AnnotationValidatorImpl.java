package com.cleanbean.validation;

import com.cleanbean.max.*;
import com.cleanbean.min.*;
import com.cleanbean.mail.*;
import com.cleanbean.regex.*;
import com.cleanbean.size.*;



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
        annotationMap.put(Mail.class, new MailAnnotationValidator(object));
        annotationMap.put(Regex.class, new RegexAnnotationValidator(object));
        annotationMap.put(Size.class, new SizeAnnotationValidator(object));
    }

    public boolean isAnnotationValid(Field field) {
        boolean isValid = false;
        for (Annotation annotation : field.getAnnotations()) {
            if (AnnotationChecker.isAnnotationPresent(field, annotation.annotationType())) {
                if(annotationMap.get(annotation.annotationType()).isAnnotationValid(field)) {
                    isValid = true;
                }
            }
        }
        return isValid;
    }
}
