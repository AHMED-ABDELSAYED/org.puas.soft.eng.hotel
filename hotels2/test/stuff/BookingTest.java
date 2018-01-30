/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import java.util.Date;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Chris
 */
public class BookingTest extends TestCase {
    
    public BookingTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(BookingTest.class);
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
     * Test of getCode method, of class Booking.
     */
    public void testGetCode() {
        System.out.println("getCode");
        Booking instance = null;
        int expResult = 0;
        int result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class Booking.
     */
    public void testGetLastname() {
        System.out.println("getLastname");
        Booking instance = null;
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class Booking.
     */
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Booking instance = null;
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegion method, of class Booking.
     */
    public void testGetRegion() {
        System.out.println("getRegion");
        Booking instance = null;
        String expResult = "";
        String result = instance.getRegion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoom_no method, of class Booking.
     */
    public void testGetRoom_no() {
        System.out.println("getRoom_no");
        Booking instance = null;
        int expResult = 0;
        int result = instance.getRoom_no();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheckin method, of class Booking.
     */
    public void testGetCheckin() {
        System.out.println("getCheckin");
        Booking instance = null;
        Date expResult = null;
        Date result = instance.getCheckin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCheckout method, of class Booking.
     */
    public void testGetCheckout() {
        System.out.println("getCheckout");
        Booking instance = null;
        Date expResult = null;
        Date result = instance.getCheckout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharge method, of class Booking.
     */
    public void testGetCharge() {
        System.out.println("getCharge");
        Booking instance = null;
        int expResult = 0;
        int result = instance.getCharge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
