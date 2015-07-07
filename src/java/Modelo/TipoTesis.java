package Modelo;

/**
 *
 * @author 
 */
public class TipoTesis {
    private int id_formato;
    private String nombre;
    private String valida; //Almacena el retorno de los procedimientos almacenados

    public TipoTesis() {
    }

    public int getId_formato() {
        return id_formato;
    }

    public void setId_formato(int id_formato) {
        this.id_formato = id_formato;
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
    
    
}
