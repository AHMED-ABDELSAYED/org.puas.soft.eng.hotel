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
public class AvailTest extends TestCase {
    
    public AvailTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AvailTest.class);
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
     * Test of getRoom_no method, of class Avail.
     */
    public void testGetRoom_no() {
        System.out.println("getRoom_no");
        Avail instance = null;
        int expResult = 0;
        int result = instance.getRoom_no();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Avail.
     */
    public void testGetType() {
        System.out.println("getType");
        Avail instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegion method, of class Avail.
     */
    public void testGetRegion() {
        System.out.println("getRegion");
        Avail instance = null;
        String expResult = "";
        String result = instance.getRegion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Avail.
     */
    public void testGetPrice() {
        System.out.println("getPrice");
        Avail instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAvail method, of class Avail.
     */
    public void testIsAvail() {
        System.out.println("isAvail");
        Avail instance = null;
        boolean expResult = false;
        boolean result = instance.isAvail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
