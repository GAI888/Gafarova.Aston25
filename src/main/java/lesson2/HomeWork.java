package lesson2;

import java.util.Arrays;

public class HomeWork {

    /**
     * Класс для решения практического задания №2.
     */
    public static void main(String[] args) {
        //1
        printThreeWords();
        //2
        checkSumSign();
        //3
        printColor();
        //4
        compareNumbers();
        //5
        System.out.println(checkSum(1, 3));
        System.out.println(checkSum(10, 2));
        //6
        checkAndPrintNumberSign(100);
        checkAndPrintNumberSign(-100);
        //7
        System.out.println(isNegative(100));
        System.out.println(isNegative(-100));
        //8
        printString("привет", 5);
        //9
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        //10
        replaceArray();
        //11
        fillArray();
        //12
        multiplyArray();
        //13
        createAndFillSquareArray();
        //14
        System.out.println(Arrays.toString(createArray(10, 10)));
    }

    /**
     * Метод выводит в консоль три слова Orange, Banana, Apple в столбец.
     */
    public static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    /**
     * Метод для сложения двух чисел, если сумма положительная вывод в консоли - "Сумма положительная"
     * если сумма отрицательная - "Сумма отрицательная"
     */
    public static void checkSumSign() {
        int a = 1;
        int b = 2;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /**
     * Метод выводит в консоль название цвета в зависимости от значения переменной value.
     */
    public static void printColor() {
        int value = 150;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /**
     * Метод сравнивает два числа и выводим результат сравнения на консоль.
     */
    public static void compareNumbers() {
        int a = 100;
        int b = 230;

        if (a >= b) {
            System.out.println("a>=b");
        } else
            System.out.println("a<b");
    }

    /**
     * Необходимо проверить, находится ли сумма двух чисел в заданном диапазоне.
     * Метод принимает два целых числа и вычисляет их сумму. Если сумма находится
     * в диапазоне от 10 до 20 (включительно), метод возвращает true. В противном случае
     * возвращается false.
     */
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /**
     * Метод принимает целое число в качестве аргумента, проверяет его знак и выводит в консоль сообщение:
     * - "переданное число положительное", если число больше или равно нулю;
     * - "переданное число отрицательное", если число меньше нуля.
     */
    public static int checkAndPrintNumberSign(int a) {
        if (a >= 0) {
            System.out.println("переданное число положительное");
        } else {
            System.out.println("переданное число отрицательное");
        }
        return a;
    }

    /**
     * Метод проверяет является ли заданное целое число отрицательным или нулём.
     */
    public static boolean isNegative(int a) {
        return a <= 0;
    }

    /**
     * Метод выводит в консоль указанную строку, указанное колличество раз.
     */
    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    /**
     * Метод определяет, является ли заданный год високосным.
     * Високосный год — это год, который кратен 4, но если он кратен 100,
     * то он также должен быть кратен 400, чтобы считаться високосным.
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    /**
     * Заменяем все элементы массива, состоящего из 1 и 0, на противоположные значения.
     */
    public static void replaceArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Метод создает и заполняет массив целых чисел длиной 100 элементов.
     */
    public static void fillArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Метод принимает массив целых чисел и удваивает значения элементов, которые меньше 6.
     */
    public static void multiplyArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Создаем и заполняем квадратный двумерный массив размером n x n.
     * В этом массиве устанавливаются единицы на главной и побочной диагоналях,
     * а остальные элементы остаются равными нулю.
     */
    public static void createAndFillSquareArray() {
        int n = 5;
        int[][] squareArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            squareArray[i][i] = 1;
            squareArray[i][n - i - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Метод создает и возвращает новый массив целых чисел заданной длины,
     * где каждый элемент массива инициализирован указанным начальным значением.
          */
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}