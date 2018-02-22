 package com.example.android.rugbyscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void addFivePointsForTeamA(View V){
         teamAScore +=5;
         displayTeamAScore(teamAScore);
         Toast.makeText(this, R.string.TeamATry, Toast.LENGTH_SHORT).show();
     }

    public void addThreePointsForTeamA(View V){
        teamAScore +=3;
        displayTeamAScore(teamAScore);
        Toast.makeText(this, R.string.TeamAPen_Drop, Toast.LENGTH_SHORT).show();
    }
     public void addTwoPointsForTeamA(View V){
         teamAScore +=2;
         displayTeamAScore(teamAScore);
         Toast.makeText(this, R.string.TeamAConversion, Toast.LENGTH_SHORT).show();
     }

     public void addFivePointsForTeamB(View V){
         teamBScore +=5;
         displayTeamBScore(teamBScore);
         Toast.makeText(this, R.string.TeamBTry, Toast.LENGTH_SHORT).show();
     }
     public void addThreePoinstForTeamB(View V){
         teamBScore +=3;
         displayTeamBScore(teamBScore);
         Toast.makeText(this, R.string.TeamBPen_Drop, Toast.LENGTH_SHORT).show();
     }
     public void addTwoPointsForTeamB(View V){
         teamBScore +=2;
         displayTeamBScore(teamBScore);
         Toast.makeText(this, R.string.TeamBConversion, Toast.LENGTH_SHORT).show();
     }

     public void resetScoreToZero(View V){
         teamAScore = 0;
         teamBScore = 0;
         displayTeamAScore(teamAScore);
         displayTeamBScore(teamBScore);
     }
public void displayTeamAScore(int score){
     TextView viewTeamAScore = (TextView)findViewById(R.id.View_TeamA_Score);
     viewTeamAScore.setText(String.valueOf(score));
     }

     public void displayTeamBScore(int score){
     TextView viewTeamBScore = (TextView)findViewById(R.id.View_TeamB_Score);
     viewTeamBScore.setText(String.valueOf(score));
     }

 }
