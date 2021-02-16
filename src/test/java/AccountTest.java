import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
class AccountTest {
    // Arrange: scope = virkefelt
    Customer customer1;
    Account account1;

    // Arrange
    @BeforeEach
    void setUp() {
        customer1 = new Customer("Jon");
        account1 = new Account(customer1);
    }

    @Test
    void getBalance() {
    }

    @Test
    void withDrawAmount() {
        account1.depositAmount(100);
        try {
            assertEquals(50, account1.withDrawAmount(50));
        } catch (BankException e) {
            e.printStackTrace();
        }
    }

    @Test
    void withDrawIllegalAmountTest(){
        assertThrows(BankException.class, () -> account1.withDrawAmount(100) );
    }

    @Test
    void withDrawNegativeAmountTest(){
        assertThrows(BankException.class, () -> account1.withDrawAmount(-100) );
    }

    @Test
    void depositAmount() {
        assertEquals(100, account1.depositAmount(100));  // Assert
        assertEquals(175, account1.depositAmount(75));  // Assert
    }

    @Test
    void getTransactions() {
        account1.depositAmount(100);
        account1.depositAmount(75);
        account1.depositAmount(25);
        assertEquals(3, account1.getTransactions().size());
        assertEquals(100, account1.getTransactions().get(0).getAmount());
        assertEquals(75, account1.getTransactions().get(1).getAmount());
        assertEquals(25, account1.getTransactions().get(2).getAmount());
        assertNotNull(account1.getTransactions().get(2).getDate());
    }

}*/