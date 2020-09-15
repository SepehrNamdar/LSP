package com.codurance.lsp;

public class FillingStation {

    public void refuel(PetrolCar vehicle) {
        if (vehicle != null) {
            vehicle.fillUpWithFuel();
        }
    }

    public void charge(ElectricCar vehicle) {
        if (vehicle != null) {
            vehicle.chargeBattery();
        }
    }
}
