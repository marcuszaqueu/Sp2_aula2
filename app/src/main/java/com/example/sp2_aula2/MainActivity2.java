    package com.example.sp2_aula2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

    public class MainActivity2 extends AppCompatActivity {
        TextView nome;

        private void criaObjeto(){
           nome = (TextView)findViewById(R.id.tvNome);
        }

        private void pegaNome() {
           Bundle b = getIntent().getExtras();
           nome.setText(nome.getText() + b.getString("nome"));
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        criaObjeto();
        pegaNome();

        nome = findViewById(R.id.edtNome);

    }
}