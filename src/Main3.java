// Условие задачи:
//
//        Пользователь вводит целое число - номер месяца в году. Нужно вывести  название поры года на английском языке с большой буквы.
//        При неправильном номере месяца  выводится "ERROR".
//        Используйте оператор switch с лямбда - синтаксисом.
//
//        Тестовые данные
//        Номер теста	Входные данные	Выходные данные
//        1	11	Autumn
//        2	4	Spring
//        3	5	Spring
//        4	7	Summer
//        5	12	Winter
//        6	2	Winter
//        7	35	ERROR
//
//        Sample Input:
//        11
//
//        Sample Output:
//        Autumn
//
// Далее следует решение:


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // Вводим номер месяца в году
        String result = switch (n) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "ERROR";
        };
        System.out.println(result);
    }
}
