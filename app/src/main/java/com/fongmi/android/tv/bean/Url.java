package com.fongmi.android.tv.bean;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

public class Url {

    private List<Value> values;
    private int position;

    public List<Value> getValues() {
        return values = values == null ? new ArrayList<>() : values;
    }

    public int getPosition() {
        return position;
    }

    public String v() {
        return v(getPosition());
    }

    public String n() {
        return n(getPosition());
    }

    public String v(int position) {
        return position >= getValues().size() ? "" : getValues().get(position).getV();
    }

    public String n(int position) {
        return position >= getValues().size() ? "" : getValues().get(position).getN();
    }

    public Url set(int position) {
        this.position = Math.min(position, getValues().size() - 1);
        return this;
    }

    public boolean isEmpty() {
        return getValues().isEmpty() || TextUtils.isEmpty(v());
    }

    public boolean isOnly() {
        return getValues().size() == 1;
    }
}
