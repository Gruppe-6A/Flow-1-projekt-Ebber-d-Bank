import java.util.List;

public class Main {

    public static void main(String[] args) {

        // A1: Arrange. Instantierer nogle objekter så vi har et udgangspunkt
        Customer c1 = new Customer("Jon");
        Account account = new Account(c1);

        // A2: Act: Kør den metode, som skal testes

        int newBalance = account.depositAmount(125);

        // A3: Assert: Check om vi har fået det ønskede resultat (verifikation)
        System.out.println(String.format("Ny balance: %d", newBalance));

        newBalance = account.depositAmount(325);
        System.out.println(String.format("Ny balance: %d", newBalance));

    }
}
