package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;
import android.view.View;

import java.text.DecimalFormat;
import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {

    private EditText editN1;
    private EditText editN2;
    private EditText editN3;
    private TextView textMedia;
    private CheckBox checkboxMedia;
    private TextView textDesempenho;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editN1 = findViewById(R.id.editN1);
        editN2 = findViewById(R.id.editN2);
        editN3 = findViewById(R.id.editN3);
        checkboxMedia = findViewById(R.id.checkboxMedia);
        textMedia = findViewById(R.id.textMedia);
        textDesempenho=findViewById(R.id.textDesempenho);
    }

    public double calculaMediaAritmetica() {
        double nota1 = Double.parseDouble(editN1.getText().toString());
        double nota2 = Double.parseDouble(editN2.getText().toString());
        double nota3 = Double.parseDouble(editN3.getText().toString());
        double media = (nota1 + nota2 + nota3)/3;

        DecimalFormat df = new DecimalFormat("#0.00");
        String exibir = "Média aritmética = " + df.format(media);

        textMedia.setText(exibir);

        return media;
    }

    public double calculaMediaPonderada() {
        double nota1 = Double.parseDouble(editN1.getText().toString());
        double nota2 = Double.parseDouble(editN2.getText().toString());
        double nota3 = Double.parseDouble(editN3.getText().toString());
        double media = (nota1*1 + nota2*2 + nota3*3)/6;

        DecimalFormat df = new DecimalFormat("#0.00");
        String exibir = "Média ponderada = " + df.format(media);

        textMedia.setText(exibir);

        return media;
    }

    public void defineMedia(View view) {
        double media;
        if(checkboxMedia.isChecked() == true) {
            media = calculaMediaPonderada();
        } else {
            media = calculaMediaAritmetica();
        }
        desempenho(media);
    }

    public void desempenho(double media) {
        String exibir = "Desempenho: ";
        if(media >= 9.0) {
            exibir = exibir + "A";
        } else if(media >= 8.0) {
            exibir = exibir + "B";
        } else if(media >= 7.0) {
            exibir = exibir + "C";
        } else {
            exibir = exibir + "D";
        }
        textDesempenho.setText(exibir);
    }
}
