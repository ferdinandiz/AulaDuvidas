package com.fer.auladuvidas;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ClassePrincipal extends AppCompatActivity {
    EditText edVal1, edVal2;
    ListView listView;
    Button btnInserir;
    ArrayList<CDZ> valores;
    int contadorPrioritarioMaior = 3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edVal1 = findViewById(R.id.edVal1);
        edVal2 = findViewById(R.id.edVal2);
        listView = findViewById(R.id.listView);
        btnInserir = findViewById(R.id.btnInserir);

        valores = new ArrayList<>();
        valores.add(new CDZ("Albáfica","Peixes","1"));
        valores.add(new CDZ("Seiya","Pegasus","2"));

        ArrayCustom arrayCustom = new ArrayCustom(this,R.layout.lista_cdz,valores);
        listView.setAdapter(arrayCustom);

        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edVal1.getText().toString().isEmpty() && !edVal2.getText().toString().isEmpty()){
                    CDZ cavaleiro = new CDZ(edVal1.getText().toString(),
                                            edVal2.getText().toString(),
                                            String.valueOf(contadorPrioritarioMaior));
                    contadorPrioritarioMaior ++;
                    valores.add(cavaleiro);
                    listView.setAdapter(arrayCustom);
                }
            }
        });

    }
}
