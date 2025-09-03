package com.andres.layout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    RadioGroup radioGroup;
    ProgressBar progressBar;
    RatingBar ratingBar;
    Spinner spinner;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ratingBar), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        progressBar = findViewById(R.id.progressBar);
        ratingBar = findViewById(R.id.ratingBar);
        spinner = findViewById(R.id.spinner);
        recyclerView = findViewById(R.id.recyclerView);

        
        String[] animales = {"perro", "gato", "pajaro"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, animales);
        spinner.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> lista = new ArrayList<>();
        lista.add("pez");
        lista.add("loro");
        lista.add("lobo");
        recyclerView.setAdapter(new Recycler(lista));


        checkBox.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, "CheckBox: " + isChecked, Toast.LENGTH_SHORT).show());

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton rb = findViewById(checkedId);
            Toast.makeText(this, "Radio : " + rb.getText(), Toast.LENGTH_SHORT).show();
        });

        ratingBar.setOnRatingBarChangeListener((ratingBar1, rating, fromUser) ->
                Toast.makeText(this, "estrella: " + rating, Toast.LENGTH_SHORT).show());
    }
}