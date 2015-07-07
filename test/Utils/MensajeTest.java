/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class MensajeTest {
    
    public MensajeTest() {
    }

    /**
     * Test of manejarError method, of class Mensaje.
     */
    @Test
    public void testManejarError_Exception_String() {
        System.out.println("manejarError");
        Exception e = null;
        String evento = "";
        Mensaje.manejarError(e, evento);
        fail("The test case is a prototype.");
    }

    /**
     * Test of manejarError method, of class Mensaje.
     */
    @Test
    public void testManejarError_String_String() {
        System.out.println("manejarError");
        String metodo = "";
        String evento = "";
        Mensaje.manejarError(metodo, evento);
        fail("The test case is a prototype.");
    }

    /**
     * Test of manejarError method, of class Mensaje.
     */
    @Test
    public void testManejarError_3args() {
        System.out.println("manejarError");
        String metodo = "";
        String evento = "";
        String razones = "";
        Mensaje.manejarError(metodo, evento, razones);
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarMensajeExito method, of class Mensaje.
     */
    @Test
    public void testGuardarMensajeExito_String_String() {
        System.out.println("guardarMensajeExito");
        String metodo = "";
        String evento = "";
        Mensaje.guardarMensajeExito(metodo, evento);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMensajeInfo method, of class Mensaje.
     */
    @Test
    public void testAddMensajeInfo() {
        System.out.println("addMensajeInfo");
        String mensaje = "";
        Mensaje.addMensajeInfo(mensaje);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMensajeFatal method, of class Mensaje.
     */
    @Test
    public void testAddMensajeFatal() {
        System.out.println("addMensajeFatal");
        String mensaje = "";
        Mensaje.addMensajeFatal(mensaje);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMensajeWarn method, of class Mensaje.
     */
    @Test
    public void testAddMensajeWarn() {
        System.out.println("addMensajeWarn");
        String mensaje = "";
        Mensaje.addMensajeWarn(mensaje);
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMensajeError method, of class Mensaje.
     */
    @Test
    public void testAddMensajeError() {
        System.out.println("addMensajeError");
        String mensaje = "";
        Mensaje.addMensajeError(mensaje);
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarMensajeExito method, of class Mensaje.
     */
    @Test
    public void testGuardarMensajeExito_String() {
        System.out.println("guardarMensajeExito");
        String metodo = "";
        Mensaje.guardarMensajeExito(metodo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of manejarError method, of class Mensaje.
     */
    @Test
    public void testManejarError_Exception() {
        System.out.println("manejarError");
        Exception e = null;
        Mensaje.manejarError(e);
        fail("The test case is a prototype.");
    }

    /**
     * Test of manejarError method, of class Mensaje.
     */
    @Test
    public void testManejarError_String() {
        System.out.println("manejarError");
        String metodo = "";
        Mensaje.manejarError(metodo);
        fail("The test case is a prototype.");
    }
    
}
