public class Main {

    public static void main (String [] args) {

        Account ibraAccount = new Account();
        ibraAccount.setNumber("9867363");
        ibraAccount.setCustomerName("ibra ba");
        ibraAccount.setEmail("myemail@ibra.com");
        ibraAccount.setPhoneNumber("087(123)-4567");

        ibraAccount.depositFunds(250);
        ibraAccount.withdrawFunds(50);
        ibraAccount.withdrawFunds(200);

        ibraAccount.depositFunds(100);
        ibraAccount.withdrawFunds(45.55);
        ibraAccount.withdrawFunds(54.46);



    }
}
