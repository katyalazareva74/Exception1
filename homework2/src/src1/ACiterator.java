package src1;
import java.util.Iterator;
import java.util.List;

public class ACiterator implements Iterator<BankAccount> {
    private int index;
    private List<BankAccount> listb;

    public ACiterator(List<BankAccount> list1) {
        this.listb = list1;
    }

    @Override
    public boolean hasNext() {
        return index < listb.size();
    }

    @Override
    public BankAccount next() {
        return listb.get(index++);
    }

}
