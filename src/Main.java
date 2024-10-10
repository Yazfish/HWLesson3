// Домашняя работа - условные переменные.

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 \n");
        // Задача 1
        // С помощью условного оператора напишите программу,
        // которая выводит в консоль:
        // сообщение о том, что человеку 18 или больше лет;
        // сообщение, что возраст совершеннолетия еще не наступил,
        // нужно немного подождать.
        // При выполнении каждого условия программа должна выводить
        // в консоль сообщение в формате: «Если возраст человека
        // равен …, то (вывести в зависимости от результата) он
        // совершеннолетний / он не достиг совершеннолетия, нужно
        // немного подождать».

        int age = 19;
        int adultHood = 18;
        if (age >= adultHood) {
            System.out.println("Если возраст человека равен " + age +
                    " лет, то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " лет, он не достиг совершеннолетия, \n" +
                    "ему нужно немного подождать.");
        }
        System.out.println("\n Задача 2 \n");
        // Задача 2
        // Человек одевается в зависимости от температуры воздуха.
        // Напишите программу, которая выводит сообщение:
        // «На улице холодно, нужно надеть шапку» — если
        // температура ниже 5 градусов.
        // «Сегодня тепло, можно идти без шапки» — если
        // температура воздуха выше 5 градусов.
        // При выполнении каждого условия выведите
        // в консоль: «На улице … градусов, (вывести в
        // зависимости от результата) нужно надеть шапку /
        // можно идти без шапки».

        int airTemperature = 10;
        int temperature = 5;
        if (airTemperature > temperature) {
            System.out.println("Сегодня тепло, на улице "
                    + airTemperature +
                    " градусов, можно идти без шапки.");
        } else {
            System.out.println("Сегодня холодно, на улице "
                    + airTemperature +
                    " градусов, нужно надеть шапку.");
        }
        System.out.println("\n Задача 3 \n");
        // Задача 3
        // За превышение скорости водителю могут выписать штраф.
        // Напишите программу, которая сообщает водителю о том, что:
        // скорость превышена, если она больше 60 км/ч;
        // превышения скорости нет, если она меньше 60 км/ч.
        // При выполнении каждого условия программа должна выводить
        // такое сообщение: «Если скорость …, то
        // (вывести в зависимости от результата) придется
        // заплатить штраф / можно ездить спокойно».

        int carSpeed = 70;
        int maximumSpeed = 60;
        System.out.println("На этой дороге ограничение скорости в "
                + maximumSpeed +
                "км/ч.");
        if (carSpeed <= maximumSpeed) {
            System.out.println("Если скорость " + carSpeed +
                    " км/ч, то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + carSpeed +
                    " км/ч, то придется заплатить штраф.");
        }
        System.out.println("\n Задача 4 \n");
        // Задача 4
        // Напишите программу, которая помогает определить,
        // в какое учреждение нужно отправить человека в
        // зависимости от его возраста:
        // Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
        // Если человеку от 7 до 17 лет, то ему нужно ходить в школу.
        // Если человеку больше или равно 18 лет, но меньше
        // или равно 24, то его место в университете.
        // А если человеку больше 24, то ему пора ходить на работу.
        // При выполнении каждого условия программа должна
        // выводить в консоль сообщение в формате: «Если возраст
        // человека равен …, то ему нужно ходить … (в зависимости
        // от возраста дописать нужное)».

        int ageHuman = 25;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman +
                    " лет, то ему нужно ходить в детский сад.");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman +
                    " лет, то ему нужно ходить в школу.");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman +
                    " лет, то его место в университете.");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman +
                    " лет, то ему нужно ходить на работу.");
        }
        System.out.println("\n Задача 5 \n");
        // Задача 5
        // Как правило, на аттракционах действуют ограничения для детей
        // по возрасту:
        // Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        // Если ребенку больше 5, но меньше 14 лет, то он может
        // кататься только в сопровождении взрослого. Если взрослого
        // нет, то кататься нельзя.
        // Если ребенок старше 14 лет, то он может кататься без
        // сопровождения взрослого.
        // Напишите программу, которая выводит в консоль сообщение
        // в формате: «Если возраст ребенка равен …, то ему …
        // (в зависимости от возраста дописать нужное: нельзя кататься
        // на аттракционе, можно кататься на аттракционе в сопровождении /
        // без сопровождения взрослого)».

        int chaildAge = 15;
        if (chaildAge >= 5 && chaildAge < 14) {
            System.out.println("Если ребенку " + chaildAge + " лет, то ему можно " +
                    "кататься на аттракционах в сопровождении взрослых.");
        }

        if (chaildAge < 5) {
            System.out.println("Если ребенку " + chaildAge + " года, то ему нельзя" +
                    " кататься на аттракционах.");
        }
        if (chaildAge >= 14) {
            System.out.println("Если ребенку уже " + chaildAge +
                    " лет, то ему можно кататься на аттракционах " +
                    "без сопровождения.");
        }
        System.out.println("\n Задача 6 \n");
        // Задача 6
        // Вместимость одного вагона поезда — 102 человека.
        // Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        // С помощью условного оператора и конструкции else
        // напишите программу, которая выводит в консоль
        // сообщение о том, есть ли место в вагоне, сидячее или
        // стоячее, или вагон уже полностью забит.

        int passendgers = 101;
        int seatsPlase = 60;
        int totalPlase = 102;
        if (passendgers <= seatsPlase) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (passendgers > seatsPlase && passendgers < totalPlase) {
            System.out.println("В вагоне остались только стоячие места.");
        } else if (passendgers >= totalPlase) {
            System.out.println("Вагон полон, мест нет.");
        }
        System.out.println("\n Задача 7 \n");
        // Задача 7
        // Даны три числа:
        // int one;
        // int two;
        // int three;
        // С помощью условного оператора и конструкции else напишите программу,
        // которая вычисляет, какое из трех чисел бо́льшее,
        // и выводит результат в консоль.


        int one = 10;
        int two = 200;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше остальных");
        } else {
            System.out.println("Число " + three + " больше остальных");
        }

    }
}











