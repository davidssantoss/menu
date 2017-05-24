package com.example.david.cuadra;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements View.OnClickListener {
    Button Jugar, Opciones;
    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forma_principal);

        Jugar=(Button)findViewById(R.id.button);
        Opciones= (Button) findViewById(R.id.button2);
        texto = (TextView) findViewById(R.id.textView);
        Jugar.setOnClickListener(this);
        Opciones.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent=new Intent(this, Cuadrado.class);
                startActivity(intent);
                break;
            case R.id.button2:
                break;
            default:
                break;
        }

    }
}
