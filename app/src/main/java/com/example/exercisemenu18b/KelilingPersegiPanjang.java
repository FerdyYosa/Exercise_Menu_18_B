package com.example.exercisemenu18b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KelilingPersegiPanjang extends AppCompatActivity {

    Button bttnKP;
    EditText edP, edP2;
    TextView hKP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi_panjang);
        edP = findViewById(R.id.edP);
        edP2 = findViewById(R.id.edP2);
        hKP = findViewById(R.id.hKP);
        bttnKP = findViewById(R.id.bttnKP);
        bttnKP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1, s2, s3;
                s1 = edP.getText().toString();
                s2 = edP2.getText().toString();
                double n1, n2, n3, n4;
                n1 = Double.parseDouble(s1);
                n2 = Double.parseDouble(s2);
                n3 = n1 + n2 + n1 + n2;
                hKP.setText("Keliling Persegi Panjang dengan panjang: " + n1 + " dan lebar " + n2 + " adalah: " + n3);
            }
        });
    }
}
