package com.codurance.lsp;

public class ElectricCar extends Vehicle{

    private static final int BATTERY_FULL = 100;
    private int batteryLevel;

//    @Override
//    public void fillUpWithFuel() {
//        throw new UnsupportedOperationException("It's an electric car");
//    }
//
//    @Override
//    public void chargeBattery() {
//        batteryLevel = BATTERY_FULL;
//    }

//    public int batteryLevel() {
//        return batteryLevel;
//    }

    @Override
    public void charge() {
        batteryLevel = BATTERY_FULL;
    }

    @Override
    public int getChargeLevel() {
        return batteryLevel;
    }
}
