package ee.bcs.java.tasks;


import java.util.Scanner;

// TODO kasuta if/else. Ära kasuta Math librarit
public class Lesson1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) maximum");
        System.out.println("2) miinimum");
        System.out.println("3) absoluut");
        System.out.println("4) paaris või paaritu");
        System.out.println("5) min3");
        System.out.println("6) max3");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("esimene arv");
            int a = scanner.nextInt();
            System.out.println("teine arv");
            int b = scanner.nextInt();
            int vastus = max(a, b);
            System.out.println("maximum on " + vastus);
        }
        if (choice == 2) {
            System.out.println("valik 2 esmimene arv");
            int a = scanner.nextInt();
            System.out.println("valik 2 teine arv");
            int b = scanner.nextInt();
            int vastus = min(a, b);
            System.out.println("miinimum on " + vastus);
        }
        if (choice == 3) {
            System.out.println("sisesta number");
            int a = scanner.nextInt();
            int vastus = abs(a);
            System.out.println("absoluut väärts on " + vastus);

        }
        if (choice == 4) {
            System.out.println("sisesta number");
            int a = scanner.nextInt();
            boolean vastus = isEven(a);
            System.out.println("paaris arv on " + vastus);

        }
        if (choice == 5) {
            System.out.println("number 1");
            int a = scanner.nextInt();
            System.out.println("number 2");
            int b = scanner.nextInt();
            System.out.println("number 3");
            int c = scanner.nextInt();
            int vastus = min3(a, b, c);
            System.out.println("kolmest väikseim on " + vastus);

        }
        if (choice == 6) {
            System.out.println("number 1");
            int a = scanner.nextInt();
            System.out.println("number 2");
            int b = scanner.nextInt();
            System.out.println("number 3");
            int c = scanner.nextInt();
            int vastus = max3(a, b, c);
            System.out.println("kolmest numbrist suurim on " + vastus);
        }
    }


    // TODO
    //  defineeri 3 muutujat a = 1, b = 1, c = 3
    //  Prindi välja a==b
    //  Prindi välja a==c
    //  Lisa rida a = c
    //  Prindi välja a==b
    //  Prindi välja a==c, mis muutus???
    public static void excersie0() {
        int a = 1;
        int b = 1;
        int c = 3;
        System.out.println(a == b);
        System.out.println(a == c);
        a = c;
        System.out.println(a == b);
        System.out.println(a == c);

    }

    // TODO tagasta a ja b väikseim väärtus
    public static int min(int a, int b) {
        if (a < b) {
            return a;

        } else {
            return b;
        }


    }

    // TODO tagasta a ja b suurim väärtus
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a absoluut arv
    public static int abs(int a) {
        if (a < 0) {
            return (a * -1);
        } else {
            return a;
        }
    }


    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        if (a % 2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    // TODO tagasta kolmest arvust kõige väiksem
    public static int min3(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    // TODO tagasta kolmest arvust kõige suurem
    public static int max3(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    // TODO
    //  Tagasta string mille väärtus oleks "\"\\""
    //  Trüki muutuja sisu välja
    public static String someString() {
        return "\"\\\"\\\\\"\"";

    }


}
