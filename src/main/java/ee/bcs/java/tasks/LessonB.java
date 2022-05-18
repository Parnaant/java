package ee.bcs.java.tasks;

import java.util.Scanner;

public class LessonB {

    public static void main(String[] args) {
        // TODO kasuta scannerit nii, et mainist oleks võimalik kõiki meetodeid välja kutsuda
        // Täpselt nii nagu Lesson 1 main meetod
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) checkorder");
        System.out.println("2) checkequal");
        System.out.println("3) issmall");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("sisesta esimene number");
            int a = scanner.nextInt();
            System.out.println("sisesta teine number");
            int b = scanner.nextInt();
            System.out.println("sisesta kolmas number");
            int c = scanner.nextInt();
          checkOrder(a,b,c);

        } else if (choice == 2) {
            System.out.println("sisesta esimene number");
            int a = scanner.nextInt();
            System.out.println("sisesta teine number");
            int b = scanner.nextInt();
            System.out.println("sisesta kolmas number");
            int c = scanner.nextInt();
            System.out.println(checkEqual(a,b,c));


        } else if (choice == 3) {
            System.out.println("sisesta mingi number");
            int a = scanner.nextInt();
            System.out.println();


        } else {

        }


    }

    public static void checkOrder(int a, int b, int c) {
        // Print "increasing" if c > b > a
        // Print "decreasing" if c < b < a
        // Print "neither" if none of them is true
        if (c > b && b > a) {
            System.out.println("increasing");
        } else if (c < b && b < a) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }
    }


    public static boolean checkEqual(int a, int b, int c) {
        // return true if all 3 parameters are the same
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSamll(int a) {
        // return true if the absolute number of a is smaller than 1000
        if (a > (-1000) && a < 1000) {
            return true;
        } else {
            return false;
        }
    }


}
