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
public class EsquemaTesisTest {
    
    public EsquemaTesisTest() {
    }

    /**
     * Test of getId_esquema method, of class EsquemaTesis.
     */
    @Test
    public void testGetId_esquema() {
        System.out.println("getId_esquema");
        EsquemaTesis instance = new EsquemaTesis();
        int expResult = 0;
        int result = instance.getId_esquema();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_esquema method, of class EsquemaTesis.
     */
    @Test
    public void testSetId_esquema() {
        System.out.println("setId_esquema");
        int id_esquema = 0;
        EsquemaTesis instance = new EsquemaTesis();
        instance.setId_esquema(id_esquema);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjTipoTesis method, of class EsquemaTesis.
     */
    @Test
    public void testGetObjTipoTesis() {
        System.out.println("getObjTipoTesis");
        EsquemaTesis instance = new EsquemaTesis();
        TipoTesis expResult = null;
        TipoTesis result = instance.getObjTipoTesis();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjTipoTesis method, of class EsquemaTesis.
     */
    @Test
    public void testSetObjTipoTesis() {
        System.out.println("setObjTipoTesis");
        TipoTesis objTipoTesis = null;
        EsquemaTesis instance = new EsquemaTesis();
        instance.setObjTipoTesis(objTipoTesis);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class EsquemaTesis.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        EsquemaTesis instance = new EsquemaTesis();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class EsquemaTesis.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        EsquemaTesis instance = new EsquemaTesis();
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class EsquemaTesis.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        EsquemaTesis instance = new EsquemaTesis();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class EsquemaTesis.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        EsquemaTesis instance = new EsquemaTesis();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class EsquemaTesis.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        EsquemaTesis instance = new EsquemaTesis();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class EsquemaTesis.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        EsquemaTesis instance = new EsquemaTesis();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarComboEsquemaTesis method, of class EsquemaTesis.
     */
    @Test
    public void testGetCargarComboEsquemaTesis() {
        System.out.println("getCargarComboEsquemaTesis");
        List<EsquemaTesis> expResult = null;
        List<EsquemaTesis> result = EsquemaTesis.getCargarComboEsquemaTesis();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
