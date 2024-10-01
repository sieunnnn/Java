package thisIsJava.prob.probc06b;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accounts = new Account[100];
        Scanner sc = new Scanner(System.in);
        int number;
        int currentIdx = 0;

        while(true) {
            System.out.println("----------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택 > ");
            number = sc.nextInt();
            System.out.println("----------------------------------------------");

            if (number == 1) {
                String accountNumber;
                String name;
                int balance;

                System.out.println("계좌생성");
                System.out.println("----------------------------------------------");
                System.out.print("계좌 번호: ");
                accountNumber = sc.next();

                System.out.print("계좌주: ");
                name = sc.next();

                System.out.print("초기 입금액: ");
                balance = sc.nextInt();

                Account account = new Account(accountNumber, name, balance);
                accounts[currentIdx] = account;
                currentIdx++;

            } else if (number == 2) {
                System.out.println("계좌목록");
                System.out.println("----------------------------------------------");

                for (int i = 0; i < currentIdx; i++) {
                    System.out.println(accounts[i].getAccountNumber() + "    " + accounts[i].getName() + "    " + accounts[i].getBalance());
                }

            } else if (number == 3) {
                String accountNumber;
                int balance;

                System.out.println("예금");
                System.out.println("----------------------------------------------");
                System.out.print("계좌번호: ");
                accountNumber = sc.next();

                System.out.print("예금액: ");
                balance = sc.nextInt();

                for (int i = 0; i < currentIdx; i++) {
                    if (accounts[i].getAccountNumber().equals(accountNumber)) {
                        accounts[i].setBalance(balance);
                    }
                }

            } else if (number == 4) {
                String accountNumber;
                int balance;

                System.out.println("출금");
                System.out.println("----------------------------------------------");
                System.out.print("계좌번호: ");
                accountNumber = sc.next();

                System.out.print("출금액: ");
                balance = sc.nextInt();

                for (int i = 0; i < currentIdx; i++) {
                    if (accounts[i].getAccountNumber().equals(accountNumber)) {
                        accounts[i].setBalance(-balance);
                    }
                }

            } else if (number == 5) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
