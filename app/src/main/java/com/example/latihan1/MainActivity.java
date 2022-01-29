package com.example.latihan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {
    //variabel
    public MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soundplay();
        //pengaturan splashscreen
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(3000);//artinya 3 detik
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(MainActivity.this,activity_mainlogin.class));
                    finish();
                }
            }
        };
        thread.start();
    }

    public void soundplay(){
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        player=MediaPlayer.create(this,R.raw.suaraburung);
        player.setLooping(false);
        player.start();
    }
}
