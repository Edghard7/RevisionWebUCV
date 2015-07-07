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
public class PersonaFuncionTest {
    
    public PersonaFuncionTest() {
    }

    /**
     * Test of getFunciones method, of class PersonaFuncion.
     */
    @Test
    public void testGetFunciones() {
        System.out.println("getFunciones");
        PersonaFuncion instance = new PersonaFuncion();
        String expResult = "";
        String result = instance.getFunciones();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFunciones method, of class PersonaFuncion.
     */
    @Test
    public void testSetFunciones() {
        System.out.println("setFunciones");
        String funciones = "";
        PersonaFuncion instance = new PersonaFuncion();
        instance.setFunciones(funciones);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado_d method, of class PersonaFuncion.
     */
    @Test
    public void testGetEstado_d() {
        System.out.println("getEstado_d");
        PersonaFuncion instance = new PersonaFuncion();
        String expResult = "";
        String result = instance.getEstado_d();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado_d method, of class PersonaFuncion.
     */
    @Test
    public void testSetEstado_d() {
        System.out.println("setEstado_d");
        String estado_d = "";
        PersonaFuncion instance = new PersonaFuncion();
        instance.setEstado_d(estado_d);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_persona_funcion method, of class PersonaFuncion.
     */
    @Test
    public void testGetId_persona_funcion() {
        System.out.println("getId_persona_funcion");
        PersonaFuncion instance = new PersonaFuncion();
        int expResult = 0;
        int result = instance.getId_persona_funcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_persona_funcion method, of class PersonaFuncion.
     */
    @Test
    public void testSetId_persona_funcion() {
        System.out.println("setId_persona_funcion");
        int id_persona_funcion = 0;
        PersonaFuncion instance = new PersonaFuncion();
        instance.setId_persona_funcion(id_persona_funcion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjPersona method, of class PersonaFuncion.
     */
    @Test
    public void testGetObjPersona() {
        System.out.println("getObjPersona");
        PersonaFuncion instance = new PersonaFuncion();
        Persona expResult = null;
        Persona result = instance.getObjPersona();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjPersona method, of class PersonaFuncion.
     */
    @Test
    public void testSetObjPersona() {
        System.out.println("setObjPersona");
        Persona objPersona = null;
        PersonaFuncion instance = new PersonaFuncion();
        instance.setObjPersona(objPersona);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjFuncion method, of class PersonaFuncion.
     */
    @Test
    public void testGetObjFuncion() {
        System.out.println("getObjFuncion");
        PersonaFuncion instance = new PersonaFuncion();
        Funcion expResult = null;
        Funcion result = instance.getObjFuncion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjFuncion method, of class PersonaFuncion.
     */
    @Test
    public void testSetObjFuncion() {
        System.out.println("setObjFuncion");
        Funcion objFuncion = null;
        PersonaFuncion instance = new PersonaFuncion();
        instance.setObjFuncion(objFuncion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class PersonaFuncion.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        PersonaFuncion instance = new PersonaFuncion();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class PersonaFuncion.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        PersonaFuncion instance = new PersonaFuncion();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class PersonaFuncion.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        PersonaFuncion instance = new PersonaFuncion();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class PersonaFuncion.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        PersonaFuncion instance = new PersonaFuncion();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarPersonaFuncion method, of class PersonaFuncion.
     */
    @Test
    public void testGetCargarPersonaFuncion() {
        System.out.println("getCargarPersonaFuncion");
        int id_persona = 0;
        ArrayList<PersonaFuncion> expResult = null;
        ArrayList<PersonaFuncion> result = PersonaFuncion.getCargarPersonaFuncion(id_persona);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarFuncion method, of class PersonaFuncion.
     */
    @Test
    public void testRegistrarFuncion() {
        System.out.println("registrarFuncion");
        PersonaFuncion obj = null;
        boolean expResult = false;
        boolean result = PersonaFuncion.registrarFuncion(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarFuncion method, of class PersonaFuncion.
     */
    @Test
    public void testActualizarFuncion() {
        System.out.println("actualizarFuncion");
        PersonaFuncion obj = null;
        boolean expResult = false;
        boolean result = PersonaFuncion.actualizarFuncion(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarFunciones method, of class PersonaFuncion.
     */
    @Test
    public void testGetCargarFunciones() {
        System.out.println("getCargarFunciones");
        int persona = 0;
        ArrayList<Funcion> expResult = null;
        ArrayList<Funcion> result = PersonaFuncion.getCargarFunciones(persona);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargarFunciones_ method, of class PersonaFuncion.
     */
    @Test
    public void testGetCargarFunciones_() {
        System.out.println("getCargarFunciones_");
        int persona = 0;
        PersonaFuncion expResult = null;
        PersonaFuncion result = PersonaFuncion.getCargarFunciones_(persona);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
