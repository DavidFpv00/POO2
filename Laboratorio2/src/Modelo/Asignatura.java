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
public class Asignatura {
    public String codigo,nombre;
    public short creditos;
    public ArrayList<Grupo> grupos;
    public ArrayList<Estudiante> estudiantes;

    public Asignatura() {
        this.grupos = new ArrayList<>();
        this.estudiantes= new ArrayList<>();
    }

    public Asignatura(String codigo, String nombre, short creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.grupos = new ArrayList<>();
        this.estudiantes= new ArrayList<>();
    }
    
    public void newEstudiante(String codigo, String nombre,String direccion,String genero,String correo){
        estudiantes.add(codigo,nombre,direccion,genero,correo);
    }

    public void newGrupo(String id, byte capacidad){
        grupos.add(new Grupo(id, capacidad));
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

    public short getCreditos() {
        return creditos;
    }

    public void setCreditos(short creditos) {
        this.creditos = creditos;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }
    
}
