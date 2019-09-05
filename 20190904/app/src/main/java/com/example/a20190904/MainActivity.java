package com.example.a20190904;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup grupo1,grupo2,grupo3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupo1 = findViewById(R.id.group1);
        grupo2 = findViewById(R.id.group2);
        grupo3 = findViewById(R.id.group3);
    }

    public void verificar(View view) {
        int id1 = grupo1.getCheckedRadioButtonId();
        int id2 = grupo2.getCheckedRadioButtonId();
        int id3 = grupo3.getCheckedRadioButtonId();

        int acertos = 0;

        if(id1 == R.id.radio1_1)
            acertos++;
        if (id2 == R.id.radio2_1)
            acertos++;
        if (id3 == R.id.radio3_1)
            acertos++;

        String frase = "";

        switch(acertos){
            case 0:
                frase = "Tente novamente";
                break;
            case 1:
                frase = "Continue tentando";
                break;
            case 2:
                frase = "Está quase lá";
                break;
            case 3:
                frase = "Muito bem";
                break;
        }

        Toast.makeText(this, frase, Toast.LENGTH_SHORT).show();
    }
}
