package main;

public class Car {
    private String brand;
    private String model;
    private int speed;
    
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.speed = 0;
    }

    public void Status() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + " km/h");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accelerate(int change) {
        if (change < 0) {
            System.out.println("Nopeuden taytyy olla positiivinen luku.");
            return;
        }
        speed = speed + change;
    }

    public void decelerate(int change) {
        if (change < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
            return;
        }

        if (change >= speed) {
            speed = 0;
        } else {
            speed = speed - change;
        }
    }
}
