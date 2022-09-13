public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();



    }

    private static void task9() {
        //Напишите программу, которая выводит в консоль таблицу умножения на 2:
        int number = 0;
        int i = 0;
        while (i < 10){
            number += 2;
            i++;
            System.out.printf("2 * %d = %d\n", i, number);
        }

    }

    private static void task8() {
        //Условия задачи:
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        //Для вычисл. периода можно создать две дополнительные переменные, кот. содержат год за 200 лет до текущ. (из созданной ранее переменной) в качестве старта и 100 лет после в качестве заверш. периода расчета.
        //В результате решения задачи в консоль должен вывестись следующий результат:
        //1896
        //1975
        //2054
        System.out.println("Task_8");
        int cometTrajectory = 0;
        for (int i = 0; i <= 25; i++) {
            cometTrajectory += 79;
//            System.out.println("\nТраектория движения кометы " + cometTrajectory);
            if (cometTrajectory >= 1822 && cometTrajectory < 2122) {
                System.out.printf("За последние 200 лет комета пролетела рядом с Землёй в %d году\n", cometTrajectory);
            }
        }

    }

    private static void task7() {
        //Условия задачи:
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        //"Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        //В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        System.out.println("Task_7");
        int friday = 5;
        System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", friday);
        while (friday <= 31) {
            friday += 7;
            if (friday <= 31) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", friday);
            }
        }

    }

    private static void task6() {
        //Напишите программу, которая будет выводить Василию сумму его накоплений за следующие каждые полгода в течение 9 лет.
        //В консоль выведен результат количества месяцев и промежуточных сумм накоплений каждого 6-го месяца
        System.out.println("Task_6");
        int vasilyCash = 15_000;
        int totalSum = 0;
        int loanFor9Years = 9 * 12; // кредит на 9 лет с 7%ной ставкой от банка. (%ставки указан ниже)
        int i = 0;
        while (i < loanFor9Years) {
            totalSum += totalSum*7/100;
            totalSum += vasilyCash;
            i++;
            if (i % 6 == 0) {
                System.out.printf("Василию потребуется %d месяцев, сумма накоплений будет равна %d рублей\n", i, totalSum);
            }
        }

    }

    private static void task5() {
        //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        // Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
        System.out.println("Task_5");
        int vasilyCash = 15_000;
        int totalSum = 0;
        int i = 0;
        for (; totalSum < 12_000_000; ) {
            totalSum += totalSum*7/100;
            totalSum += vasilyCash;
            i++;
            if (i % 6 == 0) {
                System.out.printf("Василию потребуется %d месяцев, сумма накоплений будет равна %d рублей\n", i, totalSum);
            }
        }

    }

    private static void task4() {
        //Условие - Напишите программу, которая выводит в консоль сумму накоплений.
        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется ещё 7%.
        //Первоначальная сумма вклада Василия составляет 15 тысяч рублей.
        //Задание 1
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии,
        // что процент банка от накоплений не меняется, а всегда равен 7%. Выведите в консоль результат программы с указанием суммы накоплений
        // по каждому месяцу.

        System.out.println("Task_4");
        int vasilyCash = 15_000;
        int totalSum = 0;
        int i = 0;
        for (; totalSum < 12_000_000; ) {
            totalSum += totalSum*7/100;
            totalSum += vasilyCash;
            i++;
            System.out.printf("Василию потребуется %d месяцев, сумма накоплений будет равна %d рублей\n", i, totalSum);
        }

    }


    private static void task3() {
        //    В стране Y население равно 12 миллионам человек.
        //    Рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        //    Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.
        System.out.println("Task_3");
        long countryPopulationY = 12_000_000L;  //население страны млн.чел.
        int birthRatePeople = 17;              //рождаемость на 1000 чел.
        int mortalityRatePeople = 8;           //смертность на 1000 чел.
        int averageValuePeople = birthRatePeople - mortalityRatePeople;

        for (int i = 0; i < 10; ) {
           countryPopulationY += countryPopulationY * averageValuePeople / 1000;
           i++;
        System.out.printf("Год %d, численность населения составляет %d\n", i, countryPopulationY);
        }

    }

    private static void task2() {
        //Вывести в консоль с циклом for & while, каждый в отдельную строку:
        //1 2 3 4 5 6 7 8 9 10
        //10 9 8 7 6 5 4 3 2 1

        System.out.println("Task_2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.printf(" %d ", i);
        }
        System.out.println();
        int k = 11;
        for (; k > 1 ;) {
            k--;
            System.out.printf(" %d ", k);
        }

    }

    public static void task1() {
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей.
        //Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений равна … рублей"
        // с тем количеством месяцев, необходимым для накопления данной суммы.
        System.out.println("Task_1");
        int salary = 29_000;
        int totalSum = 0;
        int i = 0;
        for (; totalSum <= 2_459_000; i++){
            totalSum += totalSum / 100; // 12% годовых
            totalSum += salary;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, totalSum);
        }
    }
}