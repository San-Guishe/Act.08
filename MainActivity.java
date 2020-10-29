package com.example.basquetball_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //dos variables para puntaje (score)

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void a1Point(View view) { //adición de 1 punto
        scoreA = scoreA+1;
        display(scoreA);
    }

    private void display(int scoreA) { //pantalla de adición a 1 pnto
        TextView score_A = (TextView) findViewById(R.id.score_A);
        score_A.setText(""+scoreA);
    }

    public void a2Points(View view) {
        scoreA = scoreA+2;
        display(scoreA);
    }

    public void a3Points(View view) {
        scoreA = scoreA+3;
        display(scoreA);
    }

    //Puntajes en equipo B
    public void b1Point(View view) {
        scoreB = scoreB+1;
        displayB(scoreB);
    }

    private void displayB(int scoreB) {
        TextView score_B = (TextView) findViewById(R.id.socre_B);
        score_B.setText(""+scoreB);
    }

    public void b2Points(View view) {
        scoreB = scoreB+2;
        displayB(scoreB);
    }

    public void b3Points(View view) {
        scoreB = scoreB+3;
        displayB(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        display(scoreA);
        displayB(scoreB);
    }
}