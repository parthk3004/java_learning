package collections.bank;
import java.io.Serializable;
public class savingaccount implements Serializable{

    private int acc_Balance;
    private int acc_Id;
    private String accountHolderName;
    private boolean isSalaryAccount;
    public savingaccount(int acc_Balance, int acc_Id, String accountHolderName, boolean isSalaryAccount) {
        super();
        this.acc_Balance = acc_Balance;
        this.acc_Id = acc_Id;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }
    public int getAcc_Balance() {
        return acc_Balance;
    }
    public void setAcc_Balance(int acc_Balance) {
        this.acc_Balance = acc_Balance;
    }
    public int getAcc_Id() {
        return acc_Id;
    }
    public void setAcc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }
    @Override
    public String toString() {
        return "savingaccount [acc_Balance=" + acc_Balance + ", acc_Id=" + acc_Id + ", accountHolderName="
                + accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
    }
    public void setSalaryAccount(boolean isSalaryAccount) {
        this.isSalaryAccount = isSalaryAccount;
    }



}