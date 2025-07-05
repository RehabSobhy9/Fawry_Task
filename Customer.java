package system;

public class Customer {
    public String name;
     private float balance;

    public Customer(String name,float balance) {
        this.name = name;
        this.balance=balance;

    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
