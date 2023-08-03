package src1;
public class BankAccount {
    private String name;
    private int account;
    private int sum = 0;
    private int op = 0;

    public BankAccount(String name, int account) {
        this.name = name;
        this.account = account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getOp() {
        return op;
    }

    public int getSum() {
        return sum;
    }

    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void upaccount(int sum) {
        this.account = this.account + sum;
        this.sum = 0;
        this.op = 0;
    }

    public void downaccount(int sum) {
        this.account = this.account - sum;
        this.sum = 0;
        this.op = 0;
    }

    public void print() {
        System.out.print("name: " + getName() + "  account: " + getAccount() + "\n");
    }
}
