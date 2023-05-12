package execution;

public class Execution {
    public static void main(String[] args) {
        Account s1 = new Savings(234, "Ihsan", 50000, 1);
        System.out.println(s1.toString());
        s1.deposit(1000);
        s1.withdraw(50000);
        System.out.println(s1.toString());

        Account c1 = new Checkings(104, "Kumar", 20000, 5);
        System.out.println(c1.toString());
        c1.withdraw(18000);
        System.out.println(c1.toString());
        c1.withdraw(1000);
        System.out.println(c1.toString());

        Account c2 = new Checkings(110, "Ram", 10000, 2);
        System.out.println(c2.toString());
        c2.deposit(100);
        System.out.println(c2.toString());

    }
}

interface Calculate{
    int totalTrans = 3;
    double interest_rate = 0.15;
    double cal_interest();
}

abstract class Account {
    int accno;
    String accname;
    double balance;

    protected Account(int no, String name, double b){
        accname = name;
        accno = no;
        balance = b;
    }

    public String toString(){
        return "Account: " + accno + "\nName: " + accname + "\nBalance:" + balance;
    }

    public abstract void deposit(double amt);
    public abstract double withdraw(double amt);
}


class Savings extends Account implements Calculate{
    private int transactions;

    Savings(int no, String name, double b, int t){
        super(no, name, b);
        transactions = t;
    }

    public String toString(){
        return super.toString() + "\nTransactions:" + transactions + "\nInterest: "+ cal_interest() + "\n";
    }

    public void deposit(double amt) {
        if(transactions < totalTrans) {
            balance += amt;
            transactions++;
        }
    }

    public double withdraw(double amt) {
        if(transactions < totalTrans) {
            balance -= amt;
            transactions++;
            return balance;
        }
        System.out.println("Couldn't Withdraw");
        return balance;
    }

    public double cal_interest() {
        return 0;
    }
}

class Checkings extends Account implements Calculate{
    private int transactions;

    Checkings(int no, String name, double b, int t){
        super(no, name, b);
        transactions = t;
    }

    public String toString(){
        return super.toString() + "\nTransactions:" + transactions + "\nInterest: " + cal_interest() + "\n";
    }

    public void deposit(double amt) {
        balance += amt;
        transactions++;
    }

    public double withdraw(double amt) {
        if(balance - amt > 1000) {
            balance -= amt;
            transactions++;
            return balance;
        }
        System.out.println("Couldn't Withdraw");
        return balance;
    }

    public double cal_interest() {
        return (balance * interest_rate);
    }
}
