package com.example.raneem_hwmockup;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // tannie.setOnClickListener(new OnClickListener()
        //{
         //   @Override
         //   public void onClick(View v) {
          //      MediaPlayer player = new MediaPlayer();
          //      player = MediaPlayer.create(this, R.raw.yeontanie);
          //      player.start();
          //      player.pause();
          //  }
       // });

    }
    MediaPlayer mediaPlayer;

    public void playSoundFile(Integer yeontanBark){
        mediaPlayer = MediaPlayer.create(this, R.raw.yeontanie);
        mediaPlayer.start();
    }

}