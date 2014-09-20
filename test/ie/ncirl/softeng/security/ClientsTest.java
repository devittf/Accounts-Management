/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ncirl.softeng.security;

import ie.ncirl.softeng.clients.Client;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author x12317886
 */
public class ClientsTest {
    
    public ClientsTest() {
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
     * Test of getName method, of class Clients.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String clientId = "rosaparks";
        Clients instance = new Clients();
        instance.clientsList.add(new Client("rosaparks", "rose", 6565));
        instance.clientsList.get(0).setName(clientId);
        String expResult = "rosaparks";
        String result = instance.getName(clientId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFetchedClientId method, of class Clients.
     */
    @Test
    public void testSetFetchedClientId() {
        System.out.println("setFetchedClientId");
        String clientId = "rosaparks";
        Clients instance = new Clients();
        instance.setFetchedClientId(clientId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFetchedTextPass method, of class Clients.
     */
    @Test
    public void testSetFetchedTextPass() {
        System.out.println("setFetchedTextPass");
        char[] textPass = {'r','o','s','e'};
        Clients instance = new Clients();
        instance.setFetchedTextPass(textPass);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFetchedDigitPass method, of class Clients.
     */
    @Test
    public void testSetFetchedDigitPass() {
        System.out.println("setFetchedDigitPass");
        char[] digitPass = {'6','5','6','5'};
        Clients instance = new Clients();
        instance.setFetchedDigitPass(digitPass);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareDetails method, of class Clients.
     */
    @Test
    public void testCompareDetails() {
        System.out.println("compareDetails");
        Clients instance = new Clients();
        boolean expResult = false;
        boolean result = instance.compareDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}