package com.cleanbean.beans;

import com.cleanbean.min.Min;

public class MinBean {

    @Min(min = 5)
    private byte _byte;

    @Min(min = 5)
    private short _short;

    @Min(min = 5)
    private int _int;

    @Min(min = 5)
    private String _string;

    @Min(min = 5)
    private long _long;

    @Min(min = 5)
    private float _float;

    @Min(min = 5)
    private double _double;

    public byte get_byte() {
        return _byte;
    }

    public void set_byte(byte _byte) {
        this._byte = _byte;
    }

    public short get_short() {
        return _short;
    }

    public void set_short(short _short) {
        this._short = _short;
    }

    public int get_int() {
        return _int;
    }

    public void set_int(int _int) {
        this._int = _int;
    }

    public String get_string() {
        return _string;
    }

    public void set_string(String _string) {
        this._string = _string;
    }

    public long get_long() {
        return _long;
    }

    public void set_long(long _long) {
        this._long = _long;
    }

    public float get_float() {
        return _float;
    }

    public void set_float(float _float) {
        this._float = _float;
    }

    public double get_double() {
        return _double;
    }

    public void set_double(double _double) {
        this._double = _double;
    }
}
