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