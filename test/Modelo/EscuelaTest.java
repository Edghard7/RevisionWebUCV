/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class EscuelaTest {
    
    public EscuelaTest() {
    }

    /**
     * Test of getNro method, of class Escuela.
     */
    @Test
    public void testGetNro() {
        System.out.println("getNro");
        Escuela instance = new Escuela();
        int expResult = 0;
        int result = instance.getNro();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNro method, of class Escuela.
     */
    @Test
    public void testSetNro() {
        System.out.println("setNro");
        int nro = 0;
        Escuela instance = new Escuela();
        instance.setNro(nro);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_escuela method, of class Escuela.
     */
    @Test
    public void testGetId_escuela() {
        System.out.println("getId_escuela");
        Escuela instance = new Escuela();
        int expResult = 0;
        int result = instance.getId_escuela();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_escuela method, of class Escuela.
     */
    @Test
    public void testSetId_escuela() {
        System.out.println("setId_escuela");
        int id_escuela = 0;
        Escuela instance = new Escuela();
        instance.setId_escuela(id_escuela);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjFacultad method, of class Escuela.
     */
    @Test
    public void testGetObjFacultad() {
        System.out.println("getObjFacultad");
        Escuela instance = new Escuela();
        Facultad expResult = null;
        Facultad result = instance.getObjFacultad();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjFacultad method, of class Escuela.
     */
    @Test
    public void testSetObjFacultad() {
        System.out.println("setObjFacultad");
        Facultad objFacultad = null;
        Escuela instance = new Escuela();
        instance.setObjFacultad(objFacultad);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Escuela.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Escuela instance = new Escuela();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Escuela.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Escuela instance = new Escuela();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class Escuela.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        Escuela instance = new Escuela();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class Escuela.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        Escuela instance = new Escuela();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarComboEscuela method, of class Escuela.
     */
    @Test
    public void testGetCargarComboEscuela() {
        System.out.println("getCargarComboEscuela");
        List<Escuela> expResult = null;
        List<Escuela> result = Escuela.getCargarComboEscuela();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarComboEscuelaFacultad method, of class Escuela.
     */
    @Test
    public void testGetCargarComboEscuelaFacultad() {
        System.out.println("getCargarComboEscuelaFacultad");
        Escuela esc = null;
        List<Escuela> expResult = null;
        List<Escuela> result = Escuela.getCargarComboEscuelaFacultad(esc);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTesis_x_Escuela method, of class Escuela.
     */
    @Test
    public void testGetTesis_x_Escuela() {
        System.out.println("getTesis_x_Escuela");
        ArrayList<Escuela> expResult = null;
        ArrayList<Escuela> result = Escuela.getTesis_x_Escuela();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
