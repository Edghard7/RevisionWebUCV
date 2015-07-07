/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ObservacionTest {
    
    public ObservacionTest() {
    }

    /**
     * Test of getFecha method, of class Observacion.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Observacion instance = new Observacion();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Observacion.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Observacion instance = new Observacion();
        instance.setFecha(fecha);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha_act method, of class Observacion.
     */
    @Test
    public void testGetFecha_act() {
        System.out.println("getFecha_act");
        Observacion instance = new Observacion();
        Date expResult = null;
        Date result = instance.getFecha_act();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha_act method, of class Observacion.
     */
    @Test
    public void testSetFecha_act() {
        System.out.println("setFecha_act");
        Date fecha_act = null;
        Observacion instance = new Observacion();
        instance.setFecha_act(fecha_act);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado_d method, of class Observacion.
     */
    @Test
    public void testGetEstado_d() {
        System.out.println("getEstado_d");
        Observacion instance = new Observacion();
        String expResult = "";
        String result = instance.getEstado_d();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado_d method, of class Observacion.
     */
    @Test
    public void testSetEstado_d() {
        System.out.println("setEstado_d");
        String estado_d = "";
        Observacion instance = new Observacion();
        instance.setEstado_d(estado_d);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_observacion method, of class Observacion.
     */
    @Test
    public void testGetId_observacion() {
        System.out.println("getId_observacion");
        Observacion instance = new Observacion();
        int expResult = 0;
        int result = instance.getId_observacion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_observacion method, of class Observacion.
     */
    @Test
    public void testSetId_observacion() {
        System.out.println("setId_observacion");
        int id_observacion = 0;
        Observacion instance = new Observacion();
        instance.setId_observacion(id_observacion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjDetalleEsquema method, of class Observacion.
     */
    @Test
    public void testGetObjDetalleEsquema() {
        System.out.println("getObjDetalleEsquema");
        Observacion instance = new Observacion();
        DetalleEsquema expResult = null;
        DetalleEsquema result = instance.getObjDetalleEsquema();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjDetalleEsquema method, of class Observacion.
     */
    @Test
    public void testSetObjDetalleEsquema() {
        System.out.println("setObjDetalleEsquema");
        DetalleEsquema objDetalleEsquema = null;
        Observacion instance = new Observacion();
        instance.setObjDetalleEsquema(objDetalleEsquema);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjRevision method, of class Observacion.
     */
    @Test
    public void testGetObjRevision() {
        System.out.println("getObjRevision");
        Observacion instance = new Observacion();
        Revision expResult = null;
        Revision result = instance.getObjRevision();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjRevision method, of class Observacion.
     */
    @Test
    public void testSetObjRevision() {
        System.out.println("setObjRevision");
        Revision objRevision = null;
        Observacion instance = new Observacion();
        instance.setObjRevision(objRevision);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacion method, of class Observacion.
     */
    @Test
    public void testGetObservacion() {
        System.out.println("getObservacion");
        Observacion instance = new Observacion();
        String expResult = "";
        String result = instance.getObservacion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacion method, of class Observacion.
     */
    @Test
    public void testSetObservacion() {
        System.out.println("setObservacion");
        String observacion = "";
        Observacion instance = new Observacion();
        instance.setObservacion(observacion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Observacion.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Observacion instance = new Observacion();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Observacion.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        Observacion instance = new Observacion();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class Observacion.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        Observacion instance = new Observacion();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class Observacion.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        Observacion instance = new Observacion();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarObservaciones method, of class Observacion.
     */
    @Test
    public void testGetCargarObservaciones() {
        System.out.println("getCargarObservaciones");
        int esquema = 0;
        int asig = 0;
        ArrayList<Observacion> expResult = null;
        ArrayList<Observacion> result = Observacion.getCargarObservaciones(esquema, asig);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarObservacion method, of class Observacion.
     */
    @Test
    public void testRegistrarObservacion() {
        System.out.println("registrarObservacion");
        Observacion obj = null;
        boolean expResult = false;
        boolean result = Observacion.registrarObservacion(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActualizarObservacion method, of class Observacion.
     */
    @Test
    public void testGetActualizarObservacion() {
        System.out.println("getActualizarObservacion");
        Observacion obj = null;
        boolean expResult = false;
        boolean result = Observacion.getActualizarObservacion(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarObservaciones_Tesis method, of class Observacion.
     */
    @Test
    public void testGetCargarObservaciones_Tesis() {
        System.out.println("getCargarObservaciones_Tesis");
        int tesis = 0;
        ArrayList<Observacion> expResult = null;
        ArrayList<Observacion> result = Observacion.getCargarObservaciones_Tesis(tesis);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
