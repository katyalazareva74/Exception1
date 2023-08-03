package src;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int n = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int m = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int k = scanner.nextInt();
        scanner.close();
        if (n > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        } 
        if(m < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        } 
        if((n+m) < 10) {
            throw new NumberSumException ("Сумма первого и второго чисел слишком мала");
        } 
        if(k == 0) {
            throw new  DivisionByZeroException ("Деление на ноль недопустимо");
        } 
        else {
            System.out.println("Проверка пройдена успешно");
        }
    }
    
}
