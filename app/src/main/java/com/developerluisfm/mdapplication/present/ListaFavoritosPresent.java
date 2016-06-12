package com.developerluisfm.mdapplication.present;

import android.content.Context;

import com.developerluisfm.mdapplication.db.ContructorDatos;
import com.developerluisfm.mdapplication.fragment.IListaFragment;
import com.developerluisfm.mdapplication.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by LuisFM on 12/06/16.
 */
public class ListaFavoritosPresent implements IListaPresent {

    private Context context;
    private IListaFragment ilistaFragment;
    private ContructorDatos datos;
    private ArrayList<Mascota> mascotas;

    @Override
    public void obtenrMascota() {
        this.context = context;
        this.ilistaFragment = ilistaFragment;
        obtenrMascota();
    }

    @Override
    public void mostrarContactoRV() {
        ilistaFragment.iniciarAdaptador(ilistaFragment.crearAdaptador(mascotas));
        ilistaFragment.crearLineraLayout();
    }
}
