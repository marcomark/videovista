package com.example.admin.secciones;

/**
 * Created by admin on 26/10/2015.
 */
public class SectionItem implements Item{

    private final String nombre;
    private final String titulo;
    private final int fondo;
    private final int contenedor;

    public SectionItem(String nombre, int fonfo,int contenedor,String titulo) {

        this.nombre = nombre;
        this.fondo = fonfo;
        this.contenedor = contenedor;
        this.titulo = titulo;

    }

    public String getNombre(){
        return nombre;
    }
    public int getFondo(){
        return fondo;
    }
    public int getContenedor(){
        return contenedor;
    }
    public String getTitulo(){
        return titulo;
    }


    @Override

    public boolean isSection() {

        return true;

    }

}