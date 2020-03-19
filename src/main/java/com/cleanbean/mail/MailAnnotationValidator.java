package com.cleanbean.mail;

import com.cleanbean.validation.AnnotationValidator;

import java.lang.reflect.Field;

public class MailAnnotationValidator implements AnnotationValidator {

    private Object object;

    public MailAnnotationValidator(Object object) {
        this.object = object;
    }

    public boolean isAnnotationValid(Field field) {

        field.setAccessible(true);

        boolean isValid = true;

        Object handler = null;

        try  {
            handler = field.get(object);

            Mail mail = field.getAnnotation(Mail.class);

            if (handler instanceof String) {
                isValid = ((String) handler).indexOf("@") > 0;
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
