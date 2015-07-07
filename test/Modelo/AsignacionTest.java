/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Henry
 */
public class AsignacionTest {
    
    public AsignacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of registrarAsignacion method, of class Asignacion.
     */
    @Test
    public void testRegistrarAsignacion() {
        System.out.println("registrarAsignacion");
        Asignacion objAsig = new Asignacion();
        objAsig.getObjTesisRecpcion().setId_tesis_recepcion(100);
        objAsig.getObjJefe().setId_persona(2);
        objAsig.getObjRevisor().setId_persona(3);
        boolean expResult = false;
        
        boolean result = Asignacion.registrarAsignacion(objAsig);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
