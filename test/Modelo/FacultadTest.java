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
public class FacultadTest {
    
    public FacultadTest() {
    }

    /**
     * Test of getId_facultad method, of class Facultad.
     */
    @Test
    public void testGetId_facultad() {
        System.out.println("getId_facultad");
        Facultad instance = new Facultad();
        int expResult = 0;
        int result = instance.getId_facultad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_facultad method, of class Facultad.
     */
    @Test
    public void testSetId_facultad() {
        System.out.println("setId_facultad");
        int id_facultad = 0;
        Facultad instance = new Facultad();
        instance.setId_facultad(id_facultad);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Facultad.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Facultad instance = new Facultad();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Facultad.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Facultad instance = new Facultad();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class Facultad.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        Facultad instance = new Facultad();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class Facultad.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        Facultad instance = new Facultad();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }
    
}
