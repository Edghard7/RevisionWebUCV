/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class RevisionTest {
    
    public RevisionTest() {
    }

    /**
     * Test of getId_revision method, of class Revision.
     */
    @Test
    public void testGetId_revision() {
        System.out.println("getId_revision");
        Revision instance = new Revision();
        int expResult = 0;
        int result = instance.getId_revision();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_revision method, of class Revision.
     */
    @Test
    public void testSetId_revision() {
        System.out.println("setId_revision");
        int id_revision = 0;
        Revision instance = new Revision();
        instance.setId_revision(id_revision);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjAsignacion method, of class Revision.
     */
    @Test
    public void testGetObjAsignacion() {
        System.out.println("getObjAsignacion");
        Revision instance = new Revision();
        Asignacion expResult = null;
        Asignacion result = instance.getObjAsignacion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjAsignacion method, of class Revision.
     */
    @Test
    public void testSetObjAsignacion() {
        System.out.println("setObjAsignacion");
        Asignacion objAsignacion = null;
        Revision instance = new Revision();
        instance.setObjAsignacion(objAsignacion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentario method, of class Revision.
     */
    @Test
    public void testGetComentario() {
        System.out.println("getComentario");
        Revision instance = new Revision();
        String expResult = "";
        String result = instance.getComentario();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentario method, of class Revision.
     */
    @Test
    public void testSetComentario() {
        System.out.println("setComentario");
        String comentario = "";
        Revision instance = new Revision();
        instance.setComentario(comentario);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Revision.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Revision instance = new Revision();
        int expResult = 0;
        int result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Revision.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        int estado = 0;
        Revision instance = new Revision();
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValida method, of class Revision.
     */
    @Test
    public void testGetValida() {
        System.out.println("getValida");
        Revision instance = new Revision();
        String expResult = "";
        String result = instance.getValida();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValida method, of class Revision.
     */
    @Test
    public void testSetValida() {
        System.out.println("setValida");
        String valida = "";
        Revision instance = new Revision();
        instance.setValida(valida);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarRevision method, of class Revision.
     */
    @Test
    public void testRegistrarRevision() {
        System.out.println("registrarRevision");
        Revision obj = null;
        boolean expResult = false;
        boolean result = Revision.registrarRevision(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarRevision_cierre method, of class Revision.
     */
    @Test
    public void testRegistrarRevision_cierre() {
        System.out.println("registrarRevision_cierre");
        Revision obj = null;
        boolean expResult = false;
        boolean result = Revision.registrarRevision_cierre(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarFinRevision method, of class Revision.
     */
    @Test
    public void testRegistrarFinRevision() {
        System.out.println("registrarFinRevision");
        Revision obj = null;
        boolean expResult = false;
        boolean result = Revision.registrarFinRevision(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
