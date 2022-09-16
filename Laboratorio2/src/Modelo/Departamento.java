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
public class Departamento {
    public String codigo,nombre,educacion;
    public ArrayList<Programa> programas;

    public Departamento() {
        programas=new ArrayList<>();
    }

    public Departamento(String codigo, String nombre, String educacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.educacion = educacion;
        programas=new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }
    
}
