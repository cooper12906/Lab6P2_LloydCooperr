package Lab6P2_LloydCooperr;

public class Portatil extends Consola {
    private String tamañoPantalla;
    private String bateria;
    private boolean tieneEstuche;

    public Portatil(String tamañoPantalla, String bateria, boolean tieneEstuche, String identificacion, String fabricante, int añosUso, int precio, String modelo) {
        super(identificacion, fabricante, añosUso, precio, modelo);
        this.tamañoPantalla = tamañoPantalla;
        this.bateria = bateria;
        this.tieneEstuche = tieneEstuche;
    }
    
    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public boolean isTieneEstuche() {
        return tieneEstuche;
    }

    public void setTieneEstuche(boolean tieneEstuche) {
        this.tieneEstuche = tieneEstuche;
    }
}
