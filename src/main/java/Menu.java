import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public Menu(){

    }

    Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer("Lars");
    Account account = new Account(customer);
    public int amount;
    public void onStartup(){
        System.out.println("Indtast ID");
        scanner.nextInt();
        mainMenu();
    }
    private void mainMenu(){
        System.out.println("1) Withdraw \n2) Deposit \n3) View bankstatement \n4) Transfer money");
        choice();
    }

    private void choice() {

        switch(scanner.nextInt()){
            case 1:
                System.out.println("Hvor meget skal der hæves?");
                amount = scanner.nextInt();
                try {
                    account.withDrawAmount(amount);
                } catch (BankException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case 2:
                System.out.println("Hvor meget skal der indsættes?");
                amount = scanner.nextInt();
                try {
                    account.depositAmount(amount);
                } catch (BankException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("Det har vi ikke lavet");
                break;
            case 4:
                System.out.println("Det har vi ikke lavet2");
                break;


        }
    }
}
