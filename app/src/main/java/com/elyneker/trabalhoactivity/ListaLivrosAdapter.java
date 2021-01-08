package com.elyneker.trabalhoactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListaLivrosAdapter extends ArrayAdapter<Livro> {
    private Context context;
    private int auxResource;

    public ListaLivrosAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Livro> objects) {
        super(context, resource, objects);
        this.context = context;
        auxResource = resource;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       int id = getItem(position).getId();
        String titulo = getItem(position).getTitulo();
       String autor = getItem(position).getAutor();

       Livro livro = new Livro(id, titulo, autor);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(auxResource, parent, false);

        TextView textTitulo = (TextView) convertView.findViewById(R.id.textItem);
        TextView textCodigo = (TextView) convertView.findViewById(R.id.textCodigo);
        TextView textAutor = (TextView) convertView.findViewById(R.id.textAutor);

        textTitulo.setText(titulo);
        //textCodigo.setText(id);
        textAutor.setText(autor);

        return convertView;
    }
}
