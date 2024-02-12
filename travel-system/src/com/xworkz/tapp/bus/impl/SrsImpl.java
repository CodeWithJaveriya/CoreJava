package com.xworkz.tapp.bus.impl;

import com.xworkz.tapp.bus.AbhiBus;

public class SrsImpl implements AbhiBus {
    @Override
    public int minBooking() {
        return 30;
    }

    @Override
    public boolean goodCondition() {
        return true;
    }
}
