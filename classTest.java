/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classtest;
interface ICar {
    double getPrice();
}

abstract class CarRent implements ICar {
    protected String type;
    protected String color;
    public CarRent(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public abstract double getPrice();
    public String toString() {
        return " "+ type + " " + color + " " + getPrice();
    }
}

class Days extends CarRent {
    private int noOfDays;
    public Days(String type, String color, int noOfDays) {
        super(type, color);
        this.noOfDays = noOfDays;
    }

    public double getPrice() {
        return noOfDays * 100;
    }
    public String toString() {
        return super.toString() + "" + noOfDays;
    }
}
class Months extends CarRent {
    private int noOfMonths;

    public Months(String type, String color, int noOfMonths) {
        super(type, color);
        this.noOfMonths = noOfMonths;
    }

    public double getPrice() {
        return noOfMonths * 1500;
    }

    public String toString() {
        return super.toString() + "" + noOfMonths;
    }
}

public class classTest {
    public static void main(String[] args) {
        CarRent rentByDays = new Days("Sedan", "Red", 5);
        CarRent rentByMonths = new Months("SUV", "Black", 2);
        System.out.println(rentByDays.toString());
        System.out.println(rentByMonths.toString());
    }
}