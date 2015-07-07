/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class TipoTesisTest {
    
    public TipoTesisTest() {
    }

    /**
     * Test of getId_formato method, of class TipoTesis.
     */
    @Test
    public void testGetId_formato() {
        System.out.println("getId_formato");
        TipoTesis instance = new TipoTesis();
        int expResult = 0;
        int result = instance.getId_formato();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_formato method, of class TipoTesis.
     */
    @Test
    public void testSetId_formato() {
        System.out.println("setId_formato");
        int id_formato = 0;
        TipoTesis instance = new TipoTesis();
        instance.setId_formato(id_formato);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class TipoTesis.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        TipoTesis instance = new TipoTesis();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class TipoTesis.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        TipoTesis instance = new TipoTesis();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class TipoTesis.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        TipoTesis instance = new TipoTesis();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class TipoTesis.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        TipoTesis instance = new TipoTesis();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }
    
}
