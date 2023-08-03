package src1;

public class App4 {
    public static void main(String[] args) {
        BankAccount n1 = new BankAccount("Anna", 7500);
        BankAccount n2 = new BankAccount("Sonya", 3500);
        BankAccount n3 = new BankAccount("Vasya", 10000);
        BankAccount n4 = new BankAccount("Petya", 3930);
        BankAccount n5 = new BankAccount("Sergey", 8500);
        BankAccount n6 = new BankAccount("Andrey", 32000);
        Bank list1 = new Bank();
        Bank list2 = new Bank();
        Bank list3 = new Bank();
        list1.addba(n1);
        list1.addba(n2);
        list1.addba(n3);
        list1.addba(n4);
        list1.addba(n5);
        list1.addba(n6);
        System.out.println("Исходные данные для транзакций:\n");
        list1.print();
        list1.addsum(6000, n2);
        list1.downsum(8000, n1);
        list1.addsum(3000, n3);
        list1.downsum(2000, n4);
        list1.addsum(3000, n5);
        list1.downsum(3000, n6);
        int n = 0;
        for (BankAccount i : list1) {
            if (n < list1.getSize() / 2) {
                list2.addba(i);
            } else {
                list3.addba(i);
            }
            n++;
        }
        System.out.println("\nНачало транзакций:\n");
        list2.start();
        list3.start();
        try {
            list2.join();
            list3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nИтог транзакций:\n");
        list1.print();
    }
}
