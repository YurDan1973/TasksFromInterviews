//Условие этой задачи:
//        Вася работает программистом и получает 50 долл. США за каждые 100 строк кода (за последние строки, которые не дотягивают до сотни, он не получает ничего). Т.е. за 99 строк он получит 0, за 199  строк получит 50, и т.д.
//
//        За каждое третье опоздание Васю штрафуют на 20 долл. США.
//
//        Программа должна реализовать три варианта расчетов:
//
//        1) Пользователь вводит желаемый доход Васи и количество опозданий. Подсчитать, сколько строк кода (минимально) ему нужно написать, чтобы получить сумму не менее желаемого.
//
//        2) Пользователь вводит количество строк кода, написанное Васей, и желаемый объем зарплаты. Подсчитать сколько раз Вася может опоздать (максимально). Если даже без опозданий желаемую  зарплату он не получит, вывести "ERROR".
//
//        3) Пользователь вводит количество строк кода и количество опозданий. Определить, сколько заплатят Васе. Если не заплатят вообще, то вывести 0.
//
//        Сначала пользователь вводит номер варианта расчета, а потом два числа в соответствии с условием варианта (все числа целые). Например: 1 1000 4   означает первый вариант расчета, 1000 - желаемый доход, 4 - количество опозданий. Ответом должно быть минимальное количество строк кода, которое нужно написать.
//
//        Если первое число, которое вводит пользователь, не равно 1, 2 или 3 (вариант расчета), то вывести "ERROR".
//
//        Задача по сложности подобна задаче про самолет!!!
//
//        Тестовые данные
//        Номер теста	Входные данные	Выходные данные
//        1	1 1030 4	2100
//        2	2 3125 1100	68
//        3	3 2370 7	1110
//        4	5 1000 20	ERROR
//        5	1 2100 2	4200
//        6	2 500 1000	ERROR
//        7	3 500 40	0
//        8	1 5040 10	10200
//        9	1 810 50	2300
//        10	2 3423 1500	32
//        11	3 4248 11	2040
//
//        Sample Input:
//
//        1 1030 4
//        Sample Output:
//
//        2100
//
//Далее решение:

import java.util.Scanner;

import static java.lang.Math.ceil;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optionNumber = scanner.nextInt();
        int desiredIncome;
        int NumberOfDelays;
        int NumberOfRows;
        switch (optionNumber) {
            case 1:
                desiredIncome = scanner.nextInt();
                NumberOfDelays = scanner.nextInt();
                double NumberOfRows1;
                if (NumberOfDelays < 3) {
                    NumberOfRows1 = ceil((double) desiredIncome / 50) * 100;
                    System.out.println((int) NumberOfRows1);
                } else {
                    NumberOfRows1 = ceil((double) (desiredIncome + (NumberOfDelays / 3) * 20) / 50) * 100;
                    System.out.println((int) NumberOfRows1);
                }

                break;
            case 2:
                NumberOfRows = scanner.nextInt();
                desiredIncome = scanner.nextInt();
                int NumberOfDelays2;
                if (NumberOfRows >= 100 && desiredIncome >= 50) {
                    if ((NumberOfRows / 100 * 50) < desiredIncome) {
                        System.out.println("ERROR");
                    } else {
                        NumberOfDelays2 = ((NumberOfRows / 100 * 50) - desiredIncome) / 20 * 3 + 2;
                        System.out.println(NumberOfDelays2);
                    }
                } else {
                    System.out.println("ERROR");
                }
                break;
            case 3:
                NumberOfRows = scanner.nextInt();
                NumberOfDelays = scanner.nextInt();
                int desiredIncome3;
                desiredIncome3 = NumberOfRows / 100 * 50 - NumberOfDelays / 3 * 20;
                if (desiredIncome3 > 0) {
                    System.out.println(desiredIncome3);
                } else {
                    System.out.println(0);
                }
                break;
            default:
                System.out.println("ERROR");
        }
    }
}

