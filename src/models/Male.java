package models;
import interfaces.BMICalculator;
public class Male extends Person implements BMICalculator {
    public Male(String name, int age) {
        super(name, age, 'M');
    }

    @Override   //override - metoda w podklasie ma zastąpić metodę nadklasy lub zasotosować metodę z interfejsu
    public double calculateBMI(double weight, double height) {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
}
