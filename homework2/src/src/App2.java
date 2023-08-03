package src;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int n = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int m = scanner.nextInt();
        scanner.close();
        if (m == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            System.out.println(n/m);
        }
    }
    
}
