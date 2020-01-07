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

    public void generateNewPhrase(View view) {

        String[] phrases = {
                "Science is not only compatible with spirituality; it is a profound source of spirituality.",
                "The nitrogen in our DNA, the calcium in our teeth, the iron in our blood, the carbon in our apple pies were made in the interiors of collapsing stars. We are made of starstuff.",
                "One glance at a book and you hear the voice of another person, perhaps someone dead for 1,000 years. To read is to voyage through time.",
                "If you wish to make an apple pie from scratch, you must first invent the universe.",
                "For me, it is far better to grasp the Universe as it really is than to persist in delusion, however satisfying and reassuring.",
                "Extraordinary claims require extraordinary evidence.",
                "For small creatures such as we the vastness is bearable only through love.",
                "Imagination will often carry us to worlds that never were, but without it we go nowhere.",
                "We are like butterflies who flutter for a day and think it is forever.",
                "The cosmos is within us. We are made of star-stuff. We are a way for the universe to know itself.",
                "It pays to keep an open mind, but not so open your brains fall out.",
                "Books permit us to voyage through time, to tap the wisdom of our ancestors."
        };

        int drawnIndex = new Random().nextInt(phrases.length);

        TextView text = (TextView) findViewById(R.id.result_text);

        text.setText(phrases[drawnIndex]);

    }
}
