package com.elyneker.trabalhoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listaLivros = (ListView) findViewById(R.id.listView);

        Livro l1 = new Livro(1, "Matemática", "Não sei");
        Livro l2 = new Livro(2, "História", "Não sei");
        Livro l3 = new Livro(3, "Português", "Não sei");
        Livro l4 = new Livro(4, "Artes", "Não sei");

        ArrayList<Livro> liv = new ArrayList<>();
        liv.add(l1);
        liv.add(l2);
        liv.add(l3);
        liv.add(l4);

        ListaLivrosAdapter adapter = new ListaLivrosAdapter(this, R.layout.adapter_view_layout, liv);
        listaLivros.setAdapter(adapter);

    }
}