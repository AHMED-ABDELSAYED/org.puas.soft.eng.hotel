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
public class book_confTest extends TestCase {
    
    public book_confTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(book_confTest.class);
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
     * Test of convertUtilToSql method, of class book_conf.
     */
    public void testConvertUtilToSql() {
        System.out.println("convertUtilToSql");
        Date uDate = null;
        java.sql.Date expResult = null;
        java.sql.Date result = book_conf.convertUtilToSql(uDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class book_conf.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        book_conf.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
