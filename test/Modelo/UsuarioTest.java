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
public class UsuarioTest {
    
    public UsuarioTest() {
    }

    /**
     * Test of getId_usuario method, of class Usuario.
     */
    @Test
    public void testGetId_usuario() {
        System.out.println("getId_usuario");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getId_usuario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_usuario method, of class Usuario.
     */
    @Test
    public void testSetId_usuario() {
        System.out.println("setId_usuario");
        int id_usuario = 0;
        Usuario instance = new Usuario();
        instance.setId_usuario(id_usuario);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjPersona method, of class Usuario.
     */
    @Test
    public void testGetObjPersona() {
        System.out.println("getObjPersona");
        Usuario instance = new Usuario();
        Persona expResult = null;
        Persona result = instance.getObjPersona();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjPersona method, of class Usuario.
     */
    @Test
    public void testSetObjPersona() {
        System.out.println("setObjPersona");
        Persona objPersona = null;
        Usuario instance = new Usuario();
        instance.setObjPersona(objPersona);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClave method, of class Usuario.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getClave();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClave method, of class Usuario.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String clave = "";
        Usuario instance = new Usuario();
        instance.setClave(clave);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha_registro method, of class Usuario.
     */
    @Test
    public void testGetFecha_registro() {
        System.out.println("getFecha_registro");
        Usuario instance = new Usuario();
        Date expResult = null;
        Date result = instance.getFecha_registro();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha_registro method, of class Usuario.
     */
    @Test
    public void testSetFecha_registro() {
        System.out.println("setFecha_registro");
        Date fecha_registro = null;
        Usuario instance = new Usuario();
        instance.setFecha_registro(fecha_registro);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Usuario.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Usuario.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        Usuario instance = new Usuario();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class Usuario.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class Usuario.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        Usuario instance = new Usuario();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }
    
}
