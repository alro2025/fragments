package com.alro2025.mascotas20.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alro2025.mascotas20.R;
import com.alro2025.mascotas20.adapter.ContactoAdaptador;
import com.alro2025.mascotas20.pojo.ContactoMascota;

import java.util.ArrayList;

import static com.alro2025.mascotas20.R.id.rvContactos;

/**
 * Created by kikipo on 12/02/2017.
 */

public class RVFragment extends Fragment {

    ArrayList<ContactoMascota> contactos;
    private RecyclerView listaContactos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_rv, container, false);

        listaContactos = (RecyclerView) v.findViewById(rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaContactos.setLayoutManager(llm);
        inicializaListaContactos();
        inicializaAdaptador();
        return  v;
    }

    public ContactoAdaptador adaptador;
    public void inicializaAdaptador(){
        adaptador = new ContactoAdaptador(contactos, getActivity());
        listaContactos.setAdapter(adaptador);



    }

    public void inicializaListaContactos(){
        contactos = new ArrayList<ContactoMascota>();
        contactos.add(new ContactoMascota(R.drawable.burro, "BURRO", 0));
        contactos.add(new ContactoMascota(R.drawable.dino, "DINO", 0));
        contactos.add(new ContactoMascota(R.drawable.frank_mib, "FRANK", 0));
        contactos.add(new ContactoMascota(R.drawable.garfield, "GARFIELD", 0));
        contactos.add(new ContactoMascota(R.drawable.perry, "PERRY", 0));
        contactos.add(new ContactoMascota(R.drawable.pluto, "PLUTO", 0));
        contactos.add(new ContactoMascota(R.drawable.salem, "SALEM", 0));
        contactos.add(new ContactoMascota(R.drawable.scooby_doo, "SCOOBY-DOO", 0));


    }




}
