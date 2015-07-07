/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class encriptaCadenasTest {
    
    public encriptaCadenasTest() {
    }

    /**
     * Test of getStringMessageDigest method, of class encriptaCadenas.
     */
    @Test
    public void testGetStringMessageDigest() {
        System.out.println("getStringMessageDigest");
        String message = "";
        String algorithm = "";
        String expResult = "";
        String result = encriptaCadenas.getStringMessageDigest(message, algorithm);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class encriptaCadenas.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        encriptaCadenas.main(args);
        fail("The test case is a prototype.");
    }
    
}
