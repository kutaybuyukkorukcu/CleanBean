package com.cleanbean.validation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;


public class ValidatorImpl implements Validator {

    private static ValidatorImpl INSTANCE = null;

    private ValidatorImpl() {

    }

    public static ValidatorImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ValidatorImpl();
        }

        return INSTANCE;
    }

    public boolean isValid(Object object) {

        Class<?> klass = object.getClass();
        Field[] fields = klass.getDeclaredFields();
        ArrayList<Boolean> booleanList = new ArrayList<Boolean>();
        AnnotationValidatorImpl annotationValidator = new AnnotationValidatorImpl(object);

        for (Field field: fields) {
            field.setAccessible(true);

            booleanList.add(annotationValidator.isAnnotationValid(field));
        }

        return anyFalse(booleanList);
    }

    private static <T> T checkNotNull(T object, String name) {

        if (object == null) {
            throw new NullPointerException(name);
        }

        return object;
    }

    private boolean anyFalse(ArrayList<Boolean> booleanList) {

        boolean anyFalse = true;

        Iterator iterator = booleanList.iterator();

        while (iterator.hasNext()) {

            if (!(boolean) iterator.next()) {
                anyFalse = false;
                break;
            }
        }

        return anyFalse;
    }
}
