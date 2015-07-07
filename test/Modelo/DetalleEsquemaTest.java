/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class DetalleEsquemaTest {
    
    public DetalleEsquemaTest() {
    }

    /**
     * Test of getId_detalle method, of class DetalleEsquema.
     */
    @Test
    public void testGetId_detalle() {
        System.out.println("getId_detalle");
        DetalleEsquema instance = new DetalleEsquema();
        int expResult = 0;
        int result = instance.getId_detalle();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_detalle method, of class DetalleEsquema.
     */
    @Test
    public void testSetId_detalle() {
        System.out.println("setId_detalle");
        int id_detalle = 0;
        DetalleEsquema instance = new DetalleEsquema();
        instance.setId_detalle(id_detalle);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjEsquema method, of class DetalleEsquema.
     */
    @Test
    public void testGetObjEsquema() {
        System.out.println("getObjEsquema");
        DetalleEsquema instance = new DetalleEsquema();
        EsquemaTesis expResult = null;
        EsquemaTesis result = instance.getObjEsquema();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjEsquema method, of class DetalleEsquema.
     */
    @Test
    public void testSetObjEsquema() {
        System.out.println("setObjEsquema");
        EsquemaTesis objEsquema = null;
        DetalleEsquema instance = new DetalleEsquema();
        instance.setObjEsquema(objEsquema);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapitulo method, of class DetalleEsquema.
     */
    @Test
    public void testGetCapitulo() {
        System.out.println("getCapitulo");
        DetalleEsquema instance = new DetalleEsquema();
        String expResult = "";
        String result = instance.getCapitulo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapitulo method, of class DetalleEsquema.
     */
    @Test
    public void testSetCapitulo() {
        System.out.println("setCapitulo");
        String capitulo = "";
        DetalleEsquema instance = new DetalleEsquema();
        instance.setCapitulo(capitulo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class DetalleEsquema.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        DetalleEsquema instance = new DetalleEsquema();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class DetalleEsquema.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        DetalleEsquema instance = new DetalleEsquema();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContenido method, of class DetalleEsquema.
     */
    @Test
    public void testGetContenido() {
        System.out.println("getContenido");
        DetalleEsquema instance = new DetalleEsquema();
        String expResult = "";
        String result = instance.getContenido();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContenido method, of class DetalleEsquema.
     */
    @Test
    public void testSetContenido() {
        System.out.println("setContenido");
        String contenido = "";
        DetalleEsquema instance = new DetalleEsquema();
        instance.setContenido(contenido);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrden method, of class DetalleEsquema.
     */
    @Test
    public void testGetOrden() {
        System.out.println("getOrden");
        DetalleEsquema instance = new DetalleEsquema();
        int expResult = 0;
        int result = instance.getOrden();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrden method, of class DetalleEsquema.
     */
    @Test
    public void testSetOrden() {
        System.out.println("setOrden");
        int orden = 0;
        DetalleEsquema instance = new DetalleEsquema();
        instance.setOrden(orden);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class DetalleEsquema.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        DetalleEsquema instance = new DetalleEsquema();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class DetalleEsquema.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        DetalleEsquema instance = new DetalleEsquema();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarDetalleEsquemaTesis method, of class DetalleEsquema.
     */
    @Test
    public void testGetCargarDetalleEsquemaTesis() {
        System.out.println("getCargarDetalleEsquemaTesis");
        int esquema = 0;
        ArrayList<DetalleEsquema> expResult = null;
        ArrayList<DetalleEsquema> result = DetalleEsquema.getCargarDetalleEsquemaTesis(esquema);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
