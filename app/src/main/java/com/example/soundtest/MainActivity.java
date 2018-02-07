package com.example.soundtest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /*
    Adding Audio Media to a Project Demo
    Demo'd by Varinder Sidhu

    INSTRUCTIONS:

    STEP 1:
    Create 'raw' folder in the 'res' directory
    ...\AndroidStudioProjects\SoundTest\app\src\main\res\raw

    STEP 2:
    Put desired audio files in newly created 'raw' folder

    STEP 3:
    Import MediaPlayer

    STEP 4:
    Create MediaPlayer object
    Pass in the current activity as the context
    Pass in the path to the media file you wish to play as the resid

    STEP 5:
    Call the play method on MediaPlayer object

    */

    // Create a MediaPlayer object
    private MediaPlayer ring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playCow(View v)
    {
        // stop media before starting another one
        stopPlaying();

        // set the context to the current activity and set the id to the id of name of the audio file(extension excluded)
        ring = MediaPlayer.create(MainActivity.this,R.raw.cow);

        // call the start method to play the ring
        ring.start();
    }

    public void playGoat(View v)
    {
        // stop media before starting another one
        stopPlaying();

        // set the context to the current activity and set the id to the id of name of the audio file(extension excluded)
        ring = MediaPlayer.create(MainActivity.this,R.raw.goat);

        // call the start method to play the ring
        ring.start();
    }

    public void playDog(View v)
    {
        // stop media before starting another one
        stopPlaying();

        // set the context to the current activity and set the id to the id of name of the audio file(extension excluded)
        ring = MediaPlayer.create(MainActivity.this,R.raw.dog);

        // call the start method to play the ring
        ring.start();
    }

    public void playRick(View v)
    {
        // stop media before starting another one
        stopPlaying();

        // set the context to the current activity and set the id to the id of name of the audio file(extension excluded)
        ring = MediaPlayer.create(MainActivity.this,R.raw.rick);

        // call the start method to play the ring
        ring.start();
    }

    // stops and clears the MediaPlayer
    private void stopPlaying() {
        if (ring != null) {
            ring.stop();
            ring.release();
            ring = null;
        }
    }
}
