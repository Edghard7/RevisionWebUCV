/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class FuncionTest {
    
    public FuncionTest() {
    }

    /**
     * Test of getFunciones method, of class Funcion.
     */
    @Test
    public void testGetFunciones() {
        System.out.println("getFunciones");
        Funcion instance = new Funcion();
        String expResult = "";
        String result = instance.getFunciones();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFunciones method, of class Funcion.
     */
    @Test
    public void testSetFunciones() {
        System.out.println("setFunciones");
        String funciones = "";
        Funcion instance = new Funcion();
        instance.setFunciones(funciones);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_funcion method, of class Funcion.
     */
    @Test
    public void testGetId_funcion() {
        System.out.println("getId_funcion");
        Funcion instance = new Funcion();
        int expResult = 0;
        int result = instance.getId_funcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_funcion method, of class Funcion.
     */
    @Test
    public void testSetId_funcion() {
        System.out.println("setId_funcion");
        int id_funcion = 0;
        Funcion instance = new Funcion();
        instance.setId_funcion(id_funcion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Funcion.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Funcion instance = new Funcion();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Funcion.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Funcion instance = new Funcion();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Funcion.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Funcion instance = new Funcion();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Funcion.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        Funcion instance = new Funcion();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarComboFuncion method, of class Funcion.
     */
    @Test
    public void testGetCargarComboFuncion() {
        System.out.println("getCargarComboFuncion");
        List<Funcion> expResult = null;
        List<Funcion> result = Funcion.getCargarComboFuncion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
