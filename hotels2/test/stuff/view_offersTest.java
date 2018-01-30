/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import java.util.ArrayList;
import java.util.Date;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Chris
 */
public class view_offersTest extends TestCase {
    
    public view_offersTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(view_offersTest.class);
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
     * Test of convertUtilToSql method, of class view_offers.
     */
    public void testConvertUtilToSql() {
        System.out.println("convertUtilToSql");
        Date uDate = null;
        java.sql.Date expResult = null;
        java.sql.Date result = view_offers.convertUtilToSql(uDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autoDelete method, of class view_offers.
     */
    public void testAutoDelete() {
        System.out.println("autoDelete");
        view_offers instance = new view_offers();
        instance.autoDelete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of offerList method, of class view_offers.
     */
    public void testOfferList() {
        System.out.println("offerList");
        view_offers instance = new view_offers();
        ArrayList<Offer> expResult = null;
        ArrayList<Offer> result = instance.offerList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showOffer method, of class view_offers.
     */
    public void testShowOffer() {
        System.out.println("showOffer");
        view_offers instance = new view_offers();
        instance.showOffer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear_table method, of class view_offers.
     */
    public void testClear_table() {
        System.out.println("clear_table");
        view_offers instance = new view_offers();
        instance.clear_table();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class view_offers.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        view_offers.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
