package pl.piotrowskib;

import java.util.ArrayList;
import java.util.List;

public class Dziennik {
    private List<Student> listaStudentow;

    private void dodajStudenta(Student student) {
        listaStudentow.add(student);
    }

    private void usunStudenta(Student student) {
        listaStudentow.remove(student);
    }

    private void usunStudenta(String indeks) {
        for (Student s : listaStudentow) {
            if (s.getIndeks().equals(indeks)) {
                listaStudentow.remove(s);
            }
        }
    }

    private Student zwrocStudenta(String indeks) {
        for (Student s : listaStudentow) {
            if (s.getIndeks().equals(indeks)) {
                return s;
            }
        }
        return null;
    }

    private double podajSredniaStudenta(String indeks) {
        Student student = zwrocStudenta(indeks);
        int suma = 0;
        if(student.getListaOcen() != null) {
            for (int i = 0; i < student.getListaOcen().size(); i++) {
                suma += student.getListaOcen().get(i);
            }
        }
        return suma / student.getListaOcen().size();
    }

    private List<Student> podajStudentowZagrozonych() {
        List<Student> zagrozeni = new ArrayList<>();
        for(Student s:listaStudentow) {
            if(podajSredniaStudenta(s.getIndeks()) < 3.0) {
                zagrozeni.add(s);
            }
        }
        return zagrozeni;
    }
}
