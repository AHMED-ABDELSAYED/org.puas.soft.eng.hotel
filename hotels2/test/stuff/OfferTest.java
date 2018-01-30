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
public class OfferTest extends TestCase {
    
    public OfferTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(OfferTest.class);
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
     * Test of getRegion method, of class Offer.
     */
    public void testGetRegion() {
        System.out.println("getRegion");
        Offer instance = null;
        String expResult = "";
        String result = instance.getRegion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Offer.
     */
    public void testGetType() {
        System.out.println("getType");
        Offer instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSdate method, of class Offer.
     */
    public void testGetSdate() {
        System.out.println("getSdate");
        Offer instance = null;
        Date expResult = null;
        Date result = instance.getSdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdate method, of class Offer.
     */
    public void testGetEdate() {
        System.out.println("getEdate");
        Offer instance = null;
        Date expResult = null;
        Date result = instance.getEdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscount method, of class Offer.
     */
    public void testGetDiscount() {
        System.out.println("getDiscount");
        Offer instance = null;
        int expResult = 0;
        int result = instance.getDiscount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
