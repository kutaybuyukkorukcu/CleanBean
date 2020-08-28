package com.cleanbean.beans;

import com.cleanbean.size.Size;

public class SizeBean {

    @Size(min = 5, max = 15)
    private int _int;

    public int get_int() {
        return _int;
    }

    public void set_int(int _int) {
        this._int = _int;
    }
}
