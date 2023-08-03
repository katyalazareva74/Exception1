package src;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        scanner.close();
        if (n <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Корректное число");
        }
    }
}
