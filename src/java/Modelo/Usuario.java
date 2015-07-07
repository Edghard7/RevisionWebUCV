package Modelo;

import java.util.Date;

/**
 * @author 
 * @version 1.0
 * @created 28-may-2015 12:38:12 a.m.
 */
public class Usuario {

    private int id_usuario;
    private Persona objPersona = new Persona();
    private String nombre;
    private String clave;
    private Date fecha_registro;
    private int estado;
    private String valida; //Almacena el retorno de los procedimientos almacenados

    public Usuario(){

    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Persona getObjPersona() {
        return objPersona;
    }

    public void setObjPersona(Persona objPersona) {
        this.objPersona = objPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }
    
    
}//end Usuario