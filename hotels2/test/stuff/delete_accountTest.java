/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Chris
 */
public class delete_accountTest extends TestCase {
    
    public delete_accountTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(delete_accountTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of tstsubmitActionPerformed method, of class delete_account.
     */
//    public void testTstsubmitActionPerformed() {
//        System.out.println("tstsubmitActionPerformed");
//        delete_account instance = new delete_account();
//        String pas="admin6";
//        String del="malakas";
//        String result=instance.tstsubmitActionPerformed(del,pas);
//        String exp="ads";
//        assertEquals(exp,result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class delete_account.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        delete_account.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
