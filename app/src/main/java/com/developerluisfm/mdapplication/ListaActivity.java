package com.developerluisfm.mdapplication;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.developerluisfm.mdapplication.adapter.MascotaAdapter;
import com.developerluisfm.mdapplication.pojo.Mascota;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.mascotas);
        toolbar.setLogo(R.drawable.ic_marca);
        setSupportActionBar(toolbar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(lm);

        inicializarMascotas();
        MascotaAdapter mascotaAdapter = new MascotaAdapter(mascotas);
        listaMascotas.setAdapter(mascotaAdapter);

        FloatingActionButton bu = (FloatingActionButton) findViewById(R.id.fab);

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //finish();
    }

    public void inicializarMascotas(){

        Mascota mascota1 = new Mascota(1,"Tofi",1,R.drawable.p1,0);
        Mascota mascota2 = new Mascota(2,"Oreo",3,R.drawable.p2,2);
        Mascota mascota3 = new Mascota(3,"Black",2,R.drawable.p3,1);
        Mascota mascota4 = new Mascota(4,"Nii",6,R.drawable.p4,3);
        Mascota mascota5 = new Mascota(5,"Sisi",4,R.drawable.p5,4);

        mascotas = new ArrayList<Mascota>();

        mascotas.add(mascota1);
        mascotas.add(mascota2);
        mascotas.add(mascota3);
        mascotas.add(mascota4);
        mascotas.add(mascota5);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.contacto) {
            Intent intent = new Intent(getBaseContext(), ContactoActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.acerca) {
            Intent intent = new Intent(getBaseContext(), AcercaActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.action_favorite) {
            Intent intent = new Intent(getBaseContext(), FavoritosActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
