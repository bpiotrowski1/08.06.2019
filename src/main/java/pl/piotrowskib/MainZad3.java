package pl.piotrowskib;

import java.util.ArrayList;
import java.util.List;

public class MainZad3 {
    public static void main(String[] args) {
        List<Student> studenci = new ArrayList<>();

        Student student = new Student(123456, "Jan", "Kowalski");
        studenci.add(new Student(123456, "Jan", "Kowalski"));
        studenci.add(new Student(654321, "Jan", "Nowak"));
        studenci.add(new Student(123321, "Janek", "Nowak"));
        studenci.add(new Student(654456, "Janek", "Kowalski"));

        for (int i = 0; i < studenci.size(); i++) {
            System.out.println(studenci.get(i));
        }
        System.out.println("Indeksy: ");
        for (int i = 0; i < studenci.size(); i++) {
            System.out.print(studenci.get(i).getIndeks() + " ");
        }
    }
}
