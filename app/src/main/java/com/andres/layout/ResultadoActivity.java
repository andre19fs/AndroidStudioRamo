package com.andres.layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultadoActivity extends AppCompatActivity {

    Button btnVolver;
    TextView tvNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_activity);

        btnVolver = findViewById(R.id.btnVolver);
        tvNombre = findViewById(R.id.tvNombre);

        Intent intent = getIntent();
        String nombreRecibido = intent.getStringExtra("nombre");

        if (nombreRecibido != null && !nombreRecibido.isEmpty()) {
            tvNombre.setText("Nombre de la foto: " + nombreRecibido);
        } else {
            tvNombre.setText("No se recibió ningún nombre");
        }

        btnVolver.setOnClickListener(v -> {
            Intent volverIntent = new Intent(ResultadoActivity.this, MainActivity.class);
            startActivity(volverIntent);
            finish();
        });
    }
}
