package com.cleanbean.beans;

import com.cleanbean.size.Size;

public class SizeBean {

    @Size(min = 5, max = 15)
    private int _int;

    @Size(min = 5, max = 15)
    private float _float;

    @Size(min = 5, max = 15)
    private long _long;

    @Size(min = 5, max = 15)
    private double _double;

    @Size(min = 5, max = 15)
    private String _string;

    public int get_int() {
        return _int;
    }

    public void set_int(int _int) {
        this._int = _int;
    }

    public float get_float() {
        return _float;
    }

    public void set_float(float _float) {
        this._float = _float;
    }

    public long get_long() {
        return _long;
    }

    public void set_long(long _long) {
        this._long = _long;
    }

    public double get_double() {
        return _double;
    }

    public void set_double(double _double) {
        this._double = _double;
    }

    public String get_string() {
        return _string;
    }

    public void set_string(String _string) {
        this._string = _string;
    }
}
