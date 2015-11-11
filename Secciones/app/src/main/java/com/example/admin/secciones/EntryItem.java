package com.example.admin.secciones;

/**
 * Created by admin on 26/10/2015.
 */
public class EntryItem implements Item{

    public final String title;

    public final String subtitle;

    public EntryItem(String title, String subtitle) {

        this.title = title;

        this.subtitle = subtitle;

    }

    @Override

    public boolean isSection() {

        return false;

    }

}