package com.company;

import com.sun.source.doctree.SummaryTree;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] array = {9.2, 3.6, -6.5, -6.3, 0.5, -5.4, 2.3, -3.6, 5.67, 1.34,
                -0.6, 0.08, -3.45, -6.78, -0.37};

        int counter = 0;
        double sum = 0;
        boolean firstNegative = false;

        for (double number : array) {
            if (number > 0 && firstNegative) {
                counter++;
                sum += number;
            } else if (number < 0) {
                firstNegative = true;
            }
        }
        System.out.println(Arrays.toString(array) + " = " + sum + " / " + counter + " = " + sum / counter);

        System.out.println("-----------------------------------------------------------------------------------------");
        sort(array);
    }

    public static void sort(double[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }

    }


}
   /*
ДЗ на сообразительность:
Вам необходимо написать следующий алгоритм сортировки массива по возрастанию:
каждую итерацию выбирать самый минимальный элемент и смещать его в начало.
 При этом каждую новую итерацию начинать сдвигаясь вправо, то есть первый проход — с первого элемента,
  второй проход — со второго и т.д.
И при каждой итерации распечатывать текущее состояние массива
{-4, -2, 2, 3, 6, 8}
Дэдлайн 07.08.2021 23 59*/