package collections.emp;
import java.io.Serializable;

public class MMASavingAcc implements Serializable,Comparable {
    
    private int accid;
    private String accname;
    private double accbalance;
    private boolean isSalaryAccount;

    public MMASavingAcc(int accid, String accname, double accbalance, boolean isSalaryAccount) {
        super();
        this.accid = accid;
        this.accname = accname;
        this.accbalance = accbalance;
        this.isSalaryAccount = isSalaryAccount;
    }


    public int getaccid() {
        return accid;
    }
    public void setaccid(int accid) {
        this.accid = accid;
    }
    public String getaccname() {
        return accname;
    }
    public void setaccname(String accname) {
        this.accname = accname;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }
    public void setSalaryAccount(boolean isSalaryAccount) {
        this.isSalaryAccount = isSalaryAccount;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accid;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MMASavingAcc other = (MMASavingAcc) obj;
        if (accid != other.accid)
            return false;
        return true;
    }
    @Override
    public int compareTo(Object obj) {
        return this.accid-((MMASavingAcc)obj).accid;
    }
    public double getaccbalance() {
        return accbalance;
    }
    public void setaccbalance(double accbalance) {
        this.accbalance = accbalance;
    }
}