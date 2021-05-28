package homework;

public class Task1 {

    /*
       Задание 1
Дано два числа, нужно вывести в консоль их сумму, но если числа одинаковые, то нужно
вывести их произведение.
        */

    public static void task1(int a, int b) {

        if (a == b) {
            System.out.println(a * b);
        } else {
            System.out.println(a + b);
        }
    }

     /*
        Задание 2
У нас есть громко говорящий попугай. Если он кричит с 7 часов утра до 20 часов то все
ОК. Если вне этого диапазона то не ОК.
        */

    public static void task2(boolean parrot, int time) {
        boolean result = false;
        int startTime = 7;
        int endTime = 20;

        if (parrot) {
            if ((time >= 7 && time < 20)) {
                result = true;
            }
            System.out.println(result);
        } else {
            result = true;
            System.out.println(result);
        }
    }


    /*
        Задание 3
Дано два числа, вывести true если одно из чисел равно 10 или их сумма равна 10.
         */

    public static void task3(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            System.out.println(true);
        }

    }

    /*
        Задание 4
Дано два числа и параметр negative:
int a;
int b;
boolean negative;

Вернуть true если одно из чисел отрицательное. За исключением когда параметр negative
равен true, тогда нужно вернуть true только если оба числа отрицательные.
         */
    public static boolean task4(int a, int b, boolean negative) {
        boolean result = false;
        if (negative && (a < 0 && b < 0)) {
            result = true;
        } else if (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0))) {
            result = true;
        }
        return result;
    }


    /*
        Задание 5
Вернуть true если заданное число кратно 3 или кратно 5 (делится без остатка).
Используйте % оператор.
         */

    public static boolean task5(int a) {
        boolean divide = false;
        if (a % 3 == 0 || a % 5 == 0) {
            divide = true;
        }
        return divide;
    }

    /*
       Задание 6

Дано две температуры, если одна из температур ниже 0 а другая выше 120 то вернуть
true.
(120, -1) → true
(-1, 120) → true
(2, 120) → false
        */



    public static boolean task6(int temp1, int temp2) {
        boolean temp = false;
        if (temp1 < 0 && temp2 >= 120) {
            temp = true;
        } else if (temp1 >= 120 && temp2 < 0) {
            temp = true;
        }
        return temp;
    }


    /*
        Задание 7
Вывести сумму всех четных чисел от 0 до 112 включительно;
         */

    public static void task7() {
        int sum = 0;
        for (int i = 1; i <= 112; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    /*
        Задание 8
Посчитать факториал числа от 1 до 15.
Например: факториал 5 = 1*2*3*4*5 = 120
         */


    public static void task8() {
        long result = 1;
        for (int i = 1; i <= 15; i++) {
            result = result * i;
            System.out.println("factorial " + i + "! = " + result);
        }
    }

    /*
       Задание 9
Дано два числа. Вывести диапазон чисел в порядке возрастания если первое число
меньше второго и в порядке убывание если первое число больше воторого.

Пример:
(1, 9) -> 1, 2, 3, 4, 5, 6, 7, 8, 9
(5, 2) -> 5, 4, 3, 2

        */
    public static void task9(int a, int b) {

        if (a < b) {
            for (int i = a; i < b; i++) {
                System.out.print(i + ", ");
            }
            System.out.println(b);
        } else if (a > b) {
            for (int i = a; i > b; i--) {
                System.out.print(i + ", ");
            }
            System.out.println(b);
        }
    }


    /*
       Задание 10

Вывести в консоль все простые числа от 2 до 1_000_000.
Просто́е число́ — это натуральное число, больше единицы, имеющее ровно два
натуральных делителя: 1 и само себя.
        */
    public static void task10() {
        for (int i = 2; i < 1000000; i++) {
            int k = 0;

            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0)
                    k++;
            }
            if (k < 2)
                System.out.print(i + " - Просто́е число; ");
        }
    }

    public static void main(String[] args) {
/*
       Задание 1
Дано два числа, нужно вывести в консоль их сумму, но если числа одинаковые, то нужно
вывести их произведение.
        */
        System.out.println("Задание 1");

        task1(4, 6);
        task1(5, 5);

        /*
        Задание 2
У нас есть громко говорящий попугай. Если он кричит с 7 часов утра до 20 часов то все
ОК. Если вне этого диапазона то не ОК.
        */
        System.out.println("Задание 2");
        task2(true, 8);
        task2(true, 21);
        task2(false, 8);
        task2(false, 21);

        /*
        Задание 3
Дано два числа, вывести true если одно из чисел равно 10 или их сумма равна 10.
         */
        System.out.println("Задание 3");
        task3(10,5);
        task3(6,4);
        task3(6,9);

        /*
        Задание 4
Дано два числа и параметр negative:
int a;
int b;
boolean negative;

Вернуть true если одно из чисел отрицательное. За исключением когда параметр negative
равен true, тогда нужно вернуть true только если оба числа отрицательные.
         */
        System.out.println("Задание 4");
        System.out.println(task4(-1,-1,true));
        System.out.println(task4(1,-1,false));
    /*
        Задание 5
Вернуть true если заданное число кратно 3 или кратно 5 (делится без остатка).
Используйте % оператор.
         */
        System.out.println("Задание 5");
        System.out.println(task5(9));
        System.out.println(task5(15));
        System.out.println(task5(25));

         /*
       Задание 6

Дано две температуры, если одна из температур ниже 0 а другая выше 120 то вернуть
true.
(120, -1) → true
(-1, 120) → true
(2, 120) → false
        */
        System.out.println("Задание 6");
        System.out.println(task6(120, -1));
        System.out.println(task6(-1, 120));
        System.out.println(task6(2, 120));


        /*
        Задание 7
Вывести сумму всех четных чисел от 0 до 112 включительно;
         */
        System.out.println("Задание 7");
        task7();

/*
        Задание 8
Посчитать факториал числа от 1 до 15.
Например: факториал 5 = 1*2*3*4*5 = 120
         */
        System.out.println("Задание 8");
        task8();

        /*
       Задание 9
Дано два числа. Вывести диапазон чисел в порядке возрастания если первое число
меньше второго и в порядке убывание если первое число больше воторого.

Пример:
(1, 9) -> 1, 2, 3, 4, 5, 6, 7, 8, 9
(5, 2) -> 5, 4, 3, 2

        */
        System.out.println("Задание 9");
        task9(1, 9);
        task9(5, 2);



        System.out.println("Задание 10");
         /*
       Задание 10

Вывести в консоль все простые числа от 2 до 1_000_000.
Просто́е число́ — это натуральное число, больше единицы, имеющее ровно два
натуральных делителя: 1 и само себя.
        */
        task10();

    }








}


