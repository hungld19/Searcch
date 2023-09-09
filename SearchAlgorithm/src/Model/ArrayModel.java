/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LAPTOP DELL
 */
import java.util.Arrays;

public class ArrayModel {
    private int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int searchValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void sortArray() {
        Arrays.sort(array);
    }
}