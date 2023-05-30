package ss17_string_regex.practice.account_example;

public class AccountExampleTest {
    private static AccountExample accountExample;
    private static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    private static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean checkAccount = accountExample.validate(account);
            System.out.println("Acc: " + account + " check: " + checkAccount);
        }
        for (String account : invalidAccount) {
            boolean checkAccount = accountExample.validate(account);
            System.out.println("Acc: " + account + " check: " + checkAccount);
        }
    }
}
