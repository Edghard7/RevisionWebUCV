/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of registrarPersona method, of class Persona.
     */
    @Test
    public void testRegistrarPersona() {
        System.out.println("registrarPersona");
        Persona objPer = new Persona();
        objPer.setApellidos("perez rojos");
        objPer.setNombres("marcelo");
        //objPer.setCorreo("mal@mail.com");
        objPer.getObjTipoPersona().setId_tipo_persona(2);        
        boolean expResult = true;
        boolean result = Persona.registrarPersona(objPer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
