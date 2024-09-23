package labdemonstration;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Oleg", "Shapovalov", new Date(26, 4, 2004));
        Transaction transaction1 = new Transaction("hnwdad", 104.7, new Date(26, 9, 2024));
        Transaction transaction2 = new Transaction("daefeg", 1200, new Date(3, 4, 2024));
        Transaction transaction3 = new Transaction("134gfwfe", 10.3, new Date(8, 2, 2024));
        BankAccount bankAccount1 = new BankAccount(61283831, AccountType.BUSINESS, customer1);
        bankAccount1.addTransaction(transaction1);
        bankAccount1.addTransaction(transaction2);
        bankAccount1.addTransaction(transaction3);

        System.out.println("Bank account full info: ");
        bankAccount1.printInfo();
        System.out.println();
        System.out.println("_____________________");

        System.out.println("Bank account short info: ");
        bankAccount1.printShortInfo();
        System.out.println();
        System.out.println("_____________________");

        Customer customer2 = new Customer("Olena", "Fedorenko", new Date(27, 6, 2002));
        Transaction transaction4 = new Transaction("hnwdad", 100, new Date(26, 9, 2024));
        BankAccount bankAccount2 = new BankAccount(1782331, AccountType.CURRENT, customer2);
        bankAccount2.addTransaction(transaction1);
        bankAccount2.addTransaction(transaction2);
        bankAccount2.addTransaction(transaction4);

        System.out.println("Bank account full info: ");
        bankAccount2.printInfo();
        System.out.println();
        System.out.println("_____________________");

        System.out.println("Bank account short info: ");
        bankAccount2.printShortInfo();
        System.out.println();
        System.out.println("_____________________");
    }
}
