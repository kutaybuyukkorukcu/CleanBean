package com.cleanbean.validation;

import com.cleanbean.validation.Validator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.AnnotatedElement;

public class ValidatorImpl implements Validator {

    public boolean isValid(Object object) {

        Class<?> klass = object.getClass();
        Field[] fields = klass.getDeclaredFields();

        klass.isAnnotationPresent((Class<? extends Annotation>) /** Annotation class**/);
        AnnotatedElement annotatedElement = ;

        for (Field field:
             fields) {
            field.
        }
    }
}
