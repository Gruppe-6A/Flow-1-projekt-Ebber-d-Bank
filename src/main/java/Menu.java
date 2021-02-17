import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public Menu(){

    }
    public int managementID = 10;
    Scanner scanner = new Scanner(System.in);
    Customer customer = new Customer("Lars");
    Account account = new Account(customer);
    public int amount;
    public int onStartup(){
        int ID;
        System.out.println("Enter ID");
        ID = scanner.nextInt();
        if(scanner.nextInt() == managementID){
            bankMenu();
        } else {
            mainMenu();
        }
        return ID;
    }
    private void mainMenu(){
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

    private void choice() {

        switch(scanner.nextInt()){
            case 1:
                System.out.println("How much do you wish to withdraw?");
                amount = scanner.nextInt();
                try {
                    account.withDrawAmount(amount);
                } catch (BankException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.println("How much do you wish to deposit?");
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
