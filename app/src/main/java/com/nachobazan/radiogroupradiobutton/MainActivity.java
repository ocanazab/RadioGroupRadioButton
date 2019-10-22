package com.nachobazan.radiogroupradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText texto1,texto2;
    private TextView resultado;
    private RadioButton sumar,restar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto1=findViewById(R.id.primerValor);
        texto2=findViewById(R.id.segundoValor);
        resultado=findViewById(R.id.resultado);
        sumar=findViewById(R.id.r1);
        restar=findViewById(R.id.r2);
    }
    public void operar(View view){
        int numero1=Integer.parseInt(texto1.getText().toString());
        int numero2=Integer.parseInt(texto2.getText().toString());

        if (sumar.isChecked()){
            int suma=numero1+numero2;
            resultado.setText(String.valueOf(suma));
        }

        if (restar.isChecked()){
            int resta=numero1-numero2;
            resultado.setText(String.valueOf(resta));
        }

    }
}
