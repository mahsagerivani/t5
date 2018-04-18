package com.example.lavan32428068.t5;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button) findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView t1;
                t1=(TextView) findViewById(R.id.txt1);

                TextView t3;
                t3=(TextView) findViewById(R.id.txt3);
                Date date=new Date();
                int h=date.getHours();
                int m=date.getMinutes();
                String a=String.valueOf(h);
                t1.setText(a);

                String b=String.valueOf(m);
                t3.setText(b);
                MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.daghigheh);
                mediaPlayer.start();

            }



        });


    }
}