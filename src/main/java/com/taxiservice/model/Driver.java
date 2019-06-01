package com.taxiservice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Driver implements TaxiDriver {

   private String name;
   private String driverLicenseNum;         //строка вида "LN-XXX-XXXX-XXXX" где X это цифры, например LN-000-1122-3344
   private List<Car> assignedCars;          //список машин которые водит водитель.


   public Driver (String name, String driverLicenseNum) {

       if (!isValidDriverLic(driverLicenseNum)){
           throw new IllegalArgumentException("Not supported format. Expected format LN-XXX-XXXX-XXXX, actual " + driverLicenseNum);
       }
       this.name = name;
       this.driverLicenseNum = driverLicenseNum;
       this.assignedCars = new ArrayList<Car>();
   }

   private boolean isValidDriverLic(String driverLicenseNum){
        return Pattern.matches("LN-\\d{3}-\\d{4}-\\d{4}",driverLicenseNum);
    }

   public void attachNewCar (Car car){

            if (assignedCars.contains(car)){     // использует иквесл
                System.out.println("Such car " +car.getColor() + " " +car.getBrand() +" already attached to this driver "
                        +this.name +" " +this.driverLicenseNum );
            }
            else {
               assignedCars.add(car);
                System.out.println("Such car " +car.getColor() + " " +car.getBrand() +" successfully added to this driver "
                        +this.name +" " +this.driverLicenseNum );

            }

    }

   public void callMe() {
        System.out.println ("You called ..." + this.name);
    }
}
