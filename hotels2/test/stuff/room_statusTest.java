/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Chris
 */
public class room_statusTest extends TestCase {
    
    public room_statusTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(room_statusTest.class);
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
     * Test of availList method, of class room_status.
     */
    public void testAvailList() {
        System.out.println("availList");
        room_status instance = new room_status();
        ArrayList<Avail> expResult = null;
        ArrayList<Avail> result = instance.availList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear_table method, of class room_status.
     */
    public void testClear_table() {
        System.out.println("clear_table");
        room_status instance = new room_status();
        instance.clear_table();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showAvail method, of class room_status.
     */
    public void testShowAvail() {
        System.out.println("showAvail");
        room_status instance = new room_status();
        instance.showAvail();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class room_status.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        room_status.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
