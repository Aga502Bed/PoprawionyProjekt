package models;
import interfaces.BMICalculator;
public class Female extends Person implements BMICalculator {
    public Female(String name, int age) {
        super(name, age, 'K');
    }

    @Override
    public double calculateBMI(double weight, double height) {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }
}
