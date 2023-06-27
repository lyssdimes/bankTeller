package bankteller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

    private Account account;

    @BeforeEach void setUp(){
        account = new Account();
    }

    @Test void createAccount(){
        assertNotNull(account, "unable to create account");
    }

    @Test void testGetAccountNumber(){
        assertNotNull(account.getAccountNumber(), "ahhh, no account number");
    }

    @Test void testGetAccountType(){
        assertNotNull(account.getAccountType(), "no account type, do you has money?");
    }

    @Test void testGetAccountBalance(){
        assertNotNull(account.getAccountBalance(), "no account balance, do you has money?");
    }

    @Test void testConstructor(){
        Account firstAccount = new Account("3445", "saving", 567.89);
        assertEquals("3445", firstAccount.getAccountNumber(), "couldn't construct the account");
        assertEquals( 567.89, firstAccount.getAccountBalance(), "couldn't access balance");
        assertEquals("saving", firstAccount.getAccountType(), "couldn't find account type");
    }

    @Test void testDeposit(){
        account.deposit(2.00);
        assertEquals(2.00, account.getAccountBalance(), "couldn't deposit funds");
        account.deposit(5.00);
        assertEquals((7.00), account.getAccountBalance(), "couldn't deposit funds");
    }

    @Test void testWithdrawal(){
        account.withdraw(2.00);
        assertEquals(- 2, account.getAccountBalance(), "couldn't withdraw funds");
        account.withdraw(5.00);
        assertEquals(- 7, account.getAccountBalance(), "couldn't deposit funds");
    }

    @Test void testCheckAccountBalance(){
        String result;
        result = account.checkAccountBalance();
        assertNotNull(result, "couldn't find the account balance");
    }
}
