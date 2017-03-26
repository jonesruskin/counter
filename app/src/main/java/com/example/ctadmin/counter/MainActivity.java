package com.example.ctadmin.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {


                                       public void onClick(View v) {
                                           teamAScore = teamAScore + 3;
                                           TextView scoreView = (TextView) findViewById(R.id.textview3);
                                           scoreView.setText(String.valueOf(teamAScore));

                                       }
                                   }
        );

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                teamBScore = teamBScore + 3;
                TextView scoreView = (TextView) findViewById(R.id.textview4);
                scoreView.setText(String.valueOf(teamBScore));
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           teamAScore = teamAScore + 2;
                                           TextView scoreView = (TextView) findViewById(R.id.textview3);
                                           scoreView.setText(String.valueOf(teamAScore));

                                       }
                                   }
        );

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamBScore = teamBScore + 2;
                TextView scoreView = (TextView) findViewById(R.id.textview4);
                scoreView.setText(String.valueOf(teamBScore));
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           teamAScore = teamAScore + 1;
                                           TextView scoreView = (TextView) findViewById(R.id.textview3);
                                           scoreView.setText(String.valueOf(teamAScore));

                                       }
                                   }
        );

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamBScore = teamBScore + 1;
                TextView scoreView = (TextView) findViewById(R.id.textview4);
                scoreView.setText(String.valueOf(teamBScore));
            }
        });
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamAScore = 0;
                TextView scoreView = (TextView) findViewById(R.id.textview3);
                scoreView.setText(String.valueOf(teamAScore));
            }

        });


                Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                teamBScore = 0;
                TextView scoreView = (TextView) findViewById(R.id.textview4);
                scoreView.setText(String.valueOf(teamBScore));
            }

        });

    }
}