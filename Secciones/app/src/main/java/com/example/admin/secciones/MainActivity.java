package com.example.admin.secciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Item> MI_items = new ArrayList<Item>();

        ListView leftListView;

        MI_items.add(new SectionItem("Seccion 1 que apinas de la aplicacion movil en el aspecto de la interfaz te agrado",
           R.drawable.material_background3,R.layout.navigation_drawer,"admin@gmail.com"));

        MI_items.add(new EntryItem("Item 1", "Elemento 1.1"));

        MI_items.add(new EntryItem("Item 2", "Elemento 1.2"));

        MI_items.add(new EntryItem("Item 3", "This is item 1.3"));


        MI_items.add(new SectionItem(null,0,R.layout.navigation_drawer,"seccion"));

        MI_items.add(new EntryItem("Item 4", "Elemento 2.1"));

        MI_items.add(new EntryItem("Item 5", "Elemento 2.2"));

        MI_items.add(new EntryItem("Item 6", "Elemento 2.3"));


        //MI_items.add(new SectionItem("Seccion 3"));

        MI_items.add(new EntryItem("Item 7", "Elemento 3.1"));

        MI_items.add(new EntryItem("Item 8", "Elemento 3.2"));

        MI_items.add(new EntryItem("Item 9", "Elemento 3.3"));

        leftListView = (ListView) findViewById(R.id.List);

        leftListView.setDividerHeight(0);


        EntryAdapter adapter = new EntryAdapter(this, MI_items);

        leftListView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
