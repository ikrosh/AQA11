package org.lesson4;

public class Util {

    static void getSum(int[] mas) {
        int sum = 0;
        for (int el : mas) {
            if (el > 5 && el < 45) sum = sum + el;
        }
        System.out.println("Cуммa всех чисел больше 5 и меньше 45: " + sum);
    }

    static void getPozitiveNumbers(int[] mas) {
        System.out.println("Четные положительные числа: ");
        for (int el : mas) {
            if (el > 0 && el % 2 == 0)
                System.out.println(el);
        }
    }

}