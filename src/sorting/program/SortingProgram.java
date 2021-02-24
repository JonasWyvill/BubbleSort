package sorting.program;

import java.util.Scanner;

public class SortingProgram {

    public static void main(String[] args) {
        int inputamount;
        int x;
        int i;
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to be sorted?");
        inputamount = input.nextInt();
        int array[] = new int[inputamount];

        System.out.println("Enter " + inputamount + " Numbers: ");

        for (x = 0; x < inputamount; x++) {
            array[x] = input.nextInt();
        }

        bubbleSort(array);

        System.out.println("Successfully sorted.");
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void bubbleSort(int[] array) {
        int arrayone = array.length;
        int arraytwo;
        for (int i = 0; i < arrayone; i++) {
            for (int j = 1; j < (arrayone - i); j++) {
                if (array[j - 1] > array[j]) {
                    arraytwo = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = arraytwo;
                }

            }
        }

    }
}
