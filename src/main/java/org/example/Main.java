package org.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
            int[][] jaggedArray = new int[5][];
            for (int i = 0; i < jaggedArray.length; i++) {
                int rowLength = 3 + 2 * i;
                jaggedArray[i] = new int[rowLength];

                for (int j = 0; j < rowLength; j++) {
                    jaggedArray[i][j] = (int) (Math.random() * 51) + 50;
                }
            }

            System.out.println("Несортированный массив");
            printJaggedArray(jaggedArray);

        for (int[] value : jaggedArray) {
            Arrays.sort(value);
        }
            System.out.println("Отсортированный массив");
            printJaggedArray(jaggedArray);

        }
        public static void printJaggedArray(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }



    }
