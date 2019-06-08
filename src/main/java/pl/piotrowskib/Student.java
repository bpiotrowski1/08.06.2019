package pl.piotrowskib;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Student {
    @Getter private String indeks;
    @Getter private String imie;
    @Getter private String nazwisko;
    @Getter private Gender plec;
    @Getter private List<Double> listaOcen;

    Student(String indeks, String imie, String nazwisko, Gender plec) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.listaOcen = new ArrayList<>();
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
