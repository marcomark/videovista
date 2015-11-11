package com.example.admin.secciones;

/**
 * Created by admin on 10/11/2015.
 */
public class SecItem implements Item{

    private final String titulo;

    public SecItem(String titulo){
        this.titulo =titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public boolean isSection() {
        return true;
    }
}
