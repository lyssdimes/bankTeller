package bankteller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Collection;
import java.util.HashMap;

public class BankTest {
    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    void testMap() {
        assertNotNull(bank.getAccounts(), "no bank");
    }

    @Test
    void testGetAllAccounts() {
        Collection<Account> testAccounts;
        testAccounts = bank.getAllAccounts();
        assertEquals(bank.getAccounts().size(), testAccounts.size(), "account size didn't match");
    }

    @Test
    void testOpenNewAccount() {
        int originalSize = bank.getAccounts().size();
        Account account = new Account();
        bank.openNewAccount("test", account);
        assertEquals((originalSize + 1), bank.getAccounts().size(), "didn't add correctly");

    }

    @Test
    void testGetAccount() {
        Account account = new Account();
        bank.openNewAccount("42", account);
        assertEquals(account, bank.getAccount("42"), "didn't get the proper account");
    }

    @Test
    void testCloseAccount() {
        Account account = new Account("234", "checkings", 3434);
        bank.openNewAccount(account.getAccountNumber(), account);
        assertEquals(account, bank.getAccount("234"), "didn't get the proper account");
        bank.closeAccount("234");
        assertNull(bank.getAccount("234"));
    }
}
