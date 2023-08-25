package Lab6P2_LloydCooperr;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Consola {
    private String identificacion;
    private String fabricante;
    private int añosUso;
    private int precio;
    private ArrayList<Juego> juegos = new ArrayList();
    private String modelo;

    public Consola(String identificacion, String fabricante, int añosUso, int precio, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.añosUso = añosUso;
        this.precio = precio;
        this.modelo = modelo;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAñosUso() {
        return añosUso;
    }

    public void setAñosUso(int añosUso) {
        this.añosUso = añosUso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Consola{" + "identificacion=" + identificacion + ", fabricante=" + fabricante + ", a\u00f1osUso=" + añosUso + ", precio=" + precio + ", juegos=" + juegos + ", modelo=" + modelo + '}';
    }
    
    
}
