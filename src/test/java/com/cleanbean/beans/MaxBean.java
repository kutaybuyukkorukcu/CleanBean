package com.cleanbean.beans;

import com.cleanbean.max.Max;

public class MaxBean {

    @Max(max = 5)
    private int _int;

    public int get_int() {
        return _int;
    }

    public void set_int(int _int) {
        this._int = _int;
    }
}
