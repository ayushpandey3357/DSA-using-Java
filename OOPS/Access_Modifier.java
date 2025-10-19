public class Access_Modifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount() ;
        myAcc.Username = "Ayush Pandey" ;
        myAcc.setPassword("absckzs");

    }
}
class BankAccount {
    public String Username;
    private String password;
    void setPassword(String pwd){
        password = pwd;
    }
}
