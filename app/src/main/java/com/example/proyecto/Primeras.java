package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Primeras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeras);
    }
    public void editar(View view){
        Intent in= new Intent(this,Editar_Producto.class);
        startActivity(in);
    }
    public void Inventario(View view){
        Intent iv= new Intent(this,Editar_Producto.class);
        startActivity(iv);
    }
    public void Agregar(View view){
        Intent itt= new Intent(this,Camara.class);
        startActivity(itt);
    }
    public void Ayuda(View view){
        Intent itt= new Intent(this,Ayuda.class);
        startActivity(itt);
    }
    public void Texto(View view){
        Intent itt= new Intent(this,Texto.class);
        startActivity(itt);
    }
}
