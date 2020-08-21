package com.cleanbean.min;

import com.cleanbean.beans.MinBean;
import com.cleanbean.validation.Validator;
import com.cleanbean.validation.ValidatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MinAnnotationTest {

    private Validator validator;

    // Number 5 is set for each variable

    @BeforeEach
    void before() {
        validator =  ValidatorImpl.getInstance();
    }

    @Test
    void valid_max_byte() throws IllegalAccessException {
        MinBean minBean = new MinBean();
        minBean.set_byte((byte) 3);
        assertTrue(validator.isValid(minBean));
        minBean.set_byte((byte) 7);
        assertFalse(validator.isValid(minBean));
    }

    @Test
    void valid_max_short() throws IllegalAccessException {
        MinBean minBean = new MinBean();
        minBean.set_short((short) 3);
        assertTrue(validator.isValid(minBean));
        minBean.set_short((short) 7);
        assertFalse(validator.isValid(minBean));
    }

    @Test
    void valid_max_int() throws IllegalAccessException {
        MinBean minBean = new MinBean();
        minBean.set_int(3);
        assertTrue(validator.isValid(minBean));
        minBean.set_int(7);
        assertFalse(validator.isValid(minBean));
    }

    @Test
    void valid_max_string() throws IllegalAccessException {
        MinBean minBean = new MinBean();
        minBean.set_string("xxx");
        assertTrue(validator.isValid(minBean));
        minBean.set_string("xxxxxxx");
        assertFalse(validator.isValid(minBean));
    }

    @Test
    void valid_max_long() throws IllegalAccessException {
        MinBean minBean = new MinBean();
        minBean.set_long(3L);
        assertTrue(validator.isValid(minBean));
        minBean.set_long(7L);
        assertFalse(validator.isValid(minBean));
    }

    @Test
    void valid_max_float() throws IllegalAccessException {
        MinBean minBean = new MinBean();
        minBean.set_float(3.2f);
        assertTrue(validator.isValid(minBean));
        minBean.set_float(7.2f);
        assertFalse(validator.isValid(minBean));
    }

    @Test
    void valid_max_double() throws IllegalAccessException {
        MinBean minBean = new MinBean();
        minBean.set_double(3.2d);
        assertTrue(validator.isValid(minBean));
        minBean.set_double(7.2d);
        assertFalse(validator.isValid(minBean));
    }
}
