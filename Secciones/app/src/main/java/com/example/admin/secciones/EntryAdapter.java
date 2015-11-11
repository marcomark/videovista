package com.example.admin.secciones;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 26/10/2015.
 */
public class EntryAdapter extends ArrayAdapter<Item> {

    private Context context;

    private ArrayList<Item> items;

    private LayoutInflater vi;

    public EntryAdapter(Context context,ArrayList<Item> items) {

        super(context,0, items);

        this.context = context;

        this.items = items;

        vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        final Item i = items.get(position);

        if (i != null) {

            if(i.isSection()){

                SectionItem si = (SectionItem)i;

                v = vi.inflate(si.getContenedor(), null);

                v.setOnClickListener(null);

                v.setOnLongClickListener(null);

                v.setLongClickable(false);

                final TextView sectionView = (TextView) v.findViewById(R.id.navigation_drawer_account_information_display_name);
                final ImageView sectionView1 = (ImageView)v.findViewById(R.id.navigation_drawer_user_account_picture_cover);
                final TextView sectionView2 = (TextView) v.findViewById(R.id.section_tex);

                sectionView2.setText(si.getTitulo());
                sectionView.setText(si.getNombre());
                sectionView1.setBackgroundResource(si.getFondo());
                sectionView1.getLayoutParams().height=0;
                //sectionView.setPadding(20,20,20,20);




            }
            if(i.isSection()){

            } else{

                EntryItem ei = (EntryItem)i;

                v = vi.inflate(R.layout.xml_item_entry, null);

                final TextView title = (TextView)v.findViewById(R.id.layout_item_entry_title);

                final TextView subtitle = (TextView)v.findViewById(R.id.layout_item_entry_summary);

                if (title != null)

                    title.setText(ei.title);

                if(subtitle != null)

                    subtitle.setText(ei.subtitle);

            }

        }

        return v;

    }

}