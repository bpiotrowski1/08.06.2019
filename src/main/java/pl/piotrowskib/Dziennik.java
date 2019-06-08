package pl.piotrowskib;

import java.util.*;

public class Dziennik {
    private Map<String, Student> listaStudentow = new HashMap<>();

    private void dodajStudenta(Student student) {
        listaStudentow.put(student.getIndeks(), student);
    }

    private void usunStudenta(Student student) {
        listaStudentow.remove(student.getIndeks());
    }

    private void usunStudenta(String indeks) {
        listaStudentow.remove(indeks);
    }

    private Optional<Student> zwrocStudenta(String indeks) {
        if(listaStudentow.containsKey(indeks)) {
            return Optional.ofNullable(listaStudentow.get(indeks));
        }
        return Optional.empty();
    }

    private Student zwrocStudenta2(String indeks) throws StudentNotFoundException {
        if(listaStudentow.containsKey(indeks)) {
            return listaStudentow.get(indeks);
        }
        throw new StudentNotFoundException("Nie znaleziono studenta");
    }

    private double podajSredniaStudenta(String indeks) throws StudentNotFoundException {
        double sum = 0.0;

        Student s = zwrocStudenta2(indeks);
        for(double ocena: s.getListaOcen()) {
            sum+=ocena;
        }
        return sum / s.getListaOcen().size();

//        Optional<Student> s = zwrocStudenta(indeks);
//        if(s.isPresent()) {
//            Student student = s.get();
//            int suma = 0;
//            if (student.getListaOcen() != null) {
//                for (int i = 0; i < student.getListaOcen().size(); i++) {
//                    suma += student.getListaOcen().get(i);
//                }
//            }
//            return suma / student.getListaOcen().size();
//        } else {
//            return 0;
//        }
    }

    private List<Student> podajStudentowZagrozonych() {
        List<Student> zagrozeni = new ArrayList<>();

        for(String indeks : listaStudentow.keySet()) {
            try {
                if(podajSredniaStudenta(indeks) <= 2.0) {
                    zagrozeni.add(listaStudentow.get(indeks));
                }
            } catch (StudentNotFoundException e) {
                System.out.println("Błąd, nie mozna bylo znalezc studenta");
            }
        }

        return zagrozeni;
    }

    private List<Student> posortujStudentow() {
        List<Student> posortowani = new ArrayList<>(listaStudentow.values());

        posortowani.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int indeks1 = Integer.parseInt(o1.getIndeks());
                int indeks2 = Integer.parseInt(o2.getIndeks());

                return Integer.compare(indeks1, indeks2);
            }
        });
    }
}
