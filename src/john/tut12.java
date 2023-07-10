package john;

import java.util.Scanner;

public class tut12 {
    public static void main(String[] args) {
        int[][] array = {
                {1,11,111},
                {2,22,222},
                {3,33}
        };
        System.out.println("printing the 2 dimensional array in integer");

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }

        System.out.println("printing the 2 dimensional array in strings");

        for (int j = 0; j < new String[]{"hi","hello"}.length; j++) {
            System.out.print(new String[]{"hi","hello"}[j] + "  ");
        }
        System.out.println();
        for (int j = 0; j < new String[]{"yes","yup"}.length; j++) {
            System.out.print(new String[]{"yes","yup"}[j] + "  ");
        }
        System.out.println();
        for (int j = 0; j < new String[]{"bye","toddles"}.length; j++) {
            System.out.print(new String[]{"bye","toddles"}[j] + "  ");
        }
        System.out.println();

        int[][] array2 = new int[2][2];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[1][0] = 3;
        array2[1][1] = 4;

        System.out.println(array2[0][1]);
        System.out.println(array2[1][1]);

        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
        }
        int[][] array3 = new int[2][2];

        for (int row = 0;row< array3.length;row++) {
            for (int col = 0; col < array3[row].length; col++) {
                System.out.println("enter the elements of " + row + col);
                Scanner sc = new Scanner(System.in);
                array3[row][col] = sc.nextInt();
            }
        }
        System.out.println("printing ");
        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
}
