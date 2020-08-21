package com.cleanbean.regex;

import com.cleanbean.validation.AnnotationValidator;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAnnotationValidator implements AnnotationValidator {

    private Object object;

    public RegexAnnotationValidator(Object object) {
        this.object = object;
    }

    @Override
    public boolean isAnnotationValid(Field field) {

        field.setAccessible(true);

        boolean isValid = true;

        Object handler = null;

        try {
            handler = field.get(object);

            Regex regex = field.getAnnotation(Regex.class);
            Pattern pattern = Pattern.compile(regex.pattern());
            Matcher matcher = pattern.matcher(handler.toString());

            isValid = matcher.find();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
