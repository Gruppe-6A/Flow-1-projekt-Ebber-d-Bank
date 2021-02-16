import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private List<Transaction> transactions;
    private Customer customer;

    public Account(Customer customer) {
        this.transactions = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getBalance(){
        int sum = 0;
        for (Transaction transaction : transactions) {
            sum += transaction.getAmount();
        }
        return sum;
    }

    public int withDrawAmount(int amount) throws BankException, IOException {

        if (getBalance() < amount){
            throw new BankException("Du forsøger at hæve et beløb som er større end din saldo");
        } else if (amount <= 0) {
            throw new BankException("Du kan ikke hæve et beløb som er 0 eller negativt");
        }
        transactions.add(new Transaction(-amount, new Date() ));
        System.out.println(getBalance());
        return getBalance() ;
    }

    public int depositAmount(int amount) throws BankException, IOException {
        if (amount <= 0){
            throw new BankException("Du kan ikke indsætte et beløb som er 0 eller negativt");
        }
        transactions.add(new Transaction(amount, new Date()));
        System.out.println(getBalance());
        return getBalance();

    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
