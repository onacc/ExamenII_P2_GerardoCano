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
public class Torneo {
    private String nombre;
    private ArrayList<Equipo> equipos = new ArrayList();
    private ArrayList<Partidas> partidos = new ArrayList();

    public ArrayList<Partidas> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partidas> partidos) {
        this.partidos = partidos;
    }
    

    public Torneo() {
    }

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
}
