/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ncirl.softeng.security;

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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of validateAdmin method, of class Admin.
     */
    @Test
    public void testValidateAdmin_3args() {
        System.out.println("validateAdmin");
        String id = "TeamAwesome";
        char[] textPass = {'s','o','f','t','e','n','g','p','r','o','j','e','c','t'};
        char[] digitPass = {'6','3','4','1','9','7'};
        Admin instance = new Admin();
        boolean expResult = true;
        boolean result = instance.validateAdmin(id, textPass, digitPass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validateAdmin method, of class Admin.
     */
    @Test
    public void testValidateAdmin_String_charArr() {
        System.out.println("validateAdmin");
        String id = "TeamAwesome";
        char[] digitPass = {'6','3','4','1','9','7'};
        Admin instance = new Admin();
        boolean expResult = true;
        boolean result = instance.validateAdmin(id, digitPass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCardBlocked method, of class Admin.
     */
    @Test
    public void testSetCardBlocked() {
        System.out.println("setCardBlocked");
        boolean cardBlocked = false;
        Admin instance = new Admin();
        instance.setCardBlocked(cardBlocked);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isCardBlocked method, of class Admin.
     */
    @Test
    public void testIsCardBlocked() {
        System.out.println("isCardBlocked");
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.isCardBlocked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}