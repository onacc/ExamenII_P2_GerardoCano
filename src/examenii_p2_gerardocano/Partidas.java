/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Partidas {
    private String nombre1, nombre2;
    private int uno, dos;

    public Partidas() {
    }

    public Partidas(String nombre1, String nombre2, int uno, int dos) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.uno = uno;
        this.dos = dos;
    }
    
    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }
    

}
