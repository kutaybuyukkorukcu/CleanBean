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

    private boolean anyFalse(ArrayList<Boolean> booleanList) {

        boolean anyFalse = false;

        Iterator iterator = booleanList.iterator();

        while (iterator.hasNext()) {
            return Boolean.compare(true, (boolean) iterator.next()) == 1 ? true : false;
        }

        return anyFalse;
    }
}
