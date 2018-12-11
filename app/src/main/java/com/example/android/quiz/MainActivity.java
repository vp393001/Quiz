package com.example.android.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {

        RadioButton q1 = findViewById(R.id.q11);
        if (q1.isChecked())
            score++;

        EditText q2 = findViewById(R.id.q2);
        if (q2.getText().toString().trim().equals("5"))
            score++;

        CheckBox q31 = findViewById(R.id.q31);
        CheckBox q32 = findViewById(R.id.q32);
        CheckBox q33 = findViewById(R.id.q33);
        CheckBox q34 = findViewById(R.id.q34);
        if (q31.isChecked() && !q32.isChecked() && q33.isChecked() && !q34.isChecked())
            score++;

        RadioButton q4 = findViewById(R.id.q42);
        if (q4.isChecked())
            score++;

        EditText q5 = findViewById(R.id.q5);
        if (q5.getText().toString().trim().equals("2"))
            score++;

        if (score == 5) {
            Toast.makeText(this, "Excellent! All answers are correct!!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Your score is: " + score, Toast.LENGTH_SHORT).show();
        }

        score = 0;
    }

}
