/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ncirl.softeng.loans;

/**
 *
 * @author x12317886
 */
public class Loan {
    long amount;
    String status;

    public Loan(long amount, String status) {
        this.amount = amount;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
        
}
