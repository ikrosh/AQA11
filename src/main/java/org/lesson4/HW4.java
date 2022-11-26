package org.lesson4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HW4 {

    public static void main(String[] args) {

        /*
        Создать класс Util и 2 статических метода в нем которые принимать массив типа int
        вывести в консоль сумму всех чисел больше 5 и меньше 45 (для подсчета использовать цикл)
        вывести в консоль все четные положительные числа.
        */

        int[]  mas =  new int[20];
        System.out.println("Начальный массив: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = ThreadLocalRandom.current().nextInt(-100, 101);
        }
        System.out.println(Arrays.toString(mas));

        Util.getSum(mas);
        Util.getPozitiveNumbers(mas);
    }
}
