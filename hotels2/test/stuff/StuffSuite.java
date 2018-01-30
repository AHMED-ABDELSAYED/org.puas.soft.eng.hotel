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
public class StuffSuite extends TestCase {
    
    public StuffSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("StuffSuite");
        suite.addTest(backupTest.suite());
        suite.addTest(OfferTest.suite());
        suite.addTest(room_statusTest.suite());
        suite.addTest(loginTest.suite());
        suite.addTest(AvailTest.suite());
        suite.addTest(mainTest.suite());
        suite.addTest(statisticsTest.suite());
        suite.addTest(emp_bookTest.suite());
        suite.addTest(view_offersTest.suite());
        suite.addTest(adminTest.suite());
        suite.addTest(create_accountTest.suite());
        suite.addTest(insert_bookTest.suite());
        suite.addTest(delete_accountTest.suite());
        suite.addTest(testTest.suite());
        suite.addTest(employeeTest.suite());
        suite.addTest(create_offerTest.suite());
        suite.addTest(BookingTest.suite());
        suite.addTest(create_roomTest.suite());
        suite.addTest(book_confTest.suite());
        suite.addTest(retrieve_accountTest.suite());
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
    
}
