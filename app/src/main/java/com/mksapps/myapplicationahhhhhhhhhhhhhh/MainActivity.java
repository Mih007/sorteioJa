package com.mksapps.myapplicationahhhhhhhhhhhhhh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){
        TextView texto = findViewById(R.id.textoExibicao);

        int x = new Random().nextInt( 10);

        texto.setText("O número sorteado foi: " +x);
    }
}