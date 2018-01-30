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
public class emp_bookTest extends TestCase {
    
    public emp_bookTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(emp_bookTest.class);
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
     * Test of bookList method, of class emp_book.
     */
    public void testBookList() {
        System.out.println("bookList");
        emp_book instance = new emp_book();
        ArrayList<Booking> expResult = null;
        ArrayList<Booking> result = instance.bookList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear_table method, of class emp_book.
     */
    public void testClear_table() {
        System.out.println("clear_table");
        emp_book instance = new emp_book();
        instance.clear_table();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showBooks method, of class emp_book.
     */
    public void testShowBooks() {
        System.out.println("showBooks");
        emp_book instance = new emp_book();
        instance.showBooks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertUtilToSql method, of class emp_book.
     */
    public void testConvertUtilToSql() {
        System.out.println("convertUtilToSql");
        Date uDate = null;
        java.sql.Date expResult = null;
        java.sql.Date result = emp_book.convertUtilToSql(uDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autoDelete method, of class emp_book.
     */
    public void testAutoDelete() {
        System.out.println("autoDelete");
        emp_book instance = new emp_book();
        instance.autoDelete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class emp_book.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        emp_book.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
