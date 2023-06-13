
//Agata Bednarska 71560 INLS2//



import models.Female;
import models.Male;
import models.Person;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();

        System.out.print("Podaj wiek: ");
        int age = scanner.nextInt();

        System.out.print("Podaj płeć (M - mężczyzna / K - kobieta): ");
        char gender = scanner.next().charAt(0);

        //użytkownik podaje swoje dane, które odczytuje komputer i je zapamiętuje

        Person person;   //na podstawie danych wprowadzonych przez użytkownika,
        //jesli uzytkownik wpisze M - program tworzy obiekt Mężczyzna, Male
        //jeśli użytkownik wpisze K - program tworzy obiekt Kobieta, Female
        //jeśli użytkownik wpisze inną literę - program wypisuje błąd
        if (gender == 'M') {
            person = new Male(name, age);
        } else if (gender == 'K') {
            person = new Female(name, age);
        } else {
            System.out.println("Błąd. Wpisz M lub K.");
            return;
        }

        System.out.print("Waga (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Wzrost (cm): ");
        double height = scanner.nextDouble();

        double bmi = person.calculateBMI(weight, height);
        String category = getCategory(bmi);   //getCategory - określanie kategorii BMI na podstawie obliczeń

        //program wyświetla informacje o użytkowniku, które podał wcześniej plus wyświetla wynik obliczeń
        System.out.println(" ");
        System.out.println("Imię: " + person.getName());
        System.out.println("Wiek: " + person.getAge());
        System.out.println("Płeć: " + person.getGender());
        System.out.println("BMI: " + bmi);
        System.out.println("Wynik: " + category);

        scanner.close();
    }

    //switch użyte w celu określenia kategorii BMI na podstawie podanych przez programiste progów
    public static String getCategory(double bmi) {
        int category = 0;

        if (bmi <= 16.9) {   //jeśli BMI jest mniejsze/wieksze lub równe to daj kategorie...
            category = 1;
        } else if (bmi <= 18.5) {
            category = 2;
        } else if (bmi <= 24.9) {
            category = 3;
        } else if (bmi <= 29.9) {
            category = 4;
        } else {
            category = 5;
        }

        switch (category) {   //jeśli BMI jest kategorii to wypisz...
            case 1:
                return "Wychudzenie - zalecany lekarz :(";
            case 2:
                return "Niedowaga ;(";
            case 3:
                return "Waga w normie :D";
            case 4:
                return "Nadwaga :/";
            case 5:
                return "Otyłość - zalecany lekarz :(";
            default:
                return "Nieznana kategoria";
        }
    }

}







