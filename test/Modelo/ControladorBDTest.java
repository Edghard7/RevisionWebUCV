/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ControladorBDTest {
    
    public ControladorBDTest() {
    }

    /**
     * Test of darConexionBD method, of class ControladorBD.
     */
    @Test
    public void testDarConexionBD() {
        System.out.println("darConexionBD");
        Connection expResult = null;
        Connection result = ControladorBD.darConexionBD();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ControladorBD.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] argumentos = null;
        ControladorBD.main(argumentos);
        fail("The test case is a prototype.");
    }
    
}
