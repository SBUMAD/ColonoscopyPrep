package sbu.mad.ColonoscopyPrep;

import java.util.concurrent.TimeUnit;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends ActionBarActivity {

    public TextView videoTitle;
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video = (VideoView)findViewById(R.id.videoView1);
        videoTitle = (TextView)findViewById(R.id.textView1);
        videoTitle.setText("Colonoscopy Prep Intro Video");
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.intro_video));

        video.setMediaController(new MediaController(this));
        video.start();
        video.requestFocus();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}