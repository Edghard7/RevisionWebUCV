package Modelo;

/**
 * @author 
 * @version 1.0
 * @created 28-may-2015 12:38:11 a.m.
 */
public class Facultad {

    private int id_facultad;
    private String nombre;
    private String valida; //Almacena el retorno de los procedimientos almacenados

    public Facultad(){

    }

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }

}//end Facultad