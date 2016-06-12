package com.developerluisfm.mdapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developerluisfm.mdapplication.R;
import com.developerluisfm.mdapplication.adapter.MascotaAdapter;
import com.developerluisfm.mdapplication.adapter.MascotaAdapterPerfil;
import com.developerluisfm.mdapplication.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    private GridLayoutManager lLayout;
    ArrayList<Mascota> mascotas;
    RecyclerView listaMascotas;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);



        listaMascotas = (RecyclerView) view.findViewById(R.id.rvMascotas);
        lLayout = new GridLayoutManager(container.getContext(), 3);
        listaMascotas.setHasFixedSize(true);
        listaMascotas.setLayoutManager(lLayout);


        inicializarMascotas();
        MascotaAdapterPerfil mascotaAdapter = new MascotaAdapterPerfil(mascotas);
        listaMascotas.setAdapter(mascotaAdapter);


        return view;
    }



    public void inicializarMascotas(){

        Mascota mascota1 = new Mascota(1,"Tofi",1,R.drawable.p1,0);
        Mascota mascota2 = new Mascota(2,"Oreo",3,R.drawable.p1,2);
        Mascota mascota3 = new Mascota(3,"Black",2,R.drawable.p1,1);
        Mascota mascota4 = new Mascota(4,"Nii",6,R.drawable.p1,3);
        Mascota mascota5 = new Mascota(5,"Sisi",4,R.drawable.p1,4);

        mascotas = new ArrayList<Mascota>();

        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(mascota3);
        mascotas.add(mascota4);
        mascotas.add(mascota5);

    }


}
