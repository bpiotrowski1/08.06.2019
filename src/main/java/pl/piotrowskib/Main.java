package pl.piotrowskib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Podaj liczbe elementow: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i<5;i++) {
            list.add(rand.nextInt(100));
        }

        wypisz(list);
        wypiszSrednia(list);
    }

    private static void wypisz(List list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    private static void wypiszSrednia(List<Integer> list) {
        Integer suma = 0;
        for (Integer o : list) {
            suma += o;
        }
        System.out.println(suma / list.size());
    }
}
