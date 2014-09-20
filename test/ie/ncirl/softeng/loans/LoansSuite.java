/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ncirl.softeng.loans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author x12560723
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ie.ncirl.softeng.loans.LoanSysGuiTest.class, ie.ncirl.softeng.loans.LoanRequestGuiTest.class, ie.ncirl.softeng.loans.LoanTest.class})
public class LoansSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}