package com.example.homework2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context context;
    private ArrayList<fuente> listItems;

    public Adaptador(Context context, ArrayList<fuente> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        fuente Item = (fuente) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.list_layout, null);
        TextView nombre = (TextView) convertView.findViewById(R.id.lnombre);
        TextView apellido = (TextView) convertView.findViewById(R.id.lapellido);
        TextView correo = (TextView) convertView.findViewById(R.id.lcorreo);

        nombre.setText(Item.getNombre());
        apellido.setText(Item.getApellido());
        correo.setText(Item.getCorreo());


        return convertView;
    }
}

