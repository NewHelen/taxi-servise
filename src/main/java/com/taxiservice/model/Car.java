package com.taxiservice.model;

import java.util.Date;

public abstract class Car {

    enum Type {COUPE, SEDAN, CARGO}


    private String brand;
    private String color;
    private Date releaseDate;
    private String plate;
    private Type type;


    public Car() {
    }

    public Car(String brand, String color, Date releaseDate, Type type) {
        this.brand = brand;
        this.color = color;
        this.releaseDate = releaseDate;
        this.type = type;
    }

    public abstract void callServise();

    public abstract void resilOil();

    public abstract void resilGes();

    public abstract void getLocation();


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)          // ann=lena  один одбект в другом
            return true;
        if (obj == null)          // второй обьект не нал ли
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;    // приведение типов
        if (this.getBrand() != other.getBrand())
            return false;
        if (this.getColor() != other.getColor())
            return false;
        if (this.getReleaseDate() != other.getReleaseDate())
            return false;

        return true;
    }
}
