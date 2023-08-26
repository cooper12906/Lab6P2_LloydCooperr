package Lab6P2_LloydCooperr;

public class Estacionaria extends Consola {
    private int numeroControles;
    private int almacenamiento;
    private String tipoConexion;

    public Estacionaria(int numeroControles, int almacenamiento, String tipoConexion, String identificacion, String fabricante, int añosUso, int precio, String modelo) {
        super(identificacion, fabricante, añosUso, precio, modelo);
        this.numeroControles = numeroControles;
        this.almacenamiento = almacenamiento;
        this.tipoConexion = tipoConexion;
    }
    
    public int getNumeroControles() {
        return numeroControles;
    }

    public void setNumeroControles(int numeroControles) {
        this.numeroControles = numeroControles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }  
}
