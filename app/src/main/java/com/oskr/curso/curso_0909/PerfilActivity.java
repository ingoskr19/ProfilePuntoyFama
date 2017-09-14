package com.oskr.curso.curso_0909;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class PerfilActivity extends AppCompatActivity {
    private Spinner listTipoConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getDataIntent();
        init();
    }

    public void getDataIntent(){
        Intent intent = getIntent();
        String titulo = intent.getStringExtra("titulo");
        setTitle(titulo);
    }

    private void init(){
        listTipoConfig = (Spinner) findViewById(R.id.perfil_activity_redessociales);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,R.array.redes,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listTipoConfig.setAdapter(adapter);
        listTipoConfig.setSelection(0);
        listTipoConfig.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) parent.getSelectedItem();
                if(!"".equals(item.trim()))
                    Toast.makeText(PerfilActivity.this, "Iniciando Sincronización con "+ item, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
