package com.cleanbean.min;

import com.cleanbean.beans.MinBean;

import com.cleanbean.validation.Validator;
import com.cleanbean.validation.ValidatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinAnnotationTest {

    private Validator validator;

    // Number 5 is set for each variable

    @BeforeEach
    void before() {
        validator =  ValidatorImpl.getInstance();
    }

    @Test
    void valid_min_int() throws IllegalAccessException {
        MinBean minBean = new MinBean();
        minBean.set_int(7);
        assertTrue(validator.isValid(minBean));
        minBean.set_int(3);
        assertFalse(validator.isValid(minBean));
    }
}
