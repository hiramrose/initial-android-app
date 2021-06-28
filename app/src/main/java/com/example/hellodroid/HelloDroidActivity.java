package com.example.hellodroid;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HelloDroidActivity extends AppCompatActivity {
    private TextView mensaje;
    private int contador;
    private Button btnNueva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = findViewById(R.id.textoContador);
        ImageView avion = findViewById(R.id.avion_img);
        btnNueva = findViewById(R.id.btnLogin);

        avion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapIbero();
            }
        });

        btnNueva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirNuevaActividad();
            }
        });
    }

    public void tapIbero() {
        contador++;
        String contarComoTexto;
        switch(contador) {
            case 1:
                contarComoTexto = "una vez";
                break;
            default:
                contarComoTexto = String.format("%d veces", contador);
        }
        mensaje.setText(String.format("Has tocado el avioncito %s", contarComoTexto));
    }

    public void abrirNuevaActividad() {
        Intent nueva = new Intent(this, Activity2.class);
        startActivity(nueva);
    }
}