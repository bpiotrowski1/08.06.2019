package pl.piotrowskib;

import java.util.ArrayList;
import java.util.List;

public class MainZad3 {
    public static void main(String[] args) {
        List<Student> studenci = new ArrayList<>();

        Student student = new Student("123456", "Jan", "Kowalski", Gender.MALE);
        studenci.add(new Student("123456", "Jan", "Kowalski", Gender.MALE));
        studenci.add(new Student("654321", "Janka", "Nowak", Gender.FEMALE));
        studenci.add(new Student("123321", "Janek", "Nowak", Gender.MALE));
        studenci.add(new Student("654456", "Janek", "Kowalski", Gender.MALE));

        for (Student value : studenci) {
            System.out.println(value);
        }
        System.out.println("\nTylko kobiety: ");
        for (Student value : studenci) {
            if (value.getPlec() == Gender.FEMALE) {
                System.out.println(value.getImie() + " " + value.getNazwisko());
            }
        }
        System.out.println("\nTylko mezczyzni: ");
        for (Student value : studenci) {
            if (value.getPlec() == Gender.MALE) {
                System.out.println(value.getImie() + " " + value.getNazwisko());
            }
        }
        System.out.println("\nIndeksy: ");
        for (Student value : studenci) {
            System.out.print(value.getIndeks() + " ");
        }
    }
}
