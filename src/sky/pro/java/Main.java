package sky.pro.java;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        generateRandomArray(); //посчитать сумму всех выплат за месяц
        generateRandomArray1(); //найти минимальную и максимальную трату за день
        generateRandomArray2(); //найти среднюю сумму в течение 30 дней
        task4(); //Ф.И.О. сотрудников начали отображаться в обратную сторону, сделать реверс
        task5(); //усложненные задачи
        task6(); //усложненные задачи
        task7(); //усложненные задачи
        task8();
        task9();
        task10();
    }

    int[] arr = generateRandomArray();

    /* Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    в формате: «Сумма трат за месяц составила … рублей». */
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        return arr;
    }

    /*Следующая задача — найти минимальную и максимальную трату за день.
    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    в формате: «Минимальная сумма трат за день составила … рублей.
    Максимальная сумма трат за день составила … рублей».*/
    int[] arr1 = generateRandomArray1();

    public static int[] generateRandomArray1() {
        Random random1 = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random1.nextInt(100_000) + 100_000;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();
        return arr;
    }

    /*А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
    Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат
    за месяц поделить на количество дней), и вывести в консоль результат в формате:
    «Средняя сумма трат за месяц составила … рублей».
    **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).*/
    int[] arr2 = generateRandomArray2();

    public static int[] generateRandomArray2() {
        Random random2 = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random2.nextInt(100_000) + 100_000;
        }
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i] / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();
        return arr;

    }

    public static void task4() {
        /*В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться
        в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ». Данные с именами
        сотрудников хранятся в виде массива символов (char[]). Напишите код, который в случае такого бага будет
        выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
        **Важно**: не используйте дополнительные массивы для решения этой задачи.
        Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.*/
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String revers = " ";
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            revers = (revers + reverseFullName[i]);
        }
        System.out.println(revers);
        System.out.println();
    }

    /* Усложненные задачи */


    /* Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте
    ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле. Для печати следует использовать следующий код:
    for (int[] row : matrix) {
        for (int column : row) {
            System.out.print(column + " ");
        }
        System.out.println(); */
    public static void task5() {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) { //внешний цикл идет по строкам
            for (int j = 0; j < array[i].length; j++) { //внутренний цикл идет по столбцам
                array[0][0] = array[0][2] = array[1][1] = array[2][0] = array[2][2] = 1;
                // присваивание значения 1 ячейкам по диагонали в матрице (3 на 3)
            }
        }
        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /* У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        Нам дан массив чисел: {5, 4, 3, 2, 1}
        Необходимо привести его к виду: {1, 2, 3, 4, 5}
        Решите задачу с использованием дополнительного массива.
        Напечатайте массив до преобразования и после с помощью
        System.out.println(Arrays.toString(arr)); */
    public static void task6() {
        int[] number = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(number)); // до преобразования
        /* С помощью другого массива */
        int[] number1 = number; //создали другой массив, равный number
        number1[0] = 1; // присваиваем нужные значения индексам массива
        number1[1] = 2;
        number1[2] = 3;
        number1[3] = 4;
        number1[4] = 5;
        System.out.println(Arrays.toString(number)); // после преобразования
        System.out.println();
    }

    public static void task7() {
        int[] number = {5, 4, 3, 2, 1};
        Arrays.sort(number); // метод, сортирующий элементы массива по возрастанию
        System.out.println(Arrays.toString(number));
        System.out.println();
    }

    public static void task8() {
        /* Это задание не на сортировку.
         Не использовать Arrays.sort() и другие способы сортировок.
         Числа в порядке убывания даны исключительно для указания направления чтения.
         Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5. */
        int[] num = {5, 8, 2, 3, 9};
        for (int row : num) {
            System.out.print(row + " ");
        }
        System.out.println();
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void task9() {
        /* Задача, которая используется/бывает/встречается на собеседованиях.
        Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        Необходимо найти два числа, сумма которых равна −2.
        Напечатать эти числа в консоль.
        Подсказка
        Может потребоваться отсортировать массив с помощью Arrays.sort(arr). */
        System.out.println();
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int result = -2;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == result) {
                    System.out.println(array[i] + "+" + array[j] + "=" + result);
                    return;
                }
            }
        }
    }

    public static void task10() {
        /*Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.*/
        System.out.println();
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int result = -2;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == result) {
                    System.out.println(array[i] + "+" + array[j] + "=" + result);

                }
            }
        }
    }
}



