package com.cleanbean.validation;

import com.cleanbean.validation.Validator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Iterator;

import com.cleanbean.max.Max;
import com.cleanbean.min.Min;
import com.sun.org.apache.xpath.internal.operations.Bool;


public class ValidatorImpl implements Validator {

    public boolean isValid(Object object) {

        Class<?> klass = object.getClass();
        Field[] fields = klass.getDeclaredFields();

//        klass.isAnnotationPresent((Class<? extends Annotation>) /** Annotation class**/);
//        AnnotatedElement annotatedElement = ;

        for (Field field:
             fields) {
            field.setAccessible(true);
            AnnotationChecker.isAnnotationPresent(field, Max.class);
        }
    }

    private static <T> T checkNotNull(T object, String name) {

        if (object == null) throw new NullPointerException(name);
        return object;
    }

    private static Object getDefaultValue(Class<?> type) {

        if (type == boolean.class) return false;
        if (type == int.class) return 0;
        if (!type.isPrimitive()) return null;

        if (type == long.class) return 0L;
        if (type == short.class) return (short) 0;
        if (type == byte.class) return (byte) 0;
        if (type == char.class) return '\0';
        if (type == float.class) return 0.0F;
        if (type == double.class) return 0.0D;

        return null;
    }

    private boolean isFalse(ArrayList<Boolean> booleans) {

        boolean flag = true;

        // Will implement Iterator here!

        return flag;
    }
}
