package com.alro2025.mascotas20;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.alro2025.mascotas20.adapter.ContactoAdaptador;
import com.alro2025.mascotas20.pojo.ContactoMascota;

import java.util.ArrayList;

import static com.alro2025.mascotas20.R.id.rvContactos;

public class ranking extends AppCompatActivity {

    ArrayList<ContactoMascota> contactos;
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);



        listaContactos = (RecyclerView) findViewById(rvContactos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaContactos.setLayoutManager(llm);
        inicializaListaContactos();
        inicializarAdaptador();
        }




    public ContactoAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new ContactoAdaptador(contactos, this);
        listaContactos.setAdapter(adaptador);
    }

    public void inicializaListaContactos() {

        contactos = new ArrayList<ContactoMascota>();
        contactos.add(new ContactoMascota(R.drawable.burro, "BURRO", 5));
        contactos.add(new ContactoMascota(R.drawable.frank_mib, "FRANK", 7));
        contactos.add(new ContactoMascota(R.drawable.garfield, "GARFIELD", 6));
        contactos.add(new ContactoMascota(R.drawable.perry, "PERRY", 8));
        contactos.add(new ContactoMascota(R.drawable.salem, "SALEM", 10));

    }





}
