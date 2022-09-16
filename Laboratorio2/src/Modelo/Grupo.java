/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Grupo {
    public String id;
    public byte capacidad;
    public ArrayList<Horario> horarios;

    public Grupo() {
        horarios=new ArrayList<>();
    }

    public Grupo(String id, byte capacidad) {
        this.id = id;
        this.capacidad = capacidad;
        horarios=new ArrayList<>();
    }
    public void newHorario(String horaInicio,String horaFin, String salon){
        horarios.add(new Horario(horaInicio, horaFin, salon));
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(byte capacidad) {
        this.capacidad = capacidad;
    }
    
}
