package com.andres.layout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText campo = findViewById(R.id.txtMensaje);
        TextView mensaje = findViewById(R.id.lblMensaje);
        Button btnEnviar = findViewById(R.id.btnCambiarColor);
        Button btnInvertir = findViewById(R.id.btnInvertir);

        //evento para cambiar el color del texto
        btnEnviar.setOnClickListener(v -> {
            String texto = campo.getText().toString();
            mensaje.setText(texto);

            int r = new Random().nextInt(256);
            int g = new Random().nextInt(256);
            int b = new Random().nextInt(256);
            int color = Color.rgb(r, g, b);
            mensaje.setTextColor(color);
        });

        btnInvertir.setOnClickListener(v -> {
            String Texto = mensaje.getText().toString();
            String TextoInvertido = new StringBuilder(Texto).reverse().toString();
            mensaje.setText(TextoInvertido);

        });

    }
}