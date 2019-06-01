package com.taxiservice;


import com.sun.deploy.ref.AppModel;
import com.taxiservice.model.Bmw;
import com.taxiservice.model.Car;
import com.taxiservice.model.Driver;
import com.taxiservice.model.TaxiDriver;

public class Runner {

    public static void main (String []args){
        Bmw bmw = new Bmw();


        TaxiDriver lena = new Driver("Lena", "LN-111-4569-1122");
        lena.callMe();


    }



}
