package com.example.layoutandintent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


public class ActivityTwo extends AppCompatActivity {
    VideoView simpleVideoView;
    MediaController mediaControls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        simpleVideoView = findViewById(R.id.simpleVideoView);

        if (mediaControls == null) {
            mediaControls = new MediaController((ActivityTwo.this));
            mediaControls.setAnchorView(simpleVideoView);
        }

        simpleVideoView.setMediaController(mediaControls);
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName()
                + "/" + R.raw.showcasedotkafka));

        simpleVideoView.setOnPreparedListener(mp -> {
            mp.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING);
            simpleVideoView.start();
        });

        simpleVideoView.setOnCompletionListener(mp -> Toast.makeText(getApplicationContext(), "Thank you...!!!", Toast.LENGTH_LONG).show());

        simpleVideoView.setOnErrorListener((mp, what, extra) -> {
            Toast.makeText(getApplicationContext(), "Opps Error occur while playing the video", Toast.LENGTH_LONG).show();
            return false;
        });
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            simpleVideoView.setRotation(0);
        } else {
            simpleVideoView.setRotation(90);
        }

        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) simpleVideoView.getLayoutParams();
        params.gravity = Gravity.CENTER;
        simpleVideoView.setLayoutParams(params);

    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}