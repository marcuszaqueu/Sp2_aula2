package com.example.sp2_aula2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNome1;
    Button btn2;
    //################
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         edtNome1 = findViewById(R.id.edtNome);
         btn2 = findViewById(R.id.btn_dois);

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Bundle b= new Bundle();
                b.putString("nome", edtNome1.getText().toString());
                Intent novatela = new Intent(MainActivity.this, MainActivity2.class);
                novatela.putExtras(b);
                startActivity(novatela);
            }
        });
    }
}