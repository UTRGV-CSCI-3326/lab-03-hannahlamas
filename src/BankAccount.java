public class BankAccount {
    public static void main(String[] args){

        double balance = 2175.37;
        balance -= 302.50;
        balance += 50.03;
        balance /= 2;
        balance += 20.00;
        balance -= 1.00;
        balance *= 2;
        balance += 1.00;

        System.out.printf("Bob's balance: $%.2f\n", balance);
    
    }
}
