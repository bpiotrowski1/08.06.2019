package pl.piotrowskib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Podaj liczbe elementow do wylosowania: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(100));
        }

        System.out.print("Podaj liczbe elementow do wczytania: ");
        n = in.nextInt();
        System.out.println("Podaj liczby do wczytania: ");
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);
        wypiszSrednia(list);
    }

    private static void wypiszSrednia(List<Integer> list) {
        double suma = 0;
        for (Integer o : list) {
            suma += o;
        }
        System.out.println(suma / list.size());
    }
}
