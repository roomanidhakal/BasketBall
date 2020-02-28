package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int teamA_score, teamB_score;
    private TextView teamA_textView, teamB_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA_textView = findViewById(R.id.teamA_count);
        teamB_textView = findViewById(R.id.teamB_count);
    }

    //Team A
    public void update_A_3points(View view)
    {
        teamA_score = teamA_score + 3;
        displayScore_teamA(teamA_score);
    }

    public void update_A_2points(View view)
    {
        teamA_score = teamA_score + 2;
        displayScore_teamA(teamA_score);
    }

    public void update_A_1points(View view)
    {
        teamA_score = teamA_score + 1;
        displayScore_teamA(teamA_score);
    }

    public void displayScore_teamA(int score)
    {
        teamA_textView.setText(String.valueOf(score));
    }

    //Team B
    public void update_B_3points(View view)
    {
        teamB_score = teamB_score + 3;
        displayScore_teamB(teamB_score);
    }

    public void update_B_2points(View view)
    {
        teamB_score = teamB_score + 2;
        displayScore_teamB(teamB_score);
    }

    public void update_B_1points(View view)
    {
        teamB_score = teamB_score + 1;
        displayScore_teamB(teamB_score);
    }

    public void displayScore_teamB(int score)
    {
        teamB_textView.setText(String.valueOf(score));
    }

    //Reset
    public void resetScore(View view)
    {
        teamA_score = 0;
        teamB_score = 0;
        displayScore_teamA(teamA_score);
        displayScore_teamB(teamB_score);
    }
}
