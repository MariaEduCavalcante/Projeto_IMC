package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    EditText edit1, edit2;
    TextView resultado, resultadoNum;
    RadioButton fem,masc;
    double peso = 0.0;
    double altura = 0.0;
    boolean sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.peso);
        edit2 = findViewById(R.id.altura);
        resultado = findViewById(R.id.txtresultado);
        resultadoNum = findViewById(R.id.txtresultado2);
        fem = findViewById(R.id.btnfem);
        masc = findViewById(R.id.btnmasc);
    }

    public void Calcula(View view) {

        peso = Double.parseDouble(edit1.getText().toString());
        altura = Double.parseDouble(edit2.getText().toString());

        double result = peso/(altura*altura);
        resultadoNum.setText(Double.valueOf(result).toString());

        if(fem.isChecked()){
            if(result < 20){
                    resultado.setText("Abaixo do peso normal");
                } else if(result >= 20 && result <= 24.9) {
                    resultado.setText("Normal");
                } else if(result >= 25 && result <= 29.9){
                    resultado.setText("Obesidade Leve");
                } else if(result >= 30 && result <= 39.9) {
                    resultado.setText("Obesidade Moderada");
                } else if(result >= 43) {
                    resultado.setText("Obesidade Mórbida");
                }
        }
        else if(masc.isChecked() == false && fem.isChecked() == true){
                if(result < 19){
                    resultado.setText("Abaixo do peso normal");
                } else if(result >= 19 && result <= 23.9) {
                    resultado.setText("Normal");
                } else if(result >= 24 && result <= 28.9){
                    resultado.setText("Obesidade Leve");
                } else if(result >= 29 && result <= 38.9) {
                    resultado.setText("Obesidade Moderada");
                } else if(result >= 39) {
                    resultado.setText("Obesidade Mórbida");
                }
        }
    }
}
