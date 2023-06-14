package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private Button btnsuma;
    private Button btnresta;
    private Button btndivision;
    private Button btnmulti;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btndivision = findViewById(R.id.btndivision);
        btnmulti = findViewById(R.id.btnmulti);
        resultado = findViewById(R.id.resultado);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suma();
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resta();
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                division();
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicacion();
            }
        });
    }

    private void suma() {
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());

        int resul = num1 + num2;

        resultado.setText(String.valueOf(resul));
    }

    private void resta() {
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());

        int resul = num1 - num2;

        resultado.setText(String.valueOf(resul));
    }

    private void division() {
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());

        int resul = num1 / num2;

        resultado.setText(String.valueOf(resul));
    }

    private void multiplicacion() {
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());

        int resul = num1 * num2;

        resultado.setText(String.valueOf(resul));
    }
}
