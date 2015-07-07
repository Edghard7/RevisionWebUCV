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
public class TipoPersonaTest {
    
    public TipoPersonaTest() {
    }

    /**
     * Test of getId_tipo_persona method, of class TipoPersona.
     */
    @Test
    public void testGetId_tipo_persona() {
        System.out.println("getId_tipo_persona");
        TipoPersona instance = new TipoPersona();
        int expResult = 0;
        int result = instance.getId_tipo_persona();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_tipo_persona method, of class TipoPersona.
     */
    @Test
    public void testSetId_tipo_persona() {
        System.out.println("setId_tipo_persona");
        int id_tipo_persona = 0;
        TipoPersona instance = new TipoPersona();
        instance.setId_tipo_persona(id_tipo_persona);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class TipoPersona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        TipoPersona instance = new TipoPersona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class TipoPersona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        TipoPersona instance = new TipoPersona();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class TipoPersona.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        TipoPersona instance = new TipoPersona();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class TipoPersona.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        TipoPersona instance = new TipoPersona();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarComboTipoPersona method, of class TipoPersona.
     */
    @Test
    public void testGetCargarComboTipoPersona() {
        System.out.println("getCargarComboTipoPersona");
        List<TipoPersona> expResult = null;
        List<TipoPersona> result = TipoPersona.getCargarComboTipoPersona();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
