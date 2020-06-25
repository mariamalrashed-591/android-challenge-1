package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.icu.text.RelativeDateTimeFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    boolean Xturn = true;
    TextView turn;
    int [] Xarray = new int [9];
    int [] Oarray = new int [9];
    TextView results;
    boolean win = false;
    int xscore=0;
    int oscore= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button zero = findViewById(R.id.button0);
        final Button one = findViewById(R.id.button1);
        final Button two = findViewById(R.id.button2);
        final Button three = findViewById(R.id.button3);
        final Button four = findViewById(R.id.button4);
        final Button five = findViewById(R.id.button5);
        final Button six = findViewById(R.id.button6);
        final Button seven = findViewById(R.id.button7);
        final Button eight = findViewById(R.id.button8);
        final Button reset = findViewById(R.id.reset);
        final Button scores = findViewById(R.id.scores);
        results = findViewById(R.id.results);
        turn = findViewById(R.id.textView);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                win=false;
                zero.setText("");
                one.setText("");
                two.setText("");
                three.setText("");
                four.setText("");
                five.setText("");
                six.setText("");
                seven.setText("");
                eight.setText("");
                results.setText("");
                turn.setText("");
                zero.setBackgroundColor(Color.WHITE);
                one.setBackgroundColor(Color.WHITE);
                two.setBackgroundColor(Color.WHITE);
                three.setBackgroundColor(Color.WHITE);
                four.setBackgroundColor(Color.WHITE);
                five.setBackgroundColor(Color.WHITE);
                six.setBackgroundColor(Color.WHITE);
                seven.setBackgroundColor(Color.WHITE);
                eight.setBackgroundColor(Color.WHITE);
                results.setBackgroundColor(Color.WHITE);
                turn.setBackgroundColor(Color.WHITE);

                for (int i= 0 ;i <Xarray.length;i++){
                    Xarray[i] = 0;
                }
                for (int i= 0 ;i<Oarray.length;i++) {
                    Oarray[i] = 0;
                }

            }
        });



        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[0]= 1;
                   checkXwin();
                    zero.setBackgroundColor(Color.parseColor("#ffb6b9"));
                    Xturn = false;
                    zero.setText("X");

                }

                else {
                    Oarray [0]= 1;
                    check0win();
                    zero.setBackgroundColor(Color.parseColor("#61c0bf"));
                    zero.setText("O");
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[1]= 1;
                   checkXwin();
                    one.setBackgroundColor(Color.parseColor("#ffb6b9"));
                    Xturn = false;
                    one.setText("X");

                }

                else {
                    Oarray [1]= 1;
                    check0win();
                    one.setBackgroundColor(Color.parseColor("#61c0bf"));
                    one.setText("O");
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[2]= 1;
                   checkXwin();
                    two.setBackgroundColor(Color.parseColor("#ffb6b9"));
                    Xturn = false;
                    two.setText("X");

                }

                else {
                    Oarray [2]= 1;
                    check0win();
                    two.setBackgroundColor(Color.parseColor("#61c0bf"));
                    two.setText("O");
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[3]= 1;
                    checkXwin();
                    three.setBackgroundColor(Color.parseColor("#ffb6b9"));
                    Xturn = false;
                    three.setText("X");

                }

                else {
                    Oarray [3]= 1;
                    check0win();
                    three.setBackgroundColor(Color.parseColor("#61c0bf"));
                    three.setText("O");
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[4]= 1;
                   checkXwin();
                    four.setBackgroundColor(Color.parseColor("#ffb6b9"));
                    Xturn = false;
                    four.setText("X");

                }

                else {
                    Oarray [4]= 1;
                    check0win();
                    four.setBackgroundColor(Color.parseColor("#61c0bf"));
                    four.setText("O");
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[5]= 1;
                    checkXwin();
                    five.setBackgroundColor(Color.parseColor("#ffb6b9"));
                    Xturn = false;
                    five.setText("X");

                }

                else {
                    Oarray [5]= 1;
                    check0win();
                    five.setBackgroundColor(Color.parseColor("#61c0bf"));
                    five.setText("O");
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[6]= 1;
                    checkXwin();
                    six.setBackgroundColor(Color.parseColor("#ffb6b9"));
                    Xturn = false;
                    six.setText("X");

                }

                else {
                    Oarray [6]= 1;
                    check0win();
                    six.setBackgroundColor(Color.parseColor("#61c0bf"));
                    six.setText("O");
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[7]= 1;
                    checkXwin();
                    seven.setBackgroundColor(Color.parseColor("#ffb6b9"));
                    Xturn = false;
                    seven.setText("X");

                }

                else {
                    Oarray [7]= 1;
                    check0win();
                    seven.setBackgroundColor(Color.parseColor("#61c0bf"));
                    seven.setText("O");
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[8]= 1;
                    checkXwin();
                    eight.setBackgroundColor(Color.parseColor("#ffb6b9"));
                    Xturn = false;
                    eight.setText("X");

                }

                else {
                    Oarray [8]= 1;
                    check0win();
                    eight.setBackgroundColor(Color.parseColor("#61c0bf"));
                    eight.setText("O");
                }
            }
        });




    }
    public void checkXwin() {
        Xturn = false;
        turn.setText("0 turn");
        turn.setBackgroundColor(Color.parseColor("#61c0bf"));

        if((Xarray[0]== 1 && Xarray[1]==1 && Xarray[2]==1)||
                (Xarray[3]== 1 && Xarray[4]==1 && Xarray[5]==1)||
                (Xarray[6]== 1 && Xarray[7]==1 && Xarray[8]==1)||
                (Xarray[0]== 1 && Xarray[3]==1 && Xarray[6]==1)||
                (Xarray[1]== 1 && Xarray[4]==1 && Xarray[7]==1)||
                (Xarray[2]== 1 && Xarray[5]==1 && Xarray[8]==1)||
                (Xarray[0]== 1 && Xarray[4]==1 && Xarray[8]==1)||
                (Xarray[2]== 1 && Xarray[4]==1 && Xarray[6]==1))
        {
            results.setText(String.format("X won"));
            results.setBackgroundColor(Color.parseColor("#ffb6b9"));
            win = true;
            xscore++;
            //Toast.makeText(MainActivity .this,"X won", Toast.LENGTH_LONG).show();
        }
        if(!win)
            results.setText(String.format("NONE!"));

    }
    public void check0win() {
        Xturn = true;
        turn.setText("X turn");
        turn.setBackgroundColor(Color.parseColor("#ffb6b9"));

        if((Oarray[0]== 1 && Oarray[1]==1 && Oarray[2]==1)||
                (Oarray[3]== 1 && Oarray[4]==1 && Oarray[5]==1)||
                (Oarray[6]== 1 && Oarray[7]==1 && Oarray[8]==1)||
                (Oarray[0]== 1 && Oarray[3]==1 && Oarray[6]==1)||
                (Oarray[1]== 1 && Oarray[4]==1 && Oarray[7]==1)||
                (Oarray[2]== 1 && Oarray[5]==1 && Oarray[8]==1)||
                (Oarray[0]== 1 && Oarray[4]==1 && Oarray[8]==1)||
                (Oarray[2]== 1 && Oarray[4]==1 && Oarray[6]==1))
        {
            results.setText(String.format("O won"));
            results.setBackgroundColor(Color.parseColor("#61c0bf"));
            win = true;
            oscore++;
            //Toast.makeText(MainActivity .this,"X won", Toast.LENGTH_LONG).show();
        }
        if(!win)
            results.setText(String.format("NONE!"));
    }

    // Called when the user taps the Scores button
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Button scores = (Button) findViewById(R.id.scores);
       intent.putExtra(EXTRA_MESSAGE,xscore);
        intent.putExtra(EXTRA_MESSAGE, oscore);

        startActivity(intent);
        // Do something in response to button
    }
}