package sky.pro.java;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        generateRandomArray(); //посчитать сумму всех выплат за месяц
        generateRandomArray1(); //найти минимальную и максимальную трату за день
        generateRandomArray2(); //найти среднюю сумму в течение 30 дней
        task4(); //Ф.И.О. сотрудников начали отображаться в обратную сторону, сделать реверс
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
        for(int i = 0; i< arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
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
        for (int i = 0; i< arr.length; i++){
            average += arr[i]/ arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
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
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String revers =  " ";
        for (int i = reverseFullName.length-1; i >= 0 ; i--) {
            revers = (revers + reverseFullName[i]);
        }
        System.out.println(revers);
    }
}




