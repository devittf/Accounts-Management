/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ncirl.softeng.loans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author x12560723
 */
public class LoanRequestGuiTest {

    @Test
    public void calculateCommisionTest(){
        System.out.println("interest");
        int amount = 500;
        int period = 12;
        int expResult = 15;
        LoanRequestGui lrg = new LoanRequestGui(null);
        int result = lrg.calculateCommision(amount, period);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}