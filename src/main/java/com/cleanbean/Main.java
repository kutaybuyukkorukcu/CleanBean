package com.cleanbean;

import com.cleanbean.max.Max;
import com.cleanbean.min.Min;
import com.cleanbean.validation.Validator;
import com.cleanbean.validation.ValidatorImpl;

public class Main {

    public static void main(String[] args) {
        Bean bean = new Bean();
        bean.setMax(8);
        bean.setMin(8);

        Validator validator = ValidatorImpl.getInstance();
        boolean isValid = validator.isValid(bean);

        System.out.println(isValid);
    }


}