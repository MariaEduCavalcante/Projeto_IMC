package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.peso);
        edit2 = findViewById(R.id.altura);
        resultado = findViewById(R.id.txtresultado);
        fem = findViewById(R.id.btnfem);
        masc = findViewById(R.id.btnmasc);
    }

    EditText edit1, edit2;
    TextView resultado;
    RadioButton fem,masc;

    public void Calcula(View view) {

        int n1 = Integer.parseInt(edit1.getText().toString());
        int n2 = Integer.parseInt(edit2.getText().toString());

        int result = n1/(n2*n1);

        if(fem == true){
            result =
        }
        else{

        }
        resultado.setText(Integer.valueOf(result).toString());
    }

}