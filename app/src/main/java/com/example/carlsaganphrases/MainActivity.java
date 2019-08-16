package com.example.carlsaganphrases;

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

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "O universo não foi feito à medida do ser humano, mas tampouco lhe é adverso: é-lhe indiferente.",
                "O primeiro pecado da humanidade foi a fé; a primeira virtude foi a dúvida.",
                "E se o mundo não corresponde em todos os aspectos a nossos desejos, é culpa da ciência ou dos que querem impor seus desejos ao mundo?",
                "Um livro é a prova de que os homens são capazes de fazer magia.",
                "O cérebro é como um músculo. Quando pensamos bem, nos sentimos bem.",
                "A ausência da evidência não significa evidência da ausência.",
                "Se não existe vida fora da Terra, então o universo é um grande desperdício de espaço.",
                "Nós somos uma maneira do Cosmos de conhecer a si mesmo.",
                "Nós somos feitos de poeira de estrelas."
        };

        int numero = new Random().nextInt(frases.length);

        TextView texto = (TextView) findViewById(R.id.text_resultado);

        texto.setText(frases[numero]);

    }
}
