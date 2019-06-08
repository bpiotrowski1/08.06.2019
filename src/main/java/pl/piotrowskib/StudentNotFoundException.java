package pl.piotrowskib;

public class StudentNotFoundException extends Throwable {
    public StudentNotFoundException(String nie_znaleziono_studenta) {
        super(nie_znaleziono_studenta);
    }
}
