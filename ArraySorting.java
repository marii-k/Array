package org.example;

import java.util.Arrays;
import java.util.Random;

public class ArraySorting {
    public static void main(String[] args) {
        int n = 5;
        int[][] sortedArrays = generateAndSortArrays(n);
        printArrays(sortedArrays);

    }
    public static int[][] generateAndSortArrays(int n) {
        Random random = new Random();
        int[][] arrays = new int[n][];
        for (int i = 0; i < n; i++) {
            // Генерируем случайный размер массива
            int size = random.nextInt(n) + 1;
            arrays[i] = new int[size];
            // Заполняем массив случайными неотрицательными числами
            for (int j = 0; j < size; j++) {
                arrays[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                Arrays.sort(arrays[i]); // Сортировка по возрастанию
            } else {
                Arrays.sort(arrays[i]);
                reverseArray(arrays[i]); // Сортировка по убыванию
            }
        }
        return arrays;
    }
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArrays(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Array " + i + ": " + Arrays.toString(arrays[i]));
        }
    }
}


