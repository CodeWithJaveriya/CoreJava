package com.xworkz.tapp.bus.impl;

import com.xworkz.tapp.bus.AbhiBus;

public class VrlImpl implements AbhiBus {
    @Override
    public int minBooking() {
        return 20;
    }

    @Override
    public boolean goodCondition() {
        return true;
    }
}
