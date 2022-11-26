package org.lesson3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HW3 {
    public static void main(String[] args) {

   //     создать массив типа int из 20 елементов.
   //     вывести в консоль сумму всех чисел больше 5 и меньше 45 (для подсчета использовать цикл)
   //     вывести в консоль все четные положительные числа.

        int[]  mas =  new int[20];
        System.out.println("Начальный массив: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = ThreadLocalRandom.current().nextInt(-100, 101);
        }
        System.out.println(Arrays.toString(mas));

        int sum = 0;
        System.out.println("Четные положительные числа: ");
        for (int el : mas) {
            if (el > 5 && el < 45) sum = sum + el;
            if (el > 0 && el % 2 == 0) System.out.println(el);
        }

        System.out.println("Cуммa всех чисел больше 5 и меньше 45: " + sum);
    }
}