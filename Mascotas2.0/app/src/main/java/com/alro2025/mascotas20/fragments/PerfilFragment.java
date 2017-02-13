package com.alro2025.mascotas20.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alro2025.mascotas20.R;
import com.alro2025.mascotas20.adapter.PerfilAdaptador;
import com.alro2025.mascotas20.pojo.PerfilMascota;

import java.util.ArrayList;

import static com.alro2025.mascotas20.R.id.rvPerfil;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<PerfilMascota> contactos;
    private RecyclerView listaContactos;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaContactos = (RecyclerView) v.findViewById(rvPerfil);
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);
        listaContactos.setLayoutManager(glm);
        inicializaListaContactos();
        inicializaAdaptador();
        return v;
    }

    public PerfilAdaptador adaptador;
    public void inicializaAdaptador(){
        adaptador = new PerfilAdaptador(contactos, getActivity());
        listaContactos.setAdapter(adaptador);
    }



    public void inicializaListaContactos(){
        contactos = new ArrayList<PerfilMascota>();

        contactos.add(new PerfilMascota(R.drawable.salem, "SALEM", 5));
        contactos.add(new PerfilMascota(R.drawable.salem_2, "SALEM", 4));
        contactos.add(new PerfilMascota(R.drawable.salem_3, "SALEM", 8));
        contactos.add(new PerfilMascota(R.drawable.salem_4, "SALEM", 10));
        contactos.add(new PerfilMascota(R.drawable.salem_5, "SALEM", 6));
        contactos.add(new PerfilMascota(R.drawable.salem_6, "SALEM", 3));
        contactos.add(new PerfilMascota(R.drawable.salem_7, "SALEM", 7));
        contactos.add(new PerfilMascota(R.drawable.salem_8, "SALEM", 5));
        contactos.add(new PerfilMascota(R.drawable.salem_9, "SALEM", 11));



    }

}
