package com.andres.layout;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    Button btnCargar;

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
        imageView = findViewById(R.id.imageView);
        btnCargar = findViewById(R.id.btnCargar);
        btnCargar.setOnClickListener((view) -> {
            cargarImagenEnHiloSecundario(btnCargar);
        });
    }

    private Bitmap loadImageFromNetwork(String urlString) {
        try {
            java.net.URL url = new java.net.URL(urlString);
            java.io.InputStream input = url.openStream();
            return android.graphics.BitmapFactory.decodeStream(input);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public void cargarImagenEnHiloSecundario(View view) {
        new Thread(() -> {
            final Bitmap bitmap = loadImageFromNetwork("https://www.advantour.com/img/japan/images/index.jpg");
            imageView.post(() -> {
                imageView.setImageBitmap(bitmap);
            });
        }).start();
    }
}