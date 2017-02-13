package com.alro2025.mascotas20.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.alro2025.mascotas20.R;
import com.alro2025.mascotas20.pojo.PerfilMascota;

import java.util.ArrayList;

/**
 * Created by kikipo on 13/02/2017.
 */

public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder> {

    ArrayList<PerfilMascota> contactos;
    Activity activity;

    public PerfilAdaptador(ArrayList<PerfilMascota> contactos, Activity activity){
        this.contactos = contactos;
        this.activity = activity;
    }


    @Override
    public PerfilAdaptador.PerfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cvperfil, parent, false);
        return new PerfilViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(final PerfilViewHolder perfilViewHolder, int position) {
        final PerfilMascota perfilMascota = contactos.get(position);

        perfilViewHolder.imgFoto2.setImageResource(perfilMascota.getFoto2());
        perfilViewHolder.tvNombreCV2.setText(perfilMascota.getNombre2());
        perfilViewHolder.tvNumeroLikeCV2.setText(Integer.toString(perfilMascota.getNumlikes2()));

    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public static class PerfilViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto2;
        private TextView tvNombreCV2;
        private ImageButton btnLike2;
        private TextView tvNumeroLikeCV2;
        private ImageView imgLike2;

        public PerfilViewHolder(View itemView) {
            super(itemView);
            imgFoto2 = (ImageView) itemView.findViewById(R.id.imgFoto2);
            tvNombreCV2 = (TextView) itemView.findViewById(R.id.tvNombreCV2);
            btnLike2 = (ImageButton) itemView.findViewById(R.id.btnLike2);
            tvNumeroLikeCV2 = (TextView) itemView.findViewById(R.id.tvNumeroLikeCV2);
            imgLike2 = (ImageView) itemView.findViewById(R.id.imgLike2);
        }
    }
}
