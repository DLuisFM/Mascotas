package com.developerluisfm.mdapplication.present;


import android.content.Context;

import com.developerluisfm.mdapplication.db.ContructorDatos;
import com.developerluisfm.mdapplication.fragment.IListaFragment;
import com.developerluisfm.mdapplication.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by LuisFM on 11/06/16.
 */
public class ListaPresent implements IListaPresent {

    private Context context;
    private IListaFragment ilistaFragment;
    private ContructorDatos datos;
    private ArrayList<Mascota> mascotas;

    public ListaPresent(Context context, IListaFragment ilistaFragment){

        this.context = context;
        this.ilistaFragment = ilistaFragment;
        obtenrMascota();

    }

    @Override
    public void obtenrMascota() {
        datos = new ContructorDatos(context);
        mascotas = datos.obtenerMascotas();
        mostrarContactoRV();
    }

    @Override
    public void mostrarContactoRV() {
        ilistaFragment.iniciarAdaptador(ilistaFragment.crearAdaptador(mascotas));
        ilistaFragment.crearLineraLayout();
    }
}
