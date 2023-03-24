/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_gerardocano;

import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Deporte {
    private ArrayList<Torneo> torneos = new ArrayList();
    private String periodo, nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Deporte(String periodo, String nombre) {
        this.periodo = periodo;
        this.nombre = nombre;
    }
    

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Deporte{" + "torneos=" + torneos + ", periodo=" + periodo + '}';
    }

    public Deporte(String periodo) {
        this.periodo = periodo;
    }
    public Deporte(){
    }
}
