package com.oskr.curso.curso_0909;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_main2(View v){
        Intent intent = new Intent(MainActivity.this,PerfilActivity.class);
        intent.putExtra("titulo","Menú de Configuración");
        startActivity(intent);
    }

    public void show_profile(View v){
        Intent intent = new Intent(MainActivity.this,PerfilActivity.class);
        intent.putExtra("titulo","Menú de Configuración");
        startActivity(intent);
    }
}
