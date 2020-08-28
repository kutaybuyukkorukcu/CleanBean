package com.cleanbean.max;

import com.cleanbean.beans.MaxBean;

import com.cleanbean.validation.Validator;
import com.cleanbean.validation.ValidatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxAnnotationTest {

    private Validator validator;

    // Number 5 is set for each variable

    @BeforeEach
    void before() {
        validator = ValidatorImpl.getInstance();
    }

    @Test
    void valid_max_int() throws IllegalAccessException {
        MaxBean maxBean = new MaxBean();
        maxBean.set_int(3);
        assertTrue(validator.isValid(maxBean));
        maxBean.set_int(7);
        assertFalse(validator.isValid(maxBean));
    }
}
