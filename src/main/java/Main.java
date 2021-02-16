import java.util.List;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("Jon");
        Account account = new Account(c1);

        int newBalance = account.depositAmount(125);
        System.out.println(String.format("Ny balance: %d", newBalance));

        newBalance = account.depositAmount(325);
        System.out.println(String.format("Ny balance: %d", newBalance));

    }
}
