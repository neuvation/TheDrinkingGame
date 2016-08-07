package com.neuvation.thedrinkinggame;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class OpeningScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_screen);

        Button button = (Button)findViewById(R.id.button);

        VideoView VideoView1 = (VideoView)findViewById(R.id.videoView);

        String uriPath = "android.resource://com.neuvation.thedrinkinggame/"+R.raw.keepit;
        Uri uri = Uri.parse((uriPath));
        VideoView1.setVideoURI(uri);
        VideoView1.requestFocus();
        VideoView1.start();

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView VideoView1 = (VideoView) findViewById(R.id.videoView);
                String uriPath = "android.resource://com.neuvation.thedrinkinggame/"+R.raw.keepit;
                Uri uri1 = Uri.parse(uriPath);
                VideoView1.setVideoURI(uri1);
                VideoView1.requestFocus();
                VideoView1.start();
            }
        });
    }
}
