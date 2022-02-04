package com.company.Uppgift2;

public class CarFactory {

   public Cars carMaker(CarBrand carBrand){
       return switch (carBrand){
           case RELIABLE -> new Volvo740();
           case DRIFT -> new ToyotaCorolla();
           case COOL -> new koenigseggCC8S();
       };
   }
}
