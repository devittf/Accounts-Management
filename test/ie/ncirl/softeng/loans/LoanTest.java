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
public class LoanTest {
    
    public LoanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setStatus method, of class Loan.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "Pending";
        Loan instance = new Loan(1000, "Pending");
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Loan.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Loan instance =  new Loan(1000, "Pending");;
        long expResult = 1000L;
        long result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Loan.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Loan instance = new Loan(1000, "Pending");;
        String expResult = "Pending";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}