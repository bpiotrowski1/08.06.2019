package pl.piotrowskib;

public class Student {
    private int indeks;
    private String imie;
    private String nazwisko;

    public Student(int indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public int getIndeks() {
        return indeks;
    }
}
