package com.example.app0210;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listCompras;
    private List<Item> itens;
    private AppDataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCompras = findViewById(R.id.listCompras);
        findViewById(R.id.btnNovoItem).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                novoItem();
            }
        });

        carregarDados();
    }

    private void carregarDados() {
        db = AppDataBase.getInstance(getApplicationContext());
        itens = db.itemDAO().getAll();
        adicionarNaLista();
    }

    private void adicionarNaLista() {
        ItemAdapter adapter = new ItemAdapter(getApplicationContext(), R.layout.compra_item, itens);
        listCompras.setAdapter(adapter);
    }

    private void novoItem() {
        Intent intent = new Intent(MainActivity.this, AddItemActivity.class);
        startActivity(intent);
    }
}
