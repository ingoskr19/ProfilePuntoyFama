package com.oskr.curso.curso_0909;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Spinner listTipoConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getDataIntent();
        init();
    }

    public void getDataIntent(){
        Intent intent = getIntent();
        String titulo = intent.getStringExtra("titulo");
        setTitle(titulo);
    }

    private void init(){
        listTipoConfig = (Spinner) findViewById(R.id.activity2_spinner_propiedades);
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
                Toast.makeText(Main2Activity.this, item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
