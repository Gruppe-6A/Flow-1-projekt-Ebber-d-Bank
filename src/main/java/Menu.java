import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public int managementID = 10;
    Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer("Lars");
    Account account = new Account(customer);
    public int amount;
    int ID;
    public int onStartup() throws SQLException {
        int first = 0;
        if(first == 0) {
            System.out.println("Enter ID");
            first++;
        }
        ID = scanner.nextInt();
        if(ID == managementID){
            bankMenu();
        } else {
            System.out.println("Welcome");
            mainMenu();
        }

        return ID;
    }
    private void mainMenu() throws SQLException {
        System.out.println("1) Withdraw \n2) Deposit \n3) View bankstatement");
        choice();
    }
    private void bankMenu(){
        System.out.println("1) View account \n 2) Transfer money");
        managementChoice();
    }

    private void managementChoice(){
        switch(scanner.nextInt()){
            case 1:
                System.out.println("Enter ID on the account you wish to view.");
                //Indtast ID
                break;
            case 2:
                System.out.println("Enter ID on the account you wish to transfer from");
                //Indtast ID
                break;
        }
    }

    private void choice() throws SQLException {

        switch(scanner.nextInt()){
            case 1:
                System.out.println("How much do you wish to withdraw?");
                amount = scanner.nextInt();
                try {
                    account.withDrawAmount(amount, ID);
                } catch (BankException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
            case 2:
                System.out.println("How much do you wish to deposit?");
                amount = scanner.nextInt();
                try {
                    account.depositAmount(amount, ID);
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
