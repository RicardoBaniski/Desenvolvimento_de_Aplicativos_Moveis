package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {

    private EditText editDados;
    private EditText editLados;
    private TextView textSoma;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDados = findViewById(R.id.editDados);
        editLados = findViewById(R.id.editLados);
        textSoma = findViewById(R.id.textSoma);
    }

    public double calculaSoma() {
        double editDados = Double.parseDouble(editDados.getText().toString());
        double editLados = Double.parseDouble(editLados.getText().toString());
        double media = (nota1 + nota2 + nota3)/3;

        DecimalFormat df = new DecimalFormat("#0.00");
        String exibir = "Média aritmética = " + df.format(media);

        textMedia.setText(exibir);

        return media;
    }

    public int jogaDado(int n) {
        Random rand;
        return 1;
    }
}
