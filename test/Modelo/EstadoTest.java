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
public class EstadoTest {
    
    public EstadoTest() {
    }

    /**
     * Test of getId_estado method, of class Estado.
     */
    @Test
    public void testGetId_estado() {
        System.out.println("getId_estado");
        Estado instance = new Estado();
        int expResult = 0;
        int result = instance.getId_estado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_estado method, of class Estado.
     */
    @Test
    public void testSetId_estado() {
        System.out.println("setId_estado");
        int id_estado = 0;
        Estado instance = new Estado();
        instance.setId_estado(id_estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Estado.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Estado instance = new Estado();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Estado.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Estado instance = new Estado();
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }
    
}
