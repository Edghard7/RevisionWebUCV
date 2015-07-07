/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class TesisTest {
    
    public TesisTest() {
    }

    /**
     * Test of getNro method, of class Tesis.
     */
    @Test
    public void testGetNro() {
        System.out.println("getNro");
        Tesis instance = new Tesis();
        int expResult = 0;
        int result = instance.getNro();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNro method, of class Tesis.
     */
    @Test
    public void testSetNro() {
        System.out.println("setNro");
        int nro = 0;
        Tesis instance = new Tesis();
        instance.setNro(nro);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_tesis method, of class Tesis.
     */
    @Test
    public void testGetId_tesis() {
        System.out.println("getId_tesis");
        Tesis instance = new Tesis();
        int expResult = 0;
        int result = instance.getId_tesis();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_tesis method, of class Tesis.
     */
    @Test
    public void testSetId_tesis() {
        System.out.println("setId_tesis");
        int id_tesis = 0;
        Tesis instance = new Tesis();
        instance.setId_tesis(id_tesis);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjAutor method, of class Tesis.
     */
    @Test
    public void testGetObjAutor() {
        System.out.println("getObjAutor");
        Tesis instance = new Tesis();
        Persona expResult = null;
        Persona result = instance.getObjAutor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjAutor method, of class Tesis.
     */
    @Test
    public void testSetObjAutor() {
        System.out.println("setObjAutor");
        Persona objAutor = null;
        Tesis instance = new Tesis();
        instance.setObjAutor(objAutor);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjRecepcionista method, of class Tesis.
     */
    @Test
    public void testGetObjRecepcionista() {
        System.out.println("getObjRecepcionista");
        Tesis instance = new Tesis();
        Persona expResult = null;
        Persona result = instance.getObjRecepcionista();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjRecepcionista method, of class Tesis.
     */
    @Test
    public void testSetObjRecepcionista() {
        System.out.println("setObjRecepcionista");
        Persona objRecepcionista = null;
        Tesis instance = new Tesis();
        instance.setObjRecepcionista(objRecepcionista);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjLinea method, of class Tesis.
     */
    @Test
    public void testGetObjLinea() {
        System.out.println("getObjLinea");
        Tesis instance = new Tesis();
        LineaInvestigacion expResult = null;
        LineaInvestigacion result = instance.getObjLinea();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjLinea method, of class Tesis.
     */
    @Test
    public void testSetObjLinea() {
        System.out.println("setObjLinea");
        LineaInvestigacion objLinea = null;
        Tesis instance = new Tesis();
        instance.setObjLinea(objLinea);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjEsquema method, of class Tesis.
     */
    @Test
    public void testGetObjEsquema() {
        System.out.println("getObjEsquema");
        Tesis instance = new Tesis();
        EsquemaTesis expResult = null;
        EsquemaTesis result = instance.getObjEsquema();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjEsquema method, of class Tesis.
     */
    @Test
    public void testSetObjEsquema() {
        System.out.println("setObjEsquema");
        EsquemaTesis objEsquema = null;
        Tesis instance = new Tesis();
        instance.setObjEsquema(objEsquema);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Tesis.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Tesis instance = new Tesis();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Tesis.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Tesis instance = new Tesis();
        instance.setTitulo(titulo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha_sustentacion method, of class Tesis.
     */
    @Test
    public void testGetFecha_sustentacion() {
        System.out.println("getFecha_sustentacion");
        Tesis instance = new Tesis();
        Date expResult = null;
        Date result = instance.getFecha_sustentacion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha_sustentacion method, of class Tesis.
     */
    @Test
    public void testSetFecha_sustentacion() {
        System.out.println("setFecha_sustentacion");
        Date fecha_sustentacion = null;
        Tesis instance = new Tesis();
        instance.setFecha_sustentacion(fecha_sustentacion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha_registro method, of class Tesis.
     */
    @Test
    public void testGetFecha_registro() {
        System.out.println("getFecha_registro");
        Tesis instance = new Tesis();
        Date expResult = null;
        Date result = instance.getFecha_registro();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha_registro method, of class Tesis.
     */
    @Test
    public void testSetFecha_registro() {
        System.out.println("setFecha_registro");
        Date fecha_registro = null;
        Tesis instance = new Tesis();
        instance.setFecha_registro(fecha_registro);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Tesis.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Tesis instance = new Tesis();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Tesis.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        Tesis instance = new Tesis();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class Tesis.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        Tesis instance = new Tesis();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class Tesis.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        Tesis instance = new Tesis();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_director method, of class Tesis.
     */
    @Test
    public void testGetId_director() {
        System.out.println("getId_director");
        Tesis instance = new Tesis();
        int expResult = 0;
        int result = instance.getId_director();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_director method, of class Tesis.
     */
    @Test
    public void testSetId_director() {
        System.out.println("setId_director");
        int id_director = 0;
        Tesis instance = new Tesis();
        instance.setId_director(id_director);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarTesis method, of class Tesis.
     */
    @Test
    public void testRegistrarTesis() {
        System.out.println("registrarTesis");
        Tesis objTesis = null;
        boolean expResult = false;
        boolean result = Tesis.registrarTesis(objTesis);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
