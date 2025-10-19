public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public void depositFunds(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " made. New balance is $" + this.balance);
    }

    public void withdrawFunds(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds. Balance is $" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " processed. Remaining balance = $" + balance);
        }
    }

    public void describeAccount() {
        System.out.println("Account number: " + this.number
            + "\nCustomer name: " + this.customerName + "\nEmail: " + this.email + "\nPhone number: " + this.phoneNumber
        );
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
