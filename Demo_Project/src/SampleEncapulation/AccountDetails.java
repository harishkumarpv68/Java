package SampleEncapulation;

public class AccountDetails {

    private long AccountNumber;
    private String AccountName;

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }


    public static void main(String[] args) {

        AccountDetails a = new AccountDetails();
        a.setAccountNumber(7575567765536l);
        a.setAccountName("harish");

        System.out.println("Account number is : " + a.AccountNumber);
        System.out.println("Account name is : " + a.AccountName);

    }

}
