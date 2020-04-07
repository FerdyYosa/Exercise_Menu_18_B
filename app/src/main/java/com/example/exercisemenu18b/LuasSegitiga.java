package com.example.exercisemenu18b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasSegitiga extends AppCompatActivity {
    Button bttnKP;
    EditText edP, edP2, edP3;
    TextView hKP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);
        edP = findViewById(R.id.edP);
        edP2 = findViewById(R.id.edP2);
        hKP = findViewById(R.id.hKP);
        bttnKP = findViewById(R.id.bttnKP);
        bttnKP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1, s2;
                s1 = edP.getText().toString();
                s2 = edP2.getText().toString();
                double n1, n2, n3;
                n1 = Double.parseDouble(s1);
                n2 = Double.parseDouble(s2);
                n3 = (n1 * n2)/2;
                hKP.setText("Luas Segitiga dengan alas: " + n1 + " , tinggi: " + n2 + " adalah: " + n3);
            }
        });
    }
}
