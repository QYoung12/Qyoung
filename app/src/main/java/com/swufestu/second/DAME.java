package com.swufestu.second;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DAME extends AppCompatActivity {
    TextView ShowScore;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dame);
        ShowScore = (TextView) findViewById(R.id.ShowScore);
    }

    public  void click(View btn){
        if(btn.getId()==R.id.score3){
            score+=3;
        }else if(btn.getId() == R.id.score2){
            score+=2;
        }else{
            score++;
        }
        ShowScore.setText(String.valueOf(score));
        if(btn.getId()==R.id.reset){
            score=0;
            ShowScore.setText(String.valueOf(0));
        }
    }

}
