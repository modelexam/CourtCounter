package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

int teamAScore = 0;
int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }

    /**
     * Displays the given score for Team A.
     */
    public void addThreeforTeamA(View V){
        teamAScore = teamAScore + 3 ;
        displayForTeamA(teamAScore);
    }
    public void addTwoforTeamA(View V){
        teamAScore = teamAScore + 2 ;
        displayForTeamA(teamAScore);
    }
    public void addoneforTeamA(View V){
        teamAScore = teamAScore + 1 ;
        displayForTeamA(teamAScore);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeforTeamB(View V){
        teamBScore = teamBScore + 3 ;
        displayForTeamB(teamBScore);
    }
    public void addTwoforTeamB(View V){
        teamBScore = teamBScore + 2 ;
        displayForTeamB(teamBScore);
    }
    public void addoneforTeamB(View V){
        teamBScore = teamBScore + 1 ;
        displayForTeamB(teamBScore);
    }
    public void resetButton(View V){
        teamBScore = 0 ;
        teamAScore = 0 ;
        displayForTeamB(teamBScore);
        displayForTeamA(teamAScore);

    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
