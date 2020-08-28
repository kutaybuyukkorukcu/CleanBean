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
        validator = ValidatorImpl.getInstance();
    }

    @Test
    void valid_size_int() {
        SizeBean sizeBean = new SizeBean();
        sizeBean.set_int(7);
        assertTrue(validator.isValid(sizeBean));
        sizeBean.set_int(17);
        assertFalse(validator.isValid(sizeBean));
    }
}
