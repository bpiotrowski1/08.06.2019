package pl.piotrowskib;

import java.util.*;

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

        System.out.println();
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        System.out.println(sortedList);
        System.out.println(mediana(sortedList));
        System.out.println("Max nieposortowanej: " + list.get(max(list)));
    }

    private static void wypiszSrednia(List<Integer> list) {
        double suma = 0;
        for (Integer o : list) {
            suma += o;
        }
        System.out.println(suma / list.size());
    }

    private static int mediana(List<Integer> list) {
        if (list.size() % 2 != 0) {
            return list.get(list.size() / 2);
        } else {
            return (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        }
    }

    private static int max(List<Integer> list) {
        int max = list.get(0), index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }

    private static int min(List<Integer> list) {
        int max = list.get(0), index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max > list.get(i)) {
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }
}
