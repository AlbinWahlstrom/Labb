package com.company.Uppgift2;

public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Cars reliableCar = carFactory.carMaker(CarBrand.RELIABLE);
        Cars driftCar = carFactory.carMaker(CarBrand.DRIFT);
        Cars coolCar = carFactory.carMaker(CarBrand.COOL);

        reliableCar.carChoice();
        //driftCar.carChoice();
        //coolCar.carChoice();

    }

}
