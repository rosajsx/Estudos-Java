package com.company;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bAcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bAcc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
        // Não da erro pois uma uma Business account é uma account, então posso atribuir um objeto filho para um tipo pai.


        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        // Não posso converter do tipo Account para Business Account.
        // Pra forçar, é necessário um teste manual.

        acc4.loan(100.0); // funciona agora

        // BusinessAccount acc5 = (BusinessAccount)acc3; // Essa operação não é permitida, porém o compilador não identifica
        // Vai dar erro quando executar minha aplicação.

        // Se a conta 3 é uma instancia da Business account
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("update");
        }

        // PARTE DE SOBRECARGA
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account sAcc = new SavingsAccount(1009, "Lucas", 1000.00, 200.0);
        sAcc.withdraw(200.0);
        System.out.println(sAcc.getBalance());

        Account bAcc1 = new BusinessAccount(1010, "fulano", 500.00, 100.0);
        bAcc1.withdraw(200.0);
        System.out.println(bAcc1.getBalance());

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0,0.01);


        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());


    }
}
