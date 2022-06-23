package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.peso);
        edit2 = findViewById(R.id.altura);
        resultado = findViewById(R.id.txtresultado);
    }
    int n1, n2;

    public void Calcula(View view) {
        n1 = Integer.parseInt(edit1.getText().toString());
        n2 = Integer.parseInt(edit2.getText().toString());

        int result = n1 + n2;

        resultado.setText(Integer.valueOf(result).toString());
    }
}