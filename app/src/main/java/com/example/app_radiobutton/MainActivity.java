package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_val1);
        et2 = (EditText)findViewById(R.id.txt_val2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);
    }

    //metodo para el boton calcular

    public void Calcular(View view){

        String valor1_string = et1.getText().toString();
        String valor2_string = et2.getText().toString();

        int valor1_int = Integer.parseInt(valor1_string);
        int valor2_int = Integer.parseInt(valor2_string);

        if(rb1.isChecked()==true){
            int suma = valor1_int + valor2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if(rb2.isChecked()==true){
            int resta = valor1_int - valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else if(rb3.isChecked()==true){
            int multiplicacion = valor1_int * valor2_int;
            String resultado = String.valueOf(multiplicacion);
            tv1.setText(resultado);
        }else if(rb4.isChecked()==true){
            if(valor2_int != 0){
                int divicion = valor1_int / valor2_int;
                String resultado = String.valueOf(divicion);
                tv1.setText(resultado);
            }else{
                Toast.makeText(this, "No se puede dividir entre 0, da infinito", Toast.LENGTH_LONG).show();
            }

        }


    }
}
