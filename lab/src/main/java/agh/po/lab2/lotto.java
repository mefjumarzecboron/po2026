package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class lotto {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<>();
        for (String arg : args) t.add(Integer.parseInt(arg));

        long start = System.currentTimeMillis();
        long n = 0;
        Random r = new Random();

        while (true) {
            n++;
            ArrayList<Integer> d = new ArrayList<>();
            while (d.size() < 6) {
                int x = r.nextInt(49) + 1;
                if (!d.contains(x)) d.add(x);
            }
            if (d.containsAll(t)) break;
        }

        long time = System.currentTimeMillis() - start;
        System.out.println("Liczba losowań: " + n);
        System.out.println("Czas: " + time + " ms");
    }
}
}
