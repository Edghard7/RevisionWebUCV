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
public class LineaInvestigacionTest {
    
    public LineaInvestigacionTest() {
    }

    /**
     * Test of getNro method, of class LineaInvestigacion.
     */
    @Test
    public void testGetNro() {
        System.out.println("getNro");
        LineaInvestigacion instance = new LineaInvestigacion();
        int expResult = 0;
        int result = instance.getNro();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNro method, of class LineaInvestigacion.
     */
    @Test
    public void testSetNro() {
        System.out.println("setNro");
        int nro = 0;
        LineaInvestigacion instance = new LineaInvestigacion();
        instance.setNro(nro);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_linea method, of class LineaInvestigacion.
     */
    @Test
    public void testGetId_linea() {
        System.out.println("getId_linea");
        LineaInvestigacion instance = new LineaInvestigacion();
        int expResult = 0;
        int result = instance.getId_linea();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_linea method, of class LineaInvestigacion.
     */
    @Test
    public void testSetId_linea() {
        System.out.println("setId_linea");
        int id_linea = 0;
        LineaInvestigacion instance = new LineaInvestigacion();
        instance.setId_linea(id_linea);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class LineaInvestigacion.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        LineaInvestigacion instance = new LineaInvestigacion();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class LineaInvestigacion.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        LineaInvestigacion instance = new LineaInvestigacion();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class LineaInvestigacion.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        LineaInvestigacion instance = new LineaInvestigacion();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class LineaInvestigacion.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        LineaInvestigacion instance = new LineaInvestigacion();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjEscuela method, of class LineaInvestigacion.
     */
    @Test
    public void testGetObjEscuela() {
        System.out.println("getObjEscuela");
        LineaInvestigacion instance = new LineaInvestigacion();
        Escuela expResult = null;
        Escuela result = instance.getObjEscuela();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjEscuela method, of class LineaInvestigacion.
     */
    @Test
    public void testSetObjEscuela() {
        System.out.println("setObjEscuela");
        Escuela objEscuela = null;
        LineaInvestigacion instance = new LineaInvestigacion();
        instance.setObjEscuela(objEscuela);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class LineaInvestigacion.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        LineaInvestigacion instance = new LineaInvestigacion();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class LineaInvestigacion.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        LineaInvestigacion instance = new LineaInvestigacion();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarComboLinea method, of class LineaInvestigacion.
     */
    @Test
    public void testGetCargarComboLinea() {
        System.out.println("getCargarComboLinea");
        List<LineaInvestigacion> expResult = null;
        List<LineaInvestigacion> result = LineaInvestigacion.getCargarComboLinea();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarComboLineaEscuela method, of class LineaInvestigacion.
     */
    @Test
    public void testGetCargarComboLineaEscuela() {
        System.out.println("getCargarComboLineaEscuela");
        LineaInvestigacion lin = null;
        List<LineaInvestigacion> expResult = null;
        List<LineaInvestigacion> result = LineaInvestigacion.getCargarComboLineaEscuela(lin);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineas_x_Escuela method, of class LineaInvestigacion.
     */
    @Test
    public void testGetLineas_x_Escuela() {
        System.out.println("getLineas_x_Escuela");
        int escuela = 0;
        ArrayList<LineaInvestigacion> expResult = null;
        ArrayList<LineaInvestigacion> result = LineaInvestigacion.getLineas_x_Escuela(escuela);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
