package sky.pro.java;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] salary = generateRandomArray();
        System.out.println("Task №1:");
        System.out.printf("Сумма всех выплат за месяц равна: %d рублей \n", getSum(salary));

        System.out.print("Task №2: \n");
        System.out.printf("Минимальная трата за месяц равна: %d рублей \n", min_Spending(salary));
        System.out.printf("Максимальная трата за месяц равна: %d рублей \n", max_Spending(salary));
        System.out.print("Task №3: \n");
        System.out.printf("Средняя сумма трат за месяц равна: %.2f рублей \n", average_Spending(salary));

        System.out.print("Task №4: \n");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverse(reverseFullName);
        System.out.println();

        System.out.print("Task №5: \n");
        matrix();

        System.out.print("Task №6: \n");
        int[] number = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(number));
        from_End_to_Start(number);
        System.out.println(Arrays.toString(from_End_to_Start(number)));

        System.out.print("Task №7: \n");
        System.out.println("При помощи метода Array.sort \n" + Arrays.toString(array_sort_method(number)));

        System.out.print("Task №8: \n");
        int[] num = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(transformation(num)));

        System.out.print("Task №9: \n");
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(array));
        System.out.println("Из массива выше найти сумму двух чисел равную -2:");
        find_a_couple(array);

        System.out.print("Task №10: \n");
        System.out.println(Arrays.toString(array));
        System.out.println("Из массива выше найти пары всех чисел, дающих в сумме -2:");
        find_All_couple(array);

    }
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    //Task1:
    /* Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    в формате: «Сумма трат за месяц составила … рублей». */
    public static int getSum(int[] arr) {
        int sum=0;
        for (int i= 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //Task2:
    /*Следующая задача — найти минимальную и максимальную трату за день.
    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    в формате: «Минимальная сумма трат за день составила … рублей.
    Максимальная сумма трат за день составила … рублей».*/
    public static int min_Spending(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
            min=arr[i];}
        } return min;
    }
    public static int max_Spending(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
            max=arr[i];}
        } return max;
    }
    //Task3:
    /*А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
    Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат
    за месяц поделить на количество дней), и вывести в консоль результат в формате:
    «Средняя сумма трат за месяц составила … рублей».
    **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).*/
    public static double average_Spending(int[] arr){
        double average = 0;
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
            average = total / arr.length;
        }
        return average;
    }
    //Task4:
    /*В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться
     в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ». Данные с именами
     сотрудников хранятся в виде массива символов (char[]). Напишите код, который в случае такого бага будет
     выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
     char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
     В результате в консоль должно быть выведено "Ivanov Ivan".
     **Важно**: не используйте дополнительные массивы для решения этой задачи.
     Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.*/
    public static void reverse(char[] reverseFullName){
        for (int i = reverseFullName.length-1; i >=0 ; i--){
            System.out.print(reverseFullName[i]);
        }
    }

    /* Усложненные задачи */

    //Task5:
    /* Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте
    ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле. Для печати следует использовать следующий код:
    for (int[] row : matrix) {
        for (int column : row) {
            System.out.print(column + " ");
        }
        System.out.println(); */
    public static void matrix() {
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               if((i==j) || (i+j==2)){
                   array[i][j]=1;
               }
            }
        }
        for (int[] row : array) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
    //Task6:
    /* У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
    Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
    Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
    Нам дан массив чисел: {5, 4, 3, 2, 1}
    Необходимо привести его к виду: {1, 2, 3, 4, 5}
    Решите задачу с использованием дополнительного массива.
    Напечатайте массив до преобразования и после с помощью
    System.out.println(Arrays.toString(arr)); */
    public static int[] from_End_to_Start(int[] number) {
        int[] number_one = new int[number.length];
        for (int i = 0; i < number.length; i++)
            number_one[i] = number[number.length-i-1];
        return number_one;
    }
    //Task7:
    // при помощи метода Array.sort
    public static int[] array_sort_method(int[] number) {
        Arrays.sort(number); // метод, сортирующий элементы массива по возрастанию
        return number;
    }
    //Task №8:
    public static int[] transformation(int[] num) {
        /* Это задание не на сортировку.
         Не использовать Arrays.sort() и другие способы сортировок.
         Числа в порядке убывания даны исключительно для указания направления чтения.
         Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5. */
        int [] copy =Arrays.copyOf(num,num.length);
        for (int i = 0; i < num.length/2; i++){
            int transform = copy[i];
            copy[i] = copy[num.length-i-1];
            copy[num.length-i-1]=transform;
        }return copy;
    }

    //Task №9: / *Знаю,что на собеседовании такой метод не подойдет, но пока таким способом */
    public static int find_a_couple(int[] array) {
        /* Задача, которая используется/бывает/встречается на собеседованиях.
        Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        Необходимо найти два числа, сумма которых равна −2.
        Напечатать эти числа в консоль.
        Подсказка
        Может потребоваться отсортировать массив с помощью Arrays.sort(arr). */
        int result = -2;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == result) {
                    System.out.println(array[i] + "+" + array[j] + "=" + result);
                }
            }
            break;
        }
        return result;
    }

    //Task №10: / *Знаю,что на собеседовании такой метод не подойдет, но пока таким способом */
    public static int find_All_couple(int[] array){
        /*Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.*/
       int result = -2;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == result) {
                    System.out.println(array[i] + "+" + array[j] + "=" + result);
                }
            }
        }
        return result;
    }
}





