/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ncirl.softeng.security;

/**
 *
 * @author x12317886 Fiachra Devitt
 */
public class Admin {

    private String id = "TeamAwesome";
    private String textPass = "softengproject";
    private int digitPass = 634197;
    private boolean cardBlocked = false;

    public boolean validateAdmin(String id, char[] textPass, char[] digitPass) {
        boolean correctDetails;
        String tempTextPass = charToString(textPass);
        String tempDigitPass = charToString(digitPass);
        try {
            int pass = Integer.parseInt(tempDigitPass);

            if (id.equals(this.id)
                    && tempTextPass.equals(this.textPass)
                    && pass == this.digitPass) {
                correctDetails = true;
            } else {
                correctDetails = false;
            }
        } catch (NumberFormatException e) {
            correctDetails = false;
        }

        return correctDetails;
    }
    
    public boolean validateAdmin(String id, char[] digitPass) {
        boolean correctDetails;
        String tempDigitPass = charToString(digitPass);
        try {
            int pass = Integer.parseInt(tempDigitPass);

            if (id.equals(this.id)
                    && pass == this.digitPass) {
                correctDetails = true;
            } else {
                correctDetails = false;
            }
        } catch (NumberFormatException e) {
            correctDetails = false;
        }

        return correctDetails;
    }

    private String charToString(char[] charArray) {
        int length = charArray.length;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            s.append(charArray[i]);
        }

        return s.toString();
    }

    public void setCardBlocked(boolean cardBlocked) {
        this.cardBlocked = cardBlocked;
    }

    public boolean isCardBlocked() {
        return cardBlocked;
    }   
}
