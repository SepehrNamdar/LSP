package com.codurance.lsp;

public class FillingStation {

    public void refuel(Vehicle vehicle) {
        //if (vehicle instanceof PetrolCar) {
            vehicle.charge();
        //}
    }

    public void charge(Vehicle vehicle) {
        //if (vehicle instanceof ElectricCar) {
            vehicle.charge();
        //}
    }
}
