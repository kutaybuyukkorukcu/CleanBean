package com.cleanbean.regex;

import com.cleanbean.beans.RegexBean;
import com.cleanbean.validation.Validator;
import com.cleanbean.validation.ValidatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexAnnotationTest {

    private Validator validator;

    @BeforeEach
    void before() {
        validator = new ValidatorImpl();
    }

    @Test
    void valid_regex() {
        RegexBean regexBean = new RegexBean();
        regexBean.setString("cleanbean");
        assertTrue(validator.isValid(regexBean));
        regexBean.setString("bean");
        assertFalse(validator.isValid(regexBean));
    }
}
