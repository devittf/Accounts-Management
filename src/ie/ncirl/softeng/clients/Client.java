package ie.ncirl.softeng.clients;

import ie.ncirl.softeng.loans.Loan;
import java.util.Vector;

/**
 * @author x12317886 Fiachra Devitt
 */
public class Client {

    protected String id;
    protected String pass;
    protected String name, surname, age, address;
    protected String creditCardHistory;
    protected String creditHistory;
    protected String currentBalance;
    protected int pin;
    protected long cardNum;
    protected boolean cardBlocked = false;
    public Vector <Loan> loans;

    public Client(String id, String pass, int pin) {
        this.id = id;
        this.pass = pass;
        this.pin = pin;
        loans = new Vector();
    }
    
    public Client() {
        
    }
    
    public long getCardNum() {
        return cardNum;
    }

    public void setCardNum(long cardNum) {
        this.cardNum = cardNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreditCardHistory() {
        return creditCardHistory;
    }

    public void setCreditCardHistory(String creditCardHistory) {
        this.creditCardHistory = creditCardHistory;
    }

    public String getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(String creditHistory) {
        this.creditHistory = creditHistory;
    }

    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    
}
