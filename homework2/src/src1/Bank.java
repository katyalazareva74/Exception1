package src1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank extends Thread implements Iterable<BankAccount> {
    List<BankAccount> listba;
    public int size;

    @Override
    public void run() {
        for (BankAccount i : listba) {
            if (i.getOp() == 1) {
                if (i.getSum() < i.getAccount()) {
                    i.upaccount(i.getSum());
                    i.print();
                } else {
                    try {
                        i.setSum(0);
                        throw new MaxBalanceExceededException("Превышение баланса для пополнения - name: " + i.getName());
                    } catch (MaxBalanceExceededException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            if (i.getOp() == 2) {
                if (i.getSum() < i.getAccount()) {
                    i.downaccount(i.getSum());
                    i.print();
                } else {
                    try {
                        i.setSum(0);
                        throw new InsufficientFundsException("Превышение баланса для снятия - name: " + i.getName());
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }

    public Bank() {
        this.listba = new ArrayList<BankAccount>();
        size = 0;
    }

    public void addba(BankAccount ba) {
        this.listba.add(ba);
        size++;
    }

    public void addsum(int sum, BankAccount ba) {
        ba.setOp(1);
        ba.setSum(sum);
    }

    public void downsum(int sum, BankAccount ba) {
        ba.setOp(2);
        ba.setSum(sum);
    }

    public int getSize(List<BankAccount> lista) {
        return this.size;
    }

    public void print() {
        for (BankAccount i : this.listba) {
            i.print();
        }
    }

    @Override
    public Iterator<BankAccount> iterator() {
        return new ACiterator(this.listba);
    }

    public List<BankAccount> getListba() {
        return listba;
    }

    public int getSize() {
        return size;
    }

    public void setListba(List<BankAccount> listba) {
        this.listba = listba;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
