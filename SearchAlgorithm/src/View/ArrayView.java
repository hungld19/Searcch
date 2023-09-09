/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LAPTOP DELL
 */
public class ArrayView {

    private Scanner scanner = new Scanner(System.in);

    public int[] getInputArray() {
        System.out.print("Enter num of array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.print("Enter minimum value for random numbers: ");
        int min = scanner.nextInt();

        System.out.print("Enter maximum value for random numbers: ");
        int max = scanner.nextInt();

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    public int getInputSearchValue() {
        System.out.print("Enter search value: ");
        return scanner.nextInt();
    }

    public void displayArray(int[] array) {
        System.out.print("The array [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void displaySearchResult(int value, int index) {
        System.out.println("Found " + value + " at index : " + index);
    }

    public void displaySortedArray(int[] array) {
        System.out.print("Sorted array [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public int getInputChoice() {
        System.out.print("1. Linear search\n2. Binary search algorithm.\n3: Exit\nEnter your choice: ");
        return scanner.nextInt();
    }
}
