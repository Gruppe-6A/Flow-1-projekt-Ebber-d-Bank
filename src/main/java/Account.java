import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

   // private List<Transaction> transactions;
    private Customer customer;

    public Account(Customer customer) {
        //this.transactions = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    LocalDate ldt = LocalDate.now();
    AccountManagement accountManagement = new AccountManagement();
    importData importData1 = new importData();
    ExportData exportData = new ExportData();
    Transaction transaction;

    public int getBalance(int id) throws SQLException {
        int sum = importData1.importBalance(id);
        /*for (Transaction transaction : transactions) {
            sum += transaction.getAmount();
        }*/
        return sum;
    }

    public int withDrawAmount(int amount, int id) throws BankException, IOException, SQLException {

        if (getBalance(id) < amount){
            throw new BankException("Du forsøger at hæve et beløb som er større end din saldo");
        } else if (amount <= 0) {
            throw new BankException("Du kan ikke hæve et beløb som er 0 eller negativt");
        }
        //transactions.add(new Transaction(-amount, new Date() ));
        accountManagement.updateBalanceForWithdrawal(amount,id);
        System.out.println("Your new balance: " +getBalance(id));
        transaction = new Transaction(id, amount, ldt, "- ");
        exportData.exportTransactions(id, transaction.toString());
        return getBalance(id) ;
    }

    public int depositAmount(int amount, int id) throws BankException, IOException, SQLException {
        if (amount <= 0){
            throw new BankException("Du kan ikke indsætte et beløb som er 0 eller negativt");
        }
        //transactions.add(new Transaction(amount, new Date()));
        accountManagement.updateBalanceForDeposit(amount,id);
        System.out.println("Your new balance: " +getBalance(id));
        transaction = new Transaction(id, amount, ldt, "");
        exportData.exportTransactions(id, transaction.toString());
        return getBalance(id);

    }

    //public List<Transaction> getTransactions() {
        //return transactions;
    //}
}
