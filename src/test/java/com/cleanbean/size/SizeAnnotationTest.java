package com.cleanbean.size;

import com.cleanbean.beans.SizeBean;
import com.cleanbean.validation.Validator;
import com.cleanbean.validation.ValidatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SizeAnnotationTest {

    private Validator validator;

    // Numbers 5 (min) and 15 (max) is set for each variable

    @BeforeEach
    void before() {
        validator = new ValidatorImpl();
    }

    @Test
    void valid_size_int() {
        SizeBean sizeBean = new SizeBean();
        sizeBean.set_int(7);
        assertTrue(validator.isValid(sizeBean));
        sizeBean.set_int(17);
        assertFalse(validator.isValid(sizeBean));
    }

    @Test
    void valid_size_float() {
        SizeBean sizeBean = new SizeBean();
        sizeBean.set_float(7.2f);
        assertTrue(validator.isValid(sizeBean));
        sizeBean.set_float(17.2f);
        assertFalse(validator.isValid(sizeBean));
    }

    @Test
    void valid_size_long() {
        SizeBean sizeBean = new SizeBean();
        sizeBean.set_long(7L);
        assertTrue(validator.isValid(sizeBean));
        sizeBean.set_long(17L);
        assertFalse(validator.isValid(sizeBean));
    }

    @Test
    void valid_size_double() {
        SizeBean sizeBean = new SizeBean();
        sizeBean.set_double(7.2d);
        assertTrue(validator.isValid(sizeBean));
        sizeBean.set_double(17.2d);
        assertFalse(validator.isValid(sizeBean));
    }

    @Test
    void valid_size_string() {
        SizeBean sizeBean = new SizeBean();
        sizeBean.set_string("xxxxxxx");
        assertTrue(validator.isValid(sizeBean));
        sizeBean.set_string("xxx");
        assertFalse(validator.isValid(sizeBean));
    }
}
