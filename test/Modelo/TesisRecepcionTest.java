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
public class TesisRecepcionTest {
    
    public TesisRecepcionTest() {
    }

    /**
     * Test of getCont method, of class TesisRecepcion.
     */
    @Test
    public void testGetCont() {
        System.out.println("getCont");
        TesisRecepcion instance = new TesisRecepcion();
        int expResult = 0;
        int result = instance.getCont();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCont method, of class TesisRecepcion.
     */
    @Test
    public void testSetCont() {
        System.out.println("setCont");
        int cont = 0;
        TesisRecepcion instance = new TesisRecepcion();
        instance.setCont(cont);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_aux method, of class TesisRecepcion.
     */
    @Test
    public void testGetId_aux() {
        System.out.println("getId_aux");
        TesisRecepcion instance = new TesisRecepcion();
        int expResult = 0;
        int result = instance.getId_aux();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_aux method, of class TesisRecepcion.
     */
    @Test
    public void testSetId_aux() {
        System.out.println("setId_aux");
        int id_aux = 0;
        TesisRecepcion instance = new TesisRecepcion();
        instance.setId_aux(id_aux);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAux method, of class TesisRecepcion.
     */
    @Test
    public void testGetAux() {
        System.out.println("getAux");
        TesisRecepcion instance = new TesisRecepcion();
        String expResult = "";
        String result = instance.getAux();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAux method, of class TesisRecepcion.
     */
    @Test
    public void testSetAux() {
        System.out.println("setAux");
        String aux = "";
        TesisRecepcion instance = new TesisRecepcion();
        instance.setAux(aux);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesEstado method, of class TesisRecepcion.
     */
    @Test
    public void testGetDesEstado() {
        System.out.println("getDesEstado");
        TesisRecepcion instance = new TesisRecepcion();
        String expResult = "";
        String result = instance.getDesEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesEstado method, of class TesisRecepcion.
     */
    @Test
    public void testSetDesEstado() {
        System.out.println("setDesEstado");
        String desEstado = "";
        TesisRecepcion instance = new TesisRecepcion();
        instance.setDesEstado(desEstado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_tesis_recepcion method, of class TesisRecepcion.
     */
    @Test
    public void testGetId_tesis_recepcion() {
        System.out.println("getId_tesis_recepcion");
        TesisRecepcion instance = new TesisRecepcion();
        int expResult = 0;
        int result = instance.getId_tesis_recepcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_tesis_recepcion method, of class TesisRecepcion.
     */
    @Test
    public void testSetId_tesis_recepcion() {
        System.out.println("setId_tesis_recepcion");
        int id_tesis_recepcion = 0;
        TesisRecepcion instance = new TesisRecepcion();
        instance.setId_tesis_recepcion(id_tesis_recepcion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjTesis method, of class TesisRecepcion.
     */
    @Test
    public void testGetObjTesis() {
        System.out.println("getObjTesis");
        TesisRecepcion instance = new TesisRecepcion();
        Tesis expResult = null;
        Tesis result = instance.getObjTesis();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjTesis method, of class TesisRecepcion.
     */
    @Test
    public void testSetObjTesis() {
        System.out.println("setObjTesis");
        Tesis objTesis = null;
        TesisRecepcion instance = new TesisRecepcion();
        instance.setObjTesis(objTesis);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjRecepcionista method, of class TesisRecepcion.
     */
    @Test
    public void testGetObjRecepcionista() {
        System.out.println("getObjRecepcionista");
        TesisRecepcion instance = new TesisRecepcion();
        Persona expResult = null;
        Persona result = instance.getObjRecepcionista();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjRecepcionista method, of class TesisRecepcion.
     */
    @Test
    public void testSetObjRecepcionista() {
        System.out.println("setObjRecepcionista");
        Persona objRecepcionista = null;
        TesisRecepcion instance = new TesisRecepcion();
        instance.setObjRecepcionista(objRecepcionista);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjDirector method, of class TesisRecepcion.
     */
    @Test
    public void testGetObjDirector() {
        System.out.println("getObjDirector");
        TesisRecepcion instance = new TesisRecepcion();
        Persona expResult = null;
        Persona result = instance.getObjDirector();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjDirector method, of class TesisRecepcion.
     */
    @Test
    public void testSetObjDirector() {
        System.out.println("setObjDirector");
        Persona objDirector = null;
        TesisRecepcion instance = new TesisRecepcion();
        instance.setObjDirector(objDirector);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha_recepcion method, of class TesisRecepcion.
     */
    @Test
    public void testGetFecha_recepcion() {
        System.out.println("getFecha_recepcion");
        TesisRecepcion instance = new TesisRecepcion();
        Date expResult = null;
        Date result = instance.getFecha_recepcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha_recepcion method, of class TesisRecepcion.
     */
    @Test
    public void testSetFecha_recepcion() {
        System.out.println("setFecha_recepcion");
        Date fecha_recepcion = null;
        TesisRecepcion instance = new TesisRecepcion();
        instance.setFecha_recepcion(fecha_recepcion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class TesisRecepcion.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        TesisRecepcion instance = new TesisRecepcion();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class TesisRecepcion.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        TesisRecepcion instance = new TesisRecepcion();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class TesisRecepcion.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        TesisRecepcion instance = new TesisRecepcion();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class TesisRecepcion.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        TesisRecepcion instance = new TesisRecepcion();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarTesis method, of class TesisRecepcion.
     */
    @Test
    public void testGetCargarTesis() {
        System.out.println("getCargarTesis");
        ArrayList<TesisRecepcion> expResult = null;
        ArrayList<TesisRecepcion> result = TesisRecepcion.getCargarTesis();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarTesis_sin_Asignar method, of class TesisRecepcion.
     */
    @Test
    public void testGetCargarTesis_sin_Asignar() {
        System.out.println("getCargarTesis_sin_Asignar");
        ArrayList<TesisRecepcion> expResult = null;
        ArrayList<TesisRecepcion> result = TesisRecepcion.getCargarTesis_sin_Asignar();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarTesisRecepcion method, of class TesisRecepcion.
     */
    @Test
    public void testRegistrarTesisRecepcion() {
        System.out.println("registrarTesisRecepcion");
        TesisRecepcion obj = null;
        boolean expResult = false;
        boolean result = TesisRecepcion.registrarTesisRecepcion(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuentaTesisRevisadas method, of class TesisRecepcion.
     */
    @Test
    public void testGetCuentaTesisRevisadas() {
        System.out.println("getCuentaTesisRevisadas");
        int tesis = 0;
        ArrayList<TesisRecepcion> expResult = null;
        ArrayList<TesisRecepcion> result = TesisRecepcion.getCuentaTesisRevisadas(tesis);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
