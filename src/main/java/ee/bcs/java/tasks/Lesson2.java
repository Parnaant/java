package ee.bcs.java.tasks;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decreasingArray(5)));
        System.out.println(Arrays.toString(generateArray(5)));
        System.out.println(Arrays.toString(yl3(8)));
        // TODO siia saab kirjutada koodi testimiseks
    }

    // TODO loo massiiv mis saab sisendiks n ja tagastab massiivi suurusega n
    // Kus esimene element on 1 ja iga järnev arv on 1 võrra suurem
    // näiteks:
    // sisend: 5
    // vastus: {1, 2, 3, 4, 5}
    public static int[] generateArray(int n) {
        int[] result = new int[n];

        int index = 0;
        while (index < n) {
            System.out.println(index);
            result[index] = index + 1;
            index = index + 1;
        }
        return result;
    }

    // TODO
    // Tagastada massiiv kus oleks numbrid n-ist 0 ini
    // Näiteks: sisend: 5
    // Väljund: 5, 4, 3, 2, 1, 0
    // Näide2: siend: -3
    // Väljund: -3, -2, -1, 0
    public static int[] decreasingArray(int n) {
        if (n > 0) {
            int[] result = new int[n + 1];
            int index = 0;
            while (index < result.length) {
                result[index] = n - index;
                index++;
            }
            return result;
        } else {
            int[] result = new int[-n + 1];
            for (int i = 0; i < result.length; i++) {
                result[i] = n + i;
            }
            return result;
        }

    }

    // TODO
    // tagasta massiiv pikkusega n, mille kõigi elementide väärtused on 3
    public static int[] yl3(int n) {
        int[] x= new int[n];
        x[n] = 3;

        System.out.println(x[n]);
        return new int[0];
    }

    // TODO tagasta massiiv milles oleks numbrid 1,2,3,4,5
    public static int[] sampleArray() {
        int[] x = new int[5];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        x[3] = 4;
        x[4] = 5;


        System.out.println(x[5]);
        return new int[5];
    }
}
