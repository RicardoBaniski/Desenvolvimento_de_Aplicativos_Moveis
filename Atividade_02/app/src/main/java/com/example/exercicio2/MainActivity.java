package com.example.atividade_02;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText editDadosNum;
    private EditText editLadosNum;
    private TextView textSoma;
    private ListView listLado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDadosNum = findViewById(R.id.editDadosNum);
        editLadosNum = findViewById(R.id.editLadosNum);
        textSoma = findViewById(R.id.textSoma);
        listLado = findViewById(R.id.listLado);

    }

    public void num_lancamento(View view){
        int max = Integer.parseInt(editDadosNum.getText().toString());
        ArrayList<Integer> lados = new ArrayList<Integer>();
        int soma = 0;
        for (int i = 1;i<= max;i++){
            int lado = resultDado();
            lados.add(lado);
            soma = soma + lado;

        }
        String resultSoma = Integer.toString(soma);
        textSoma.setText(resultSoma);
        ArrayAdapter<Integer>  arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, lados);
        listLado.setAdapter(arrayAdapter);
    }

    public int resultDado(){
        int max = Integer.parseInt(editLadosNum.getText().toString());
        int min = 1;
        Random aleatorio = new Random();
        int result = aleatorio.nextInt((max - min) + 1) + min;
        return result;


    }
}
