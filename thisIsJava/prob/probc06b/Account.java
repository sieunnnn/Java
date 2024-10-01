package thisIsJava.prob.probc06b;

public class Account {
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;

    private String accountNumber;
    private String name;
    private int balance;

    public Account(String accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;

        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    public void setBalance(int money) {
        int temp = balance + money;

        if (temp >= MIN_BALANCE && temp <= MAX_BALANCE) {
            balance = temp;

            if (money < 0) {
                System.out.println("결과: 출금이 성공되었습니다.");
            }
        }
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
}
