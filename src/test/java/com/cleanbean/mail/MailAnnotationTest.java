package com.cleanbean.mail;

import com.cleanbean.beans.MailBean;
import com.cleanbean.validation.Validator;
import com.cleanbean.validation.ValidatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MailAnnotationTest {

    private Validator validator;

    @BeforeEach
    void before() {
        validator = ValidatorImpl.getInstance();
    }

    @Test
    void valid_mail() {
        MailBean mailBean = new MailBean();
        mailBean.setMail("info@cleanbean.com");
        assertTrue(validator.isValid(mailBean));
        mailBean.setMail("info.cleanbean.com");
        assertFalse(validator.isValid(mailBean));
    }
}
