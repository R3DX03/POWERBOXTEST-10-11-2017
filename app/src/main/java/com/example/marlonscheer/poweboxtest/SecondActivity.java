package com.example.marlonscheer.poweboxtest;

import android.content.Intent;
import android.icu.util.TimeUnit;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public ProgressBar pg2;    //ProgressBar pb1
    private int status = 0;     //Status von pb1
    private Handler handler = new Handler();
    private ProgressBar pp;
    private Button show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        new Thread(new Runnable() {
            @Override
            public void run() {
                pg2 = (ProgressBar) findViewById(R.id.pb1); //pg2 wird zu pb1
                handler.post(new Runnable() {  //pg2 wird Visible gemacht
                    @Override
                    public void run() {
                        pg2.setVisibility(View.VISIBLE);
                    }
                });

                while (status < 100){    //While-Schleife mit Stocken in der pb (insgesamt 4 mal)
                    status++;
                    android.os.SystemClock.sleep(40);


                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            pg2.setProgress(status); //Erhöhter Status der pb wird aktualsiert
                        }
                    });

                }
            }
        }).start();


        show = (Button) findViewById(R.id.ShowBoxes);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });


    }
}
