public class Account {
    private double balance;
    private int agency;
    private int number;
    private Costumer holder;
    private static int total;

    public Account(int agency, int number, Costumer holder){
        Account.total++;
        this.agency = agency;
        this.number = number;
        this.holder = holder;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public boolean withdraw(double value){
        if (this.balance >= value){
            this.balance -= value;
            return true;
        }

        return false;
    }

    public boolean transfer(double value, Account destiny){
        if(this.balance >= value){
            this.balance -= value;
            destiny.deposit(value);
            return true;
        }

        return false;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if(agency <= 0 ){
            System.out.println ("Error: The agency must be higher than 0");
            return;
        }

        this.agency = agency;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if(number <= 0 ){
            System.out.println ("Error: The number must be higher than 0");
            return;
        }

        this.number = number;
    }

    public Costumer getHolder() {
        return this.holder;
    }

    public void setHolder(Costumer holder) {
        this.holder = holder;
    }

    public static int getTotal(){
        return Account.total;
    }

    @Override
    public String toString () {
        return "Account{" +
                "balance=" + balance +
                ", agency=" + agency +
                ", number=" + number +
                ", holder=" + holder.toString() +
                '}';
    }
}