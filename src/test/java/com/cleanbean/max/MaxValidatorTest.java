package com.cleanbean.max;

import com.cleanbean.beans.MaxBean;

import com.cleanbean.validation.Validator;
import com.cleanbean.validation.ValidatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxValidatorTest {

    private Validator validator;

    // Number 5 is set for each variable

    @BeforeEach
    void before() {
        validator =  new ValidatorImpl();
    }

    @Test
    void valid_max_byte() throws IllegalAccessException {
        MaxBean maxBean = new MaxBean();
        maxBean.set_byte((byte) 3);
        assertTrue(validator.isValid(maxBean));
        maxBean.set_byte((byte) 7);
        assertFalse(validator.isValid(maxBean));
    }

    @Test
    void valid_max_short() throws IllegalAccessException {
        MaxBean maxBean = new MaxBean();
        maxBean.set_short((short) 3);
        assertTrue(validator.isValid(maxBean));
        maxBean.set_short((short) 7);
        assertFalse(validator.isValid(maxBean));
    }

    @Test
    void valid_max_int() throws IllegalAccessException {
        MaxBean maxBean = new MaxBean();
        maxBean.set_int(3);
        assertTrue(validator.isValid(maxBean));
        maxBean.set_int(7);
        assertFalse(validator.isValid(maxBean));
    }

    @Test
    void valid_max_string() throws IllegalAccessException {
        MaxBean maxBean = new MaxBean();
        maxBean.set_string("xxx");
        assertTrue(validator.isValid(maxBean));
        maxBean.set_string("xxxxxxx");
        assertFalse(validator.isValid(maxBean));
    }

    @Test
    void valid_max_long() throws IllegalAccessException {
        MaxBean maxBean = new MaxBean();
        maxBean.set_long(3);
        assertTrue(validator.isValid(maxBean));
        maxBean.set_long(7);
        assertFalse(validator.isValid(maxBean));
    }

    @Test
    void valid_max_float() throws IllegalAccessException {
        MaxBean maxBean = new MaxBean();
        maxBean.set_float(3);
        assertTrue(validator.isValid(maxBean));
        maxBean.set_float(7);
        assertFalse(validator.isValid(maxBean));
    }

    @Test
    void valid_max_double() throws IllegalAccessException {
        MaxBean maxBean = new MaxBean();
        maxBean.set_double(3);
        assertTrue(validator.isValid(maxBean));
        maxBean.set_double(7);
        assertFalse(validator.isValid(maxBean));
    }
}
