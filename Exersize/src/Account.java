public class Account {
    private String id;
    private String name;
    private int balance = 0;
    private int amount=0;
    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }
    public Account(){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getID() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public static int credit(int balance){
        int amount=0;
        balance += amount;
        return balance;
    }
    static int debit(int balance){
        int amount=0;
        if(amount<=balance){
            balance -= amount;
        }else{
            System.out.println("Amout extid balance");
        }
        return balance;
    }
    public int transferTo(Account another,int amount){
        Account anotherAccount = new Account();
        if (amount <= balance){
            this.balance -= amount;

            // Add amount to the other account

            anotherAccount.balance += amount;
        }else{
            System.out.println("Amout extid balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", amount=" + amount +
                '}';
    }
}
