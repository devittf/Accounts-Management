package ie.ncirl.softeng.security;



import java.util.Vector;
import ie.ncirl.softeng.clients.*;
import ie.ncirl.softeng.clients.Client;

/**
 * @author x12317886 Fiachra Devitt
 */
public class Clients {

    private String fetchedClientId, fetchedTextPass;
    private int fetchedDigitPass;
    protected Vector<Client> clientsList = new Vector();;
    private Client c;

    public Clients() {
        
    }

    public String getName(String clientId) {
        String name = null;
        for (int i = 0; i < clientsList.size(); i++) {
            Client c = clientsList.get(i);
            if (c.getId().equals(clientId)) {
                name = c.getName();
                break;
            }
        }
        return name;
    }

    public void setFetchedClientId(String clientId) {
        this.fetchedClientId = clientId;
    }

    public void setFetchedTextPass(char[] textPass) {
        this.fetchedTextPass = convertFromChar(textPass);
    }

    public void setFetchedDigitPass(char[] digitPass) {
        this.fetchedDigitPass = Integer.parseInt(convertFromChar(digitPass));
    }

    private String convertFromChar(char[] arr) {
        int length = arr.length;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            s.append(arr[i]);
        }

        return s.toString();
    }

    public boolean compareDetails() {
        boolean loginOk = false;
        //test();
        for (int i = 0; i < clientsList.size(); i++) {
            c = clientsList.get(i);
            if (c.getId().equals(fetchedClientId) && c.getPass().equals(fetchedTextPass) && c.getPin() == fetchedDigitPass) {
                loginOk = true;
                LoginGUI.c = c;
                break;
            } else {
                loginOk = false;
            }
        }
        return loginOk;
    }

    private void test() {
        for (int i = 0; i < clientsList.size(); i++) {
            c = clientsList.get(i);
            System.out.println(c.getId());
            System.out.println(c.getPass());
            System.out.println(c.getPin());

        }
    }
}
