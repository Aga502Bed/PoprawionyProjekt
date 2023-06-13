package models;

public abstract class Person {   //klasa abstrakcyjna "Person" - służy do tworzenia obiektów
    //Definiujue wspólne własności, które mogą być dziedziczone i wykorzystywane orzez podklasy
    private String name;   //string - tekst pisany z klawaitury a, b, c, ...
    private int age;   //int - liczby całkowite
    private char gender;   //char - pojedynczy znak z klawiatury a, b, c, ...

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public abstract double calculateBMI(double weight, double height);
    //do obliczenia BMI potrzebujemy wagi i wzrostu

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }  //public - pobierają zawartości zmiennych i pozwalają na dostęp do obiektów z Person
}
