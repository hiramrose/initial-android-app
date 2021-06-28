package com.example.hellodroid;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    private Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnVolver = findViewById(R.id.btnRegresar);
        ImageView imgE = findViewById(R.id.a2img);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regresarOtraActividad();
            }
        });

        imgE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Algo salió mal.",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void regresarOtraActividad() {
        Intent regresa = new Intent(getApplicationContext(),HelloDroidActivity.class);
        startActivity(regresa);
    }
}